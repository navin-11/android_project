package com.abyantra.product.trip_2.Model.restmessage.task.user;

import com.google.gson.annotations.SerializedName;

public class MessengerResponse {

    @SerializedName("serviceStatus")
    private  String result;

    @SerializedName("returnMessage")
    private  String message;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return (result != null && result.equals("Success"));
    }

    public String toString() {
        return ((result != null) ? "Result is " + result : "") +
                ((message != null) ? "Message is " + message : "");
    }
}
