package biz.ezcom.design.pattern.builder;

/**
 * 建造者中的指挥者
 */
public final class Director {
    /** 建造者 */
    private final IBuilder builder;

    public Director(final IBuilder builder) {
        this.builder = builder;
    }

    /**
     * 创建Product
     * 
     * @return Product
     */
    public Product createProduct() {
        this.builder.createHeader();
        this.builder.createBody();
        this.builder.createLeftArm();
        this.builder.createRightArm();
        this.builder.createLeftLeg();
        this.builder.createRightLeg();
        return this.builder.getProduct();
    }
}
