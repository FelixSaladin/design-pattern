package biz.ezcom.design.pattern.interpreter;

/**
 * 解释器抽象
 */
public abstract class AbstractExpression {
    public final void interpret(final Context context) {
        final String playText = context.getPlayText();
        if ((playText == null) || (playText.length() == 0)) {
            return;
        }
        final String playKey = playText.substring(0, 1);
        final int index = playText.indexOf(" ", 2);
        final double playValue = Double.parseDouble(playText.substring(2, index));
        context.setPlayText(playText.substring(index + 1));
        this.execute(playKey, playValue);
    }

    public abstract void execute(String key, double value);
}
