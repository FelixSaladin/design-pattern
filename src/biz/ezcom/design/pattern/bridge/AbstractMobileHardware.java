package biz.ezcom.design.pattern.bridge;

/**
 * 手机硬件
 */
public abstract class AbstractMobileHardware {
    /** 包含手机软件，桥接模式 */
    private IMobileSoftware mobileSoftware;

    public final IMobileSoftware getMobileSoftware() {
        return this.mobileSoftware;
    }

    public final void setMobileSoftware(final IMobileSoftware mobileSoftware) {
        this.mobileSoftware = mobileSoftware;
    }

    public abstract void run();
}
