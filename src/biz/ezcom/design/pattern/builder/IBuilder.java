package biz.ezcom.design.pattern.builder;

/**
 * 产品Product(人)的建造者抽象
 */
public interface IBuilder {
    /**
     * 创建人的头部
     */
    void createHeader();

    /**
     * 创建人的身体
     */
    void createBody();

    /**
     * 创建人的左手
     */
    void createLeftArm();

    /**
     * 创建人的右手
     */
    void createRightArm();

    /**
     * 创建人的左脚
     */
    void createLeftLeg();

    /**
     * 创建人的右脚
     */
    void createRightLeg();

    /**
     * 获得人
     * 
     * @return Product
     */
    Product getProduct();
}
