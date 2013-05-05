package biz.ezcom.design.pattern.iterator;

/** 客户端 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Aggregate a = new Aggregate();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        final IIterator i = a.createIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
