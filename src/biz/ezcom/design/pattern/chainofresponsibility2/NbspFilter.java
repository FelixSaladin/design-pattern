package biz.ezcom.design.pattern.chainofresponsibility2;

/**
 * html 转义 空格
 */
public final class NbspFilter implements IFilter {
    public NbspFilter() {}

    @Override()
    public String doFilter(final String msg) {
        return msg.replaceAll(" ", "&nbsp;");
    }
}
