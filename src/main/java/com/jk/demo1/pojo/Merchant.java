package com.jk.demo1.pojo;


public class Merchant {

    private Integer merchantId;

    private String customerName;

    private String merchantArea;

    private String merchantRegisterTime;

    private String merchantUpdateTime;

    private String merchantPhone;

    private String merchantName;

    private String merchantMail;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMerchantArea() {
        return merchantArea;
    }

    public void setMerchantArea(String merchantArea) {
        this.merchantArea = merchantArea;
    }

    public String getMerchantRegisterTime() {
        return merchantRegisterTime;
    }

    public void setMerchantRegisterTime(String merchantRegisterTime) {
        this.merchantRegisterTime = merchantRegisterTime;
    }

    public String getMerchantUpdateTime() {
        return merchantUpdateTime;
    }

    public void setMerchantUpdateTime(String merchantUpdateTime) {
        this.merchantUpdateTime = merchantUpdateTime;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantMail() {
        return merchantMail;
    }

    public void setMerchantMail(String merchantMail) {
        this.merchantMail = merchantMail;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantId=" + merchantId +
                ", customerName='" + customerName + '\'' +
                ", merchantArea='" + merchantArea + '\'' +
                ", merchantRegisterTime='" + merchantRegisterTime + '\'' +
                ", merchantUpdateTime='" + merchantUpdateTime + '\'' +
                ", merchantPhone=" + merchantPhone +
                ", merchantName=" + merchantName +
                ", merchantMail=" + merchantMail +
                '}';
    }
}
