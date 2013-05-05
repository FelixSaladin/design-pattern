package biz.ezcom.design.pattern.bridge;

/**
 * 手机软件:游戏
 */
public final class MobileSoftwareGame implements IMobileSoftware {
    public MobileSoftwareGame() {}

    @Override()
    public void operation() {
        System.out.println("游戏的手机软件");
    }
}
