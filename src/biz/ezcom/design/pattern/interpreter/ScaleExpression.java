package biz.ezcom.design.pattern.interpreter;

/**
 * 音阶解释器
 */
public final class ScaleExpression extends AbstractExpression {
    /** 低音 */
    private static final double LOW_VOICE  = 1D;
    /** 中音 */
    private static final double MID_VOICE  = 2D;
    /** 高音 */
    private static final double HIGH_VOICE = 3D;

    public ScaleExpression() {}

    @Override()
    public void execute(final String key, final double value) {
        // key = O
        String scale = "";
        if (value == ScaleExpression.LOW_VOICE) {
            scale = "低音";
        } else if (value == ScaleExpression.MID_VOICE) {
            scale = "中音";
        } else if (value == ScaleExpression.HIGH_VOICE) {
            scale = "高音";
        }
        System.out.print(scale + " ");
    }
}
