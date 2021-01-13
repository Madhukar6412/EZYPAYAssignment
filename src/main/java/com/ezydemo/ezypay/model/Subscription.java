package main.java.com.ezydemo.ezypay.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription {

    private  double  invoice_Amount;
    enum Type { DAILY,WEEKLY,MONTHLY}
    private  String invoice_Date;
    private String start_date_Duratiom;
    private String end_date_Duration;


    public double getInvoice_Amount() {
        return invoice_Amount;
    }

    public void setInvoice_Amount(double invoice_Amount) {
        this.invoice_Amount = invoice_Amount;
    }

    public String getInvoice_Date() {
        return invoice_Date;
    }

    public void setInvoice_Date(String invoice_Date) {
        this.invoice_Date = invoice_Date;
    }

    public String getStart_date_Duratiom() {
        return start_date_Duratiom;
    }

    public void setStart_date_Duratiom(String start_date_Duratiom) {
        this.start_date_Duratiom = start_date_Duratiom;
    }

    public String getEnd_date_Duration() {
        return end_date_Duration;
    }

    public void setEnd_date_Duration(String end_date_Duration) {
        this.end_date_Duration = end_date_Duration;
    }
}
