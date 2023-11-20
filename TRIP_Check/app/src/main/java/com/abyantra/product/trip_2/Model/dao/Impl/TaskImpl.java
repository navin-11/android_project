package com.abyantra.product.trip_2.Model.dao.Impl;

import com.abyantra.product.trip_2.Model.dao.Interface.TaskInterface;
import com.abyantra.product.trip_2.Model.dao.Pojo.Task;

import io.objectbox.Box;

public class TaskImpl implements TaskInterface {

    Box<Task> taskBox;
    
}
