package com.example.demo.entity;

import java.util.Date;

public class Reimbursement {
    public Reimbursement() {
    }
    private int id;
    private String recipient;
    private String reason;
    private Date date;
    private float cost;
    private String deptName;

    public Reimbursement(int id, String recipient, String reason, Date date, float cost, String deptName) {
        this.id = id;
        this.recipient = recipient;
        this.reason = reason;
        this.date = date;
        this.cost = cost;
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "id=" + id +
                ", recipient='" + recipient + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                ", cost=" + cost +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
