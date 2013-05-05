package biz.ezcom.design.pattern.factory.abstract_;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final IFactory factory = new FactoryMysql();
        factory.saveUser(new User());
        factory.saveDepartment(new Department());
    }
}
