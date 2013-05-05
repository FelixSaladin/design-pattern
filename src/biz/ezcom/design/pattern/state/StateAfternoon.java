package biz.ezcom.design.pattern.state;

/**
 * 下午时的状态类
 */
public final class StateAfternoon implements IState {
    public StateAfternoon() {}

    @Override()
    public void handle(final Context context) {
        final int hour = context.getHour();
        final int start = 12;
        final int end = 18;
        if ((hour > start) && (hour <= end)) {
            System.out.println(hour + "：下午上班想睡觉");
        } else {
            context.setState(new StateEvening());
            context.request();
        }
    }
}
