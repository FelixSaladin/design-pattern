package biz.ezcom.design.pattern.chainofresponsibility3;

/**
 * 过滤器
 */
public interface IFilter {
    void doFilter(Request request, Response response, FilterChain chain);
}
