package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final AbstractManager gerneralManager = new ManagerGerneral();
        gerneralManager.setName("总经理");// 总经理最大，没有他的管理者了
        final AbstractManager majorManager = new ManagerMajor();
        majorManager.setName("总监");
        majorManager.setManager(gerneralManager);// 设置其管理者：总经理
        final AbstractManager projectManager = new ManagerProject();
        projectManager.setName("项目经理");
        projectManager.setManager(majorManager);// 设置其管理者：总监
        final Request request = new Request();
        final int money1 = 50;
        request.setSalaryAdd(money1);
        projectManager.handler(request);// 加薪请求肯定先给其上一个管理者（projectManager）
        final int money2 = 500;
        request.setSalaryAdd(money2);
        projectManager.handler(request);
        final int money3 = 5000;
        request.setSalaryAdd(money3);
        projectManager.handler(request);
    }
}
