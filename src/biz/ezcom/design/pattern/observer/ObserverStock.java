package biz.ezcom.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 看股票的同事：观察者
 */
public final class ObserverStock implements Observer {
    /** 观察者姓名 */
    private String name;

    public ObserverStock(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override()
    public void update(final Observable o, final Object arg) {
        System.out.println();
        System.out.println("观察者姓名：" + this.name);
        System.out.println("唤醒者：" + o);
        System.out.println("参数：" + arg);
    }
}
