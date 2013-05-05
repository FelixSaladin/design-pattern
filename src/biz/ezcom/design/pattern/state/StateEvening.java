package biz.ezcom.design.pattern.state;

/**
 * 晚上的状态
 */
public final class StateEvening implements IState {
    public StateEvening() {}

    @Override()
    public void handle(final Context context) {
        final int hour = context.getHour();
        final int start = 18;
        final int end = 8;
        if ((hour > start) || (hour <= end)) {
            System.out.println(hour + "：休息中");
        } else {
            context.setState(new StateMorning());
            context.request();
        }
    }
}
