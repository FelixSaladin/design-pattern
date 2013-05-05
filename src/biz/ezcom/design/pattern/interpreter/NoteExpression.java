package biz.ezcom.design.pattern.interpreter;

/**
 * 音符解释器
 */
public final class NoteExpression extends AbstractExpression {
    public NoteExpression() {}

    @Override()
    public void execute(final String key, final double value) {
        String note = "";
        if ("A".equals(key)) {
            note = "1";
        } else if ("B".equals(key)) {
            note = "2";
        } else if ("C".equals(key)) {
            note = "3";
        } else if ("D".equals(key)) {
            note = "4";
        } else if ("E".equals(key)) {
            note = "5";
        } else if ("F".equals(key)) {
            note = "6";
        } else if ("G".equals(key)) {
            note = "7";
        }
        System.out.print(note + " ");
        System.out.print(value + "拍 ");
    }
}
