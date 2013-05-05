package biz.ezcom.design.pattern.mediator;

/**
 * 具体的国家：伊拉克
 */
public final class ContryIraq extends AbstractCountry {
    public ContryIraq(final IMediator mediator) {
        super(mediator);
    }

    @Override()
    public void send(final String message) {
        System.out.println("伊拉克发送信息：" + message);
        this.getMediator().send(message, this);
    }

    @Override()
    public void receive(final String message) {
        System.out.println("伊拉克接到信息：" + message);
    }
}
