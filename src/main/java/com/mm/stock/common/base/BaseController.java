/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年4月28日 下午5:52:57
 * @version V1.0.0
 */
package com.mm.stock.common.base;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  * @ClassName: BaseController
  * @Description: TODO
  * @author Meng1
  * @date 2020年4月28日 下午5:52:57
  *
  */
public class BaseController {
    
    protected static final Integer CODE_200 = 200;
    
    protected static final String MSG_200 = "请求成功";
    
    protected static final Integer CODE_400 = 400;
    
    protected static final String MSG_400 = "请求失败";
    
    protected static final Integer CODE_404 = 404;
    
    protected static final String MSG_404 = "未发现资源";
    
    protected static final Integer CODE_500 = 500;
    
    protected static final String MSG_500 = "服务器错误";
    
    protected Logger log;
    
    protected SysResult result;
    
    public BaseController() {
        super();
        result = null;
        this.log = LoggerFactory.getLogger(getClass());
    }
    
    protected SysResult getResult() {
        return getResult(null);
    }
    
    protected SysResult getResult(Object data) {
        return getResult(CODE_200, data);
    }
    
    protected SysResult getResult(Integer code, Object data) {
        return getResult(code, getMsg(code), data);
    }
    
    protected SysResult getResult(Integer code, String msg, Object data) {
        result = new SysResult(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    private static Map<String, String> CODE_MSG_MAP = new HashMap<>();
    
    static {
        CODE_MSG_MAP.put(CODE_200.toString(), MSG_200);
        CODE_MSG_MAP.put(CODE_400.toString(), MSG_400);
        CODE_MSG_MAP.put(CODE_404.toString(), MSG_404);
        CODE_MSG_MAP.put(CODE_500.toString(), MSG_500);
    }
    
    /**
      * @Title: getMsg
      * @Description: 根据code获取msg
      * @param code
      * @return
      */
    protected static String getMsg(Integer code) {
        return CODE_MSG_MAP.get(code.toString());
    }
    
    

}
