package biz.ezcom.design.pattern.template_method;

/**
 * 考试类
 */
public abstract class AbstractTest {
    /**
     * 定义考试做题的顺序
     */
    public final void doTest() {
        this.question1();
        this.question2();
        this.question3();
    }

    public abstract void question1();

    public abstract void question2();

    public abstract void question3();
}
