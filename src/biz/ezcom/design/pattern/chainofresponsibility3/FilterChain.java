package biz.ezcom.design.pattern.chainofresponsibility3;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public final class FilterChain implements IFilter {
    /** 过滤器集合 */
    private List<IFilter> filters = new ArrayList<IFilter>();
    /** 过滤器集合下标 */
    private int           index;

    public FilterChain() {}

    public List<IFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(final List<IFilter> filters) {
        this.filters = filters;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public void addFilter(final IFilter filter) {
        this.filters.add(filter);
    }

    public void deleteFilter(final IFilter filter) {
        this.filters.remove(filter);
    }

    public void process(final Request request, final Response response, final FilterChain chain) {
        this.doFilter(request, response, chain);
    }

    @Override()
    public void doFilter(final Request request, final Response response, final FilterChain chain) {
        if ((this.filters == null) || this.filters.isEmpty() || (this.index >= this.filters.size())) {
            this.index = 0;
            return;
        }
        final IFilter filter = this.filters.get(this.index);
        this.index++;
        filter.doFilter(request, response, chain);
    }
}
