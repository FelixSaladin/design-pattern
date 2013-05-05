package biz.ezcom.design.pattern.chainofresponsibility3;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Request request = new Request();
        final String requestMsg = "<font color=\"red\">request:I love you;</font>";
        request.setRequest(requestMsg);
        //
        final Response response = new Response();
        final String responseMsg = "&lt;font&nbsp;color=&quot;red&quot;&gt;response:I&nbsp;love&nbsp;you;&lt;/font&gt;";
        response.setResponse(responseMsg);
        //
        final FilterChain chain1 = new FilterChain();
        chain1.addFilter(new NbspFilter());
        chain1.addFilter(new GtFilter());
        chain1.addFilter(new LtFilter());
        chain1.addFilter(new QuotFilter());
        chain1.process(request, response, chain1);
        chain1.process(request, response, chain1);
        //
        System.out.println("request before : " + requestMsg);
        System.out.println("request after : " + request.getRequest());
        System.out.println("response before : " + responseMsg);
        System.out.println("response after : " + response.getResponse());
    }
}
