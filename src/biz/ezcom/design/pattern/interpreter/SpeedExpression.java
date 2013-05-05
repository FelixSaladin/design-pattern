package biz.ezcom.design.pattern.interpreter;

/**
 * 音速解释器
 */
public final class SpeedExpression extends AbstractExpression {
    /** 慢速，中速的分隔 */
    private static final double SPEED_FIRST  = 500D;
    /** 中速，高速的分隔 */
    private static final double SPEED_SECOND = 1000D;

    public SpeedExpression() {}

    @Override()
    public void execute(final String key, final double value) {
        // key = T
        String speed = "";
        if (value < SpeedExpression.SPEED_FIRST) {
            speed = "慢速";
        } else if (value > SpeedExpression.SPEED_SECOND) {
            speed = "快速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
