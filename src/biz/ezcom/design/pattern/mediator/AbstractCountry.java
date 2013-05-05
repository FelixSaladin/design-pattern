package biz.ezcom.design.pattern.mediator;

/**
 * 中介者（联合车）要调解的国家抽象
 */
public abstract class AbstractCountry {
    /** 中介者 */
    private IMediator mediator;

    public AbstractCountry(final IMediator mediator) {
        this.mediator = mediator;
    }

    public final IMediator getMediator() {
        return this.mediator;
    }

    public final void setMediator(final IMediator mediator) {
        this.mediator = mediator;
    }

    /** 发送信息 */
    public abstract void send(String message);

    /** 接受信息 */
    public abstract void receive(String message);
}
