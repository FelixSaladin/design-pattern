package biz.ezcom.design.pattern.factory.abstract_;

/**
 * mysql 操作数据库
 */
public final class FactoryMysql implements IFactory {
    public FactoryMysql() {}

    @Override()
    public void saveUser(final User user) {
        System.out.println("mysql 插入 user");
    }

    @Override()
    public void saveDepartment(final Department department) {
        System.out.println("mysql 插入 department");
    }
}
