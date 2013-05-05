package biz.ezcom.design.pattern.chainofresponsibility3;

/** 请求 */
public final class Request {
    /** 请求信息 */
    private String request;

    public Request() {}

    public String getRequest() {
        return this.request;
    }

    public void setRequest(final String request) {
        this.request = request;
    }
}
