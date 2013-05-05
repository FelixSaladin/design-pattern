package biz.ezcom.design.pattern.facade;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final FoundationFacade foundation = new FoundationFacade();
        foundation.operation();
    }
}
