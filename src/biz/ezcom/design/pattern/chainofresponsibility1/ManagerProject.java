package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 具体的管理者：项目经理
 * 最小的管理者，100元以下的加薪，可以决定
 */
public final class ManagerProject extends AbstractManager {
    public ManagerProject() {}

    @Override()
    public void handler(final Request request) {
        final int money = 100;
        if (request.getSalaryAdd() < money) {
            System.out.println(this.getName() + " 批准加薪：" + request.getSalaryAdd());
        } else {
            this.getManager().handler(request);
        }
    }
}
