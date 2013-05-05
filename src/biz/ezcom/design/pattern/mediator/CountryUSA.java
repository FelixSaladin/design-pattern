package biz.ezcom.design.pattern.mediator;

/**
 * 具体的国家：美国
 */
public final class CountryUSA extends AbstractCountry {
    public CountryUSA(final IMediator mediator) {
        super(mediator);
    }

    @Override()
    public void send(final String message) {
        System.out.println("美国发送信息：" + message);
        this.getMediator().send(message, this);
    }

    @Override()
    public void receive(final String message) {
        System.out.println("美国收到信息：" + message);
    }
}
