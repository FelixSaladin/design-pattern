package biz.ezcom.design.pattern.chainofresponsibility2;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final String msg = new String("<font color=\"red\">I love you;</font>");
        System.out.println("before : " + msg);
        final FilterChain chain1 = new FilterChain();
        chain1.addFilter(new GtFilter());
        //
        final FilterChain chain2 = new FilterChain();
        chain2.addFilter(new NbspFilter());
        chain2.addFilter(new QuotFilter());
        chain1.addFilter(chain2);
        //
        chain1.addFilter(new LtFilter());
        chain1.doFilter(msg);
    }
}
