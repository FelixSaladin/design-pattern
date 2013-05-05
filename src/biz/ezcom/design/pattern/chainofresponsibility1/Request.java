package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 责任链的请求类
 */
public final class Request {
    /** 工资增加 */
    private int salaryAdd;

    public Request() {}

    public int getSalaryAdd() {
        return this.salaryAdd;
    }

    public void setSalaryAdd(final int salaryAdd) {
        this.salaryAdd = salaryAdd;
    }
}
