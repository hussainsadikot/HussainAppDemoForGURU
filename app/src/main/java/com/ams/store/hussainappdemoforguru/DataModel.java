package com.ams.store.hussainappdemoforguru;

public class DataModel {
    public String id;
   public String title;
    public String price;
   public int qty;

    public DataModel() {
    }

    public DataModel(String id, String title, String price, int qty) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
