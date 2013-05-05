package biz.ezcom.design.pattern.commond;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        // 创建烧烤者
        final ReceiverBarbecuer barbecuer = new ReceiverBarbecuer();
        // 创建烤肉串菜单（命令）
        final ICommond bakeMutton1 = new CommondBakeMutton(barbecuer);
        final ICommond bakeMutton2 = new CommondBakeMutton(barbecuer);
        // 创建烤鸡翅菜单（命令）
        final ICommond chickenWing1 = new CommondBakeChickenWing(barbecuer);
        // 创建服务员
        final InvokerWaiter waiter = new InvokerWaiter();
        // 正常营业
        waiter.addCommond(bakeMutton1);
        waiter.addCommond(bakeMutton2);
        waiter.addCommond(chickenWing1);
        waiter.submit();
    }
}
