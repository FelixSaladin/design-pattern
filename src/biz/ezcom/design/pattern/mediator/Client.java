package biz.ezcom.design.pattern.mediator;

/** 客户端 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final Mediator mediator = new Mediator();
        final CountryUSA usa = new CountryUSA(mediator);
        final ContryIraq iraq = new ContryIraq(mediator);
        mediator.setUsa(usa);
        mediator.setIraq(iraq);
        usa.send("不要研制核武，不然我们要开战了！");
        iraq.send("我们没有研制核武，也不怕侵略！");
    }
}
