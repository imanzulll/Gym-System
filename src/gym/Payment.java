package gym;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 
 */
public class Payment {
    private String payment_id;
    private String payment_member_id;
    private String payment_date;
    private String payment_amount;
    private String payment_info;

    public Payment( String payment_id,String payment_member_id, String payment_date, String payment_amount, String payment_info) {
        this.payment_id = payment_id;
        this.payment_member_id = payment_member_id;
        this.payment_date = payment_date;
        this.payment_amount = payment_amount;
        this.payment_info = payment_info;
        

    }

    public Payment() {
        this.payment_id = payment_id;
    }
    
    public void setpayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getpayment_id() {
        return payment_id;
    }

    public void setpayment_member_id(String payment_member_id) {
        this.payment_member_id = payment_member_id;
    }

    public String getpayment_member_id() {
        return payment_member_id;
    }
    
    public void setpayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getpayment_date() {
        return payment_date;
    }
    
    public void setpayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getpayment_amount() {
        return payment_amount;
    }
    
    public void setpayment_info(String payment_info) {
        this.payment_info = payment_info;
    }

    public String getpayment_info() {
        return payment_info;
    }
    
}
