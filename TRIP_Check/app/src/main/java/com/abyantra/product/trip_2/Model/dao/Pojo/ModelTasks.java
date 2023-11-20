package com.abyantra.product.trip_2.Model.dao.Pojo;

public class ModelTasks {

    int image;
    String taskName,taskType,taskDate;

    public ModelTasks(int image, String taskName, String taskType , String taskDate){

        this.image = image;
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskDate = taskDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }
}
