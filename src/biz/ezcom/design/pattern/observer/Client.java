package biz.ezcom.design.pattern.observer;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        // 看股票的同事
        final ObserverStock stock1 = new ObserverStock("Andy");
        final ObserverStock stock2 = new ObserverStock("Felix");
        // 老板：出去了
        final ObservableBoss boss = new ObservableBoss("出去了");
        // 唤醒者增加观察者
        boss.addObserver(stock1);
        boss.addObserver(stock2);
        System.out.println("====start=====");
        boss.setStatus("回来了");
        System.out.println("====end=====");
    }
}
