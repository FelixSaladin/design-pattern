package biz.ezcom.design.pattern.chainofresponsibility3;

/**
 * html 转义 空格
 */
public final class NbspFilter implements IFilter {
    /** 转义前实体 */
    private static final String SOURCE = " ";
    /** 转义后实体 */
    private static final String TARGET = "&nbsp;";

    public NbspFilter() {}

    @Override()
    public void doFilter(final Request request, final Response response, final FilterChain chain) {
        request.setRequest(request.getRequest().replaceAll(NbspFilter.SOURCE, NbspFilter.TARGET));
        chain.doFilter(request, response, chain);
        response.setResponse(response.getResponse().replaceAll(NbspFilter.TARGET, NbspFilter.SOURCE));
    }
}
