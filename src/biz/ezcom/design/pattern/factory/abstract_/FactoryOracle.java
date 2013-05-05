package biz.ezcom.design.pattern.factory.abstract_;

/**
 * oracle 操作数据库
 */
public final class FactoryOracle implements IFactory {
    public FactoryOracle() {}

    @Override()
    public void saveUser(final User user) {
        System.out.println("oracle 插入 user");
    }

    @Override()
    public void saveDepartment(final Department department) {
        System.out.println("oracle 插入 department");
    }
}
