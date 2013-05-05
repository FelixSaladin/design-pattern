package biz.ezcom.design.pattern.composite;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final AbstractComposite root = new Component(0, "根");
        root.add(new Leaf(1, "叶A"));
        root.add(new Leaf(1, "叶B"));
        final Component nodeA = new Component(1, "节点A");
        final Component nodeB = new Component(1, "节点B");
        root.add(nodeA);
        root.add(nodeB);
        final Leaf leafC = new Leaf(2, "叶C");
        final Leaf leafD = new Leaf(2, "叶D");
        nodeA.add(leafC);
        nodeA.add(leafD);
        root.show();
    }
}
