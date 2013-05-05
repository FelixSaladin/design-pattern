package biz.ezcom.design.pattern.template_method;

/**
 * 英语考试
 */
public final class TestEnglish extends AbstractTest {
    public TestEnglish() {}

    @Override()
    public void question1() {
        System.out.println("英语考试题：1");
    }

    @Override()
    public void question2() {
        System.out.println("英语考试题：２");
    }

    @Override()
    public void question3() {
        System.out.println("英语考试题：３");
    }
}
