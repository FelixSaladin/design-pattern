package biz.ezcom.design.pattern.bridge;

/**
 * Nokia品牌的手机硬件
 */
public final class MobileHardwareNokia extends AbstractMobileHardware {
    public MobileHardwareNokia() {}

    @Override()
    public void run() {
        System.out.print("Nokia 手机运行：");
        this.getMobileSoftware().operation();
    }
}
