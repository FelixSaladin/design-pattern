package biz.ezcom.design.pattern.observer;

import java.util.Observable;

/**
 * 　老板：唤醒者
 */
public final class ObservableBoss extends Observable {
    /** 唤醒者状态 */
    private String status;

    public ObservableBoss(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        if (status != null) {
            if (!status.equals(this.status)) {
                this.status = status;
                this.setChanged();// 修改状态
                this.notifyObservers();// 唤醒观察者
            }
        }
    }

    @Override()
    public String toString() {
        return "ObservableBoss.toString()";
    }
}
