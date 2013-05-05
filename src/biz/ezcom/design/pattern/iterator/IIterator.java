package biz.ezcom.design.pattern.iterator;

/** 迭代器抽象 */
public interface IIterator {
    boolean hasNext();

    Object next();
}
