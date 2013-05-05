package biz.ezcom.design.pattern.template_method;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final AbstractTest english = new TestEnglish();
        english.doTest();
        System.out.println("==================");
        final AbstractTest chinese = new TestChinese();
        chinese.doTest();
    }
}
