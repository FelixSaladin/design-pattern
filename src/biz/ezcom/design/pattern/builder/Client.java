package biz.ezcom.design.pattern.builder;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    /**
     * main
     * 
     * @param args
     *            参数
     */
    public static void main(final String[] args) {
        final IBuilder builder = new Builder();
        final Director director = new Director(builder);
        final Product product = director.createProduct();
        System.out.println(product);
    }
}
