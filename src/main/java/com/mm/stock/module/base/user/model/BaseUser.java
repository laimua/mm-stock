/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午4:17:56
 * @version V1.0.0
 */
package com.mm.stock.module.base.user.model;

import java.io.Serializable;
import java.util.Date;

/**
  * @ClassName: BaseUser
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午4:17:56
  *
  */
public class BaseUser implements Serializable {

    private static final long serialVersionUID = 1L;
    //用户ID
    private String userId;
    //登录名称
    private String userNameLogin;
    //账号密码
    private String userPassword;
    //真实姓名
    private String userNameReal;
    //年龄
    private Integer userAge;
    //电话
    private String userPhone;
    //邮箱
    private String userEmail;
    //创建时间
    private Date userCtime;
    //修改时间
    private Date userMtime;
    //账号状态
    private Integer userStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserNameLogin() {
        return userNameLogin;
    }

    public void setUserNameLogin(String userNameLogin) {
        this.userNameLogin = userNameLogin == null ? null : userNameLogin.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserNameReal() {
        return userNameReal;
    }

    public void setUserNameReal(String userNameReal) {
        this.userNameReal = userNameReal == null ? null : userNameReal.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserCtime() {
        return userCtime;
    }

    public void setUserCtime(Date userCtime) {
        this.userCtime = userCtime;
    }

    public Date getUserMtime() {
        return userMtime;
    }

    public void setUserMtime(Date userMtime) {
        this.userMtime = userMtime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}