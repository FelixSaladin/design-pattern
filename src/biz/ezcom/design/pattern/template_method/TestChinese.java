package biz.ezcom.design.pattern.template_method;

/**
 * 语文考试
 */
public final class TestChinese extends AbstractTest {
    public TestChinese() {}

    @Override()
    public void question1() {
        System.out.println("语文考试题：1");
    }

    @Override()
    public void question2() {
        System.out.println("语文考试题：２");
    }

    @Override()
    public void question3() {
        System.out.println("语文考试题：３");
    }
}
