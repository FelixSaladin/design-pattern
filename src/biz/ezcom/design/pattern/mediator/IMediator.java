package biz.ezcom.design.pattern.mediator;

/**
 * 中介者抽象：联合国
 */
public interface IMediator {
    void send(final String message, final AbstractCountry colleague);
}
