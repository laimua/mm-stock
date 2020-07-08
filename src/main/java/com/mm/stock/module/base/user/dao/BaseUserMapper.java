/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午4:17:01
 * @version V1.0.0
 */
package com.mm.stock.module.base.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.mm.stock.module.base.user.model.BaseUser;

/**
  * @ClassName: BaseUserMapper
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午4:17:01
  *
  */
@Repository
public interface BaseUserMapper {
    
    int deleteById(@Param("userId") String userId);

    int insert(BaseUser record);

    BaseUser selectById(@Param("userId") String userId);
    
    List<BaseUser> selectUserList(BaseUser record);

    int updateById(BaseUser record);
}