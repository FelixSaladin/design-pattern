package biz.ezcom.design.pattern.chainofresponsibility3;

/**
 * html 转义 >
 */
public final class GtFilter implements IFilter {
    /** 转义前实体 */
    private static final String SOURCE = ">";
    /** 转义后实体 */
    private static final String TARGET = "&gt;";

    public GtFilter() {}

    @Override()
    public void doFilter(final Request request, final Response response, final FilterChain chain) {
        request.setRequest(request.getRequest().replaceAll(GtFilter.SOURCE, GtFilter.TARGET));
        chain.doFilter(request, response, chain);
        response.setResponse(response.getResponse().replaceAll(GtFilter.TARGET, GtFilter.SOURCE));
    }
}
