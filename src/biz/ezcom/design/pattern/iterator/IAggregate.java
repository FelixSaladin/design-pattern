package biz.ezcom.design.pattern.iterator;

/** 集合抽象 */
public interface IAggregate {
    IIterator createIterator();
}
