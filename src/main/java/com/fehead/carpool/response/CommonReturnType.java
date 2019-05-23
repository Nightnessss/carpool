package com.fehead.carpool.response;

/**
 * @author lmwis on 2019-01-31 12:36
 */
public class CommonReturnType {
    //表明对应请求的返回处理结果"success"或"fail"
    private String status;

    //若status==success，则data内返回前端需要的json数据
    //若status==fail，则data内使用通用的错误码格式    为了让前端获取到有意义的错误信息
    private Object data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object data){
        return CommonReturnType.create(data,"success");
    }
    public static CommonReturnType create(Object data,String status){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setData(data);
        commonReturnType.setStatus(status);
        return commonReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
