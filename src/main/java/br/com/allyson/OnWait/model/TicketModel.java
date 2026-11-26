package br.com.allyson.OnWait.model;

public class TicketModel {
    private String support;
    private String preferential;
    private Integer waitingNum;

    public TicketModel(Integer waitingNum, String preferential, String support) {
        this.waitingNum = waitingNum;
        this.preferential = preferential;
        this.support = support;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getPreferential() {
        return preferential;
    }

    public void setPreferential(String preferential) {
        this.preferential = preferential;
    }

    public Integer getWaitingNum() {
        return waitingNum;
    }

    public void setWaitingNum(Integer waitingNum) {
        this.waitingNum = waitingNum;
    }
}
