package biz.ezcom.design.pattern.commond;

/**
 * 命令的接收者：烧烤者类
 */
public final class ReceiverBarbecuer {
    public ReceiverBarbecuer() {}

    public void bakeMutton() {
        System.out.println("烤羊肉串");
    }

    public void bakeChickenWing() {
        System.out.println("烤鸡翅");
    }
}
