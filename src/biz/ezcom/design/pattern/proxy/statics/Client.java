package biz.ezcom.design.pattern.proxy.statics;

/** 客户端 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Girl girl = new Girl();
        girl.setName("美女");
        final IGiveGift proxy = new Proxy(new Boy());
        proxy.giveFlower(girl);
        proxy.giveChocolate(girl);
    }
}
