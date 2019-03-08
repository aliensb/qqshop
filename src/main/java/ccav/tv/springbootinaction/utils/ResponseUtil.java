package ccav.tv.springbootinaction.utils;

import ccav.tv.springbootinaction.model.vo.ResponseWrapper;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
    public static ResponseWrapper responseOk(Object data){
        ResponseWrapper responseWrapper=new ResponseWrapper();
        Map context=new HashMap<>();
        context.put("data",data);
        responseWrapper.setCode(ResponseWrapper.OK_CODE);
        responseWrapper.setMsg(ResponseWrapper.OK_MSG);
        responseWrapper.setContext(context);
        return responseWrapper;
    }

}
