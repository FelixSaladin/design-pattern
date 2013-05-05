package biz.ezcom.design.pattern.adapter;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final IAmerican american = new American();
        american.speckAmerican();
        final IChinese chinese = new Chinese();
        final IAmerican adapter = new AdapterTransactor(chinese);
        // 此处，美国人，中国人，适配了
        adapter.speckAmerican();
    }
}
