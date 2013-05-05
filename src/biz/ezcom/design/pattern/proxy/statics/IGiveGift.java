package biz.ezcom.design.pattern.proxy.statics;

/**
 * 送礼物类
 */
public interface IGiveGift {
    /** 送鲜花 */
    void giveFlower(Girl girl);

    /** 送巧克力 */
    void giveChocolate(Girl girl);
}
