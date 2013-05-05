package biz.ezcom.design.pattern.factory.abstract_;

/**
 * 抽象工厂
 */
public interface IFactory {
    void saveUser(User user);

    void saveDepartment(Department department);
}
