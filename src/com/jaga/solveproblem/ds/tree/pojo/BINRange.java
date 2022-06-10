package com.jaga.solveproblem.ds.tree.pojo;

public class BINRange {
    private String start;
    private String end;
    private String cardType;

    public BINRange(String start, String end, String cardType) {
        this.start = start;
        this.end = end;
        this.cardType = cardType;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
