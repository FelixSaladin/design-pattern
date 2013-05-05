package biz.ezcom.design.pattern.bridge;

/**
 * 手机软件:记事本
 */
public final class MobileSoftwareNotepad implements IMobileSoftware {
    public MobileSoftwareNotepad() {}

    @Override()
    public void operation() {
        System.out.println("记事本的手机软件");
    }
}
