package com.mm.stock.module.base.user.dao;

import org.springframework.stereotype.Repository;

import com.mm.stock.module.base.user.model.User;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);
}
