package biz.ezcom.design.pattern.factory.abstract_;

/**
 * 部门
 */
public final class Department {
    /** 唯一标识符 */
    private int    id;
    /** 部门 */
    private String department;

    public Department() {}

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }
}
