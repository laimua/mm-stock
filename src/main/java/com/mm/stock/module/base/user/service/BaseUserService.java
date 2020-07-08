/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午4:15:31
 * @version V1.0.0
 */
package com.mm.stock.module.base.user.service;

import java.util.List;

import com.mm.stock.module.base.user.model.BaseUser;

/**
  * @ClassName: BaseUserService
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午4:15:31
  *
  */
public interface BaseUserService {
    
    int deleteById(String userId);

    int insert(BaseUser record);

    BaseUser selectById(String userId);
    
    List<BaseUser> selectUserList(BaseUser record);

    int updateById(BaseUser record);

}
