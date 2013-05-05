package biz.ezcom.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    /**
     * IPerson的实现类必须是已经确定数量的，后期不能有变化
     * IVisitor的实现类可以变化数据
     */
    public static void main(final String[] args) {
        final List<IPerson> personList = new ArrayList<IPerson>(2);
        personList.add(new PersonMan());
        personList.add(new PersonWoman());
        //
        final IVisitor failVisitor = new VisitorFail();
        for (final IPerson person : personList) {
            person.accept(failVisitor);
        }
        //
        final IVisitor successVisitor = new VisitorSuccess();
        for (final IPerson person : personList) {
            person.accept(successVisitor);
        }
    }
}
