package biz.ezcom.design.pattern.interpreter;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Context context = new Context();
        final String playText = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setPlayText(playText);
        AbstractExpression expression = null;
        while (context.getPlayText().length() > 0) {
            final String text = context.getPlayText().substring(0, 1);
            // 此处可用工厂
            if ("O".equals(text)) {
                expression = new ScaleExpression();
            } else if ("T".equals(text)) {
                expression = new SpeedExpression();
            } else if ((text.charAt(0) >= 'A') && (text.charAt(0) <= 'G')) {
                expression = new NoteExpression();
            }
            expression.interpret(context);
        }
    }
}
