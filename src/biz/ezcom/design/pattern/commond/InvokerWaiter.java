package biz.ezcom.design.pattern.commond;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 */
public final class InvokerWaiter {
    /** 命令列表 */
    private final List<ICommond> orderList = new ArrayList<ICommond>();

    public InvokerWaiter() {}

    public void addCommond(final ICommond commond) {
        if (commond.getClass() == CommondBakeChickenWing.class) {
            System.out.println("服务员说：鸡翅没有了，请点别的！");
        } else if (commond.getClass() == CommondBakeMutton.class) {
            System.out.println("增加了CommondBakeMutton 烤肉串");
            this.orderList.add(commond);
        }
    }

    public void removeCommond(final ICommond commond) {
        System.out.println("取消订单" + commond);
        this.orderList.remove(commond);
    }

    public void submit() {
        for (final ICommond commond : this.orderList) {
            commond.executeCommond();
        }
    }
}
