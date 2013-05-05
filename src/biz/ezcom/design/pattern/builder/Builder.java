package biz.ezcom.design.pattern.builder;

/**
 * 产品Product(人)的建造者类
 */
public class Builder implements IBuilder {
    /** fuck */
    private final Product product = new Product();

    public Builder() {}

    @Override()
    public final void createHeader() {
        this.product.setHeader("头");
    }

    @Override()
    public final void createBody() {
        this.product.setBody("身体");
    }

    @Override()
    public final void createLeftArm() {
        this.product.setLeftArm("左手");
    }

    @Override()
    public final void createRightArm() {
        this.product.setRightArm("右手");
    }

    @Override()
    public final void createLeftLeg() {
        this.product.setLeftLeg("左脚");
    }

    @Override()
    public final void createRightLeg() {
        this.product.setRightLeg("右脚");
    }

    @Override()
    public final Product getProduct() {
        return this.product;
    }
}
