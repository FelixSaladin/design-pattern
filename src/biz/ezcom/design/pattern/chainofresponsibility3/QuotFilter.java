package biz.ezcom.design.pattern.chainofresponsibility3;

/**
 * html 转义 "
 */
public final class QuotFilter implements IFilter {
    /** 转义前实体 */
    private static final String SOURCE = "\"";
    /** 转义后实体 */
    private static final String TARGET = "&quot;";

    public QuotFilter() {}

    @Override()
    public void doFilter(final Request request, final Response response, final FilterChain chain) {
        request.setRequest(request.getRequest().replaceAll(QuotFilter.SOURCE, QuotFilter.TARGET));
        chain.doFilter(request, response, chain);
        response.setResponse(response.getResponse().replaceAll(QuotFilter.TARGET, QuotFilter.SOURCE));
    }
}
