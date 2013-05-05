package biz.ezcom.design.pattern.prototype;

import java.util.Date;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) throws CloneNotSupportedException {
        System.out.println("========浅克隆===============");
        final PrototypeDeep prototypeDeep = new PrototypeDeep("Felix", new Date());
        final PrototypeDeep cloneDeep = (PrototypeDeep) prototypeDeep.clone();
        System.out.println("对象1 : " + (prototypeDeep == cloneDeep));
        System.out.println("对象1.name: " + (prototypeDeep.getName() == cloneDeep.getName()));
        System.out.println("对象1.Date: " + (prototypeDeep.getDate() == cloneDeep.getDate()));
        System.out.println("对象1.Date.time: " + (prototypeDeep.getDate().getTime() == cloneDeep.getDate().getTime()));
        System.out.println("========深克隆===============");
        final PrototypeShallow prototypeShallow = new PrototypeShallow("Justin", new Date());
        final PrototypeShallow cloneLight = (PrototypeShallow) prototypeShallow.clone();
        System.out.println("对象2 : " + (prototypeShallow == cloneLight));
        System.out.println("对象2.name: " + (prototypeShallow.getName() == cloneLight.getName()));
        System.out.println("对象2.Date: " + (prototypeShallow.getDate() == cloneLight.getDate()));
        System.out.println("对象2.Date.time: " + (prototypeShallow.getDate().getTime() == cloneLight.getDate().getTime()));
    }
}
