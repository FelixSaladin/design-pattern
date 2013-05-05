package biz.ezcom.design.pattern.chainofresponsibility2;

/**
 * html 转义 “
 */
public final class QuotFilter implements IFilter {
    public QuotFilter() {}

    @Override()
    public String doFilter(final String msg) {
        return msg.replaceAll("\"", "&quot;");
    }
}
