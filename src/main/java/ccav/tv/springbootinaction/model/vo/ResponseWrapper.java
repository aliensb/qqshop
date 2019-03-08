package ccav.tv.springbootinaction.model.vo;

import org.springframework.web.util.pattern.PathPattern;

import java.util.Map;

public class ResponseWrapper {

    public final static String OK_CODE="00";
    public final static String BAD_CODE="01";
    public final static String OK_MSG="success";
    public final static String BAD_MSG="fail";
    private String code;
    private String msg;
    private Map context;

    public ResponseWrapper() {
    }

    public ResponseWrapper(String code, String msg, Map context) {
        this.code = code;
        this.msg = msg;
        this.context = context;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map getContext() {
        return context;
    }

    public void setContext(Map context) {
        this.context = context;
    }
}
