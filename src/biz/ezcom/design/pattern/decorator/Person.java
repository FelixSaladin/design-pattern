package biz.ezcom.design.pattern.decorator;

/**
 * 具体的组件：人
 */
public final class Person implements IComponent {
    /** 姓名 */
    private final String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override()
    public void bath() {
        System.out.println(this.getName() + ": 开始洗澡了");
    }
}
