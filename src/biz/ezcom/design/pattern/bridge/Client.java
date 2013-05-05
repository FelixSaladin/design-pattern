package biz.ezcom.design.pattern.bridge;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final IMobileSoftware game = new MobileSoftwareGame();
        final IMobileSoftware notepad = new MobileSoftwareNotepad();
        final AbstractMobileHardware nokia = new MobileHardwareNokia();
        nokia.setMobileSoftware(game);
        nokia.run();
        nokia.setMobileSoftware(notepad);
        nokia.run();
        final AbstractMobileHardware htc = new MobileHardwareHtc();
        htc.setMobileSoftware(game);
        htc.run();
        htc.setMobileSoftware(notepad);
        htc.run();
    }
}
