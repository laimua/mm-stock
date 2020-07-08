/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年4月28日 下午5:46:01
 * @version V1.0.0
 */
package com.mm.stock.common.base;

import com.alibaba.fastjson.JSONObject;

/**
  * @ClassName: SysResult
  * @Description: TODO
  * @author Meng1
  * @date 2020年4月28日 下午5:46:01
  *
  */
public class SysResult extends JSONObject{
    
    /**
      * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
      */
    private static final long serialVersionUID = 1L;

    private int code;
    
    private String msg;
    
    private Object data;
    
    

    public SysResult() {
        super();
    }

    public SysResult(int code) {
        super();
        this.code = code;
    }

    public SysResult(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public SysResult(int code, String msg, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    

}
