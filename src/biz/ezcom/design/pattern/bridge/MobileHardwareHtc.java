package biz.ezcom.design.pattern.bridge;

/**
 * Htc品牌的手机硬件
 */
public final class MobileHardwareHtc extends AbstractMobileHardware {
    public MobileHardwareHtc() {}

    @Override()
    public void run() {
        System.out.print("Htc 手机运行：");
        this.getMobileSoftware().operation();
    }
}
