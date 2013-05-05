package biz.ezcom.design.pattern.mediator;

/**
 * 具体的中介者，联合国安理会
 */
public final class Mediator implements IMediator {
    /** 美国 */
    private CountryUSA usa;
    /** 伊拉克 */
    private ContryIraq iraq;

    public Mediator() {}

    public CountryUSA getUsa() {
        return this.usa;
    }

    public void setUsa(final CountryUSA usa) {
        this.usa = usa;
    }

    public ContryIraq getIraq() {
        return this.iraq;
    }

    public void setIraq(final ContryIraq iraq) {
        this.iraq = iraq;
    }

    @Override()
    public void send(final String message, final AbstractCountry country) {
        if (country == this.usa) {
            this.iraq.receive(message);
        } else if (country == this.iraq) {
            this.usa.receive(message);
        }
    }
}
