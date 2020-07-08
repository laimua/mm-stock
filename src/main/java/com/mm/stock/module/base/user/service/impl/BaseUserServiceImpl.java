/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午4:51:56
 * @version V1.0.0
 */
package com.mm.stock.module.base.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.mm.stock.module.base.user.dao.BaseUserMapper;
import com.mm.stock.module.base.user.model.BaseUser;
import com.mm.stock.module.base.user.service.BaseUserService;

/**
  * @ClassName: BaseUserServiceImpl
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午4:51:56
  *
  */
@Service
@RefreshScope
public class BaseUserServiceImpl implements BaseUserService, InitializingBean{
    
    @Value("${spring.fileUpload.imagePath}")
    private String imagePath;
    
    @Value("${spring.fileUpload.rootPath}")
    private String configPath;
    
    private String fullPath;
    
    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public int deleteById(String userId) {
        return baseUserMapper.deleteById(userId);
    }

    @Override
    public int insert(BaseUser record) {
        return baseUserMapper.insert(record);
    }

    @Override
    public BaseUser selectById(String userId) {
        return baseUserMapper.selectById(userId);
    }

    @Override
    public List<BaseUser> selectUserList(BaseUser record) {
        System.out.println(fullPath);
        return baseUserMapper.selectUserList(record);
    }

    @Override
    public int updateById(BaseUser record) {
        return baseUserMapper.updateById(record);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        fullPath = this.imagePath + this.configPath + "/aaaa/";
    }

}
