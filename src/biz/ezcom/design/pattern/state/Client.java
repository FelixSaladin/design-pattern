package biz.ezcom.design.pattern.state;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Context context = new Context();
        final IState state = new StateMorning();
        context.setState(state);
        final int hour = 24;
        for (int i = 0; i < hour; i++) {
            context.setHour(i);
            context.request();
        }
    }
}
