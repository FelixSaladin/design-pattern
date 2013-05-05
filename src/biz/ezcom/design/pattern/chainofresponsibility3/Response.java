package biz.ezcom.design.pattern.chainofresponsibility3;

/** 返回 */
public final class Response {
    /** 返回信息 */
    private String response;

    public Response() {}

    public String getResponse() {
        return this.response;
    }

    public void setResponse(final String response) {
        this.response = response;
    }
}
