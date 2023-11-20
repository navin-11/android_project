package com.abyantra.product.trip_2.Model.dao.Pojo;

public class ModelParticulars {

    String  time;

    public ModelParticulars(String time, String location, String remarks, String latLong) {
        this.time = time;
        this.location = location;
        this.remarks = remarks;
        this.latLong = latLong;
    }

    String location, remarks;
    String latLong;

//    public ModelParticulars(String time, String location, String remarks, double v, double v1) {
//
//        this.time = String.valueOf(time);
//        this.location = location;
//        this.remarks = remarks;
//        this.latLong = latLong;
//    }


    public String getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = String.valueOf(time);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(int latLong) {
        this.latLong = String.valueOf(latLong);
    }

}
