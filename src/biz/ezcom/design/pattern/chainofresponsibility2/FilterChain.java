package biz.ezcom.design.pattern.chainofresponsibility2;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public final class FilterChain implements IFilter {
    /** 过滤器集合 */
    private List<IFilter> filters = new ArrayList<IFilter>();

    public FilterChain() {}

    public List<IFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(final List<IFilter> filters) {
        this.filters = filters;
    }

    public void addFilter(final IFilter filter) {
        this.filters.add(filter);
    }

    public void deleteFilter(final IFilter filter) {
        this.filters.remove(filter);
    }

    @Override()
    public String doFilter(final String msg) {
        for (final IFilter filter : this.filters) {
            final String result = filter.doFilter(msg);
            System.out.println("after " + filter.getClass().getSimpleName() + " : " + result);
        }
        return msg;
    }

    public String process(final String msg) {
        return this.doFilter(msg);
    }
}
