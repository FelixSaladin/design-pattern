package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 具体的管理者：总监
 * 中级管理者：1000元以下的加薪可以决定
 */
public final class ManagerMajor extends AbstractManager {
    public ManagerMajor() {}

    @Override()
    public void handler(final Request request) {
        final int money = 1000;
        if (request.getSalaryAdd() < money) {
            System.out.println(this.getName() + " 批准加薪：" + request.getSalaryAdd());
        } else {
            this.getManager().handler(request);
        }
    }
}
