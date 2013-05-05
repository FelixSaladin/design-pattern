package biz.ezcom.design.pattern.builder;

/**
 * 此时的产品假设是：人
 */
public class Product {
    /** 头 */
    private String header;
    /** 身体 */
    private String body;
    /** 左手 */
    private String leftArm;
    /** 右手 */
    private String rightArm;
    /** 左脚 */
    private String leftLeg;
    /** 右脚 */
    private String rightLeg;

    public Product() {}

    public final String getHeader() {
        return this.header;
    }

    public final void setHeader(final String header) {
        this.header = header;
    }

    public final String getBody() {
        return this.body;
    }

    public final void setBody(final String body) {
        this.body = body;
    }

    public final String getLeftArm() {
        return this.leftArm;
    }

    public final void setLeftArm(final String leftArm) {
        this.leftArm = leftArm;
    }

    public final String getRightArm() {
        return this.rightArm;
    }

    public final void setRightArm(final String rightArm) {
        this.rightArm = rightArm;
    }

    public final String getLeftLeg() {
        return this.leftLeg;
    }

    public final void setLeftLeg(final String leftLeg) {
        this.leftLeg = leftLeg;
    }

    public final String getRightLeg() {
        return this.rightLeg;
    }

    public final void setRightLeg(final String rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override()
    public final String toString() {
        return this.getHeader() + "1" + this.getBody() + "2" + this.getLeftArm() + "3" + this.getRightArm() + "4" + this.getLeftLeg() + "5"
                + this.getRightLeg();
    }
}
