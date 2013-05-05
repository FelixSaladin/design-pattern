package biz.ezcom.design.pattern.state;

/**
 * 　早上上班时的状态
 */
public final class StateMorning implements IState {
    public StateMorning() {}

    @Override()
    public void handle(final Context context) {
        final int hour = context.getHour();
        final int start = 8;
        final int end = 12;
        if ((hour > start) && (hour <= end)) {
            System.out.println(hour + "：精神百倍");
        } else {
            context.setState(new StateAfternoon());
            context.request();
        }
    }
}
