package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 具体的管理者：总经理
 * 高级管理者：加薪多少都可以决定
 */
public final class ManagerGerneral extends AbstractManager {
    public ManagerGerneral() {}

    @Override()
    public void handler(final Request request) {
        System.out.println(this.getName() + " 批准加薪：" + request.getSalaryAdd());
    }
}
