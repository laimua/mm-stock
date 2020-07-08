/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午4:13:28
 * @version V1.0.0
 */
package com.mm.stock.module.base.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.stock.module.base.user.model.BaseUser;
import com.mm.stock.module.base.user.service.BaseUserService;

/**
  * @ClassName: BaseUserController
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午4:13:28
  *
  */
@RestController
@RequestMapping("/user")
public class BaseUserController {
    
    @Autowired
    private BaseUserService baseUserService;

    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody BaseUser record) {
        return baseUserService.deleteById(record.getUserId());
    }

    @RequestMapping("/insert")
    public int insert(@RequestBody BaseUser record) {
        return baseUserService.insert(record);
    }

    @RequestMapping("/selectById")
    public BaseUser selectById(@RequestBody BaseUser record) {
        return baseUserService.selectById(record.getUserId());
    }

    @RequestMapping("/selectUserList")
    public List<BaseUser> selectUserList(@RequestBody BaseUser record) {
        return baseUserService.selectUserList(record);
    }

    @RequestMapping("/updateById")
    public int updateById(@RequestBody BaseUser record) {
        return baseUserService.updateById(record);
    }

}
