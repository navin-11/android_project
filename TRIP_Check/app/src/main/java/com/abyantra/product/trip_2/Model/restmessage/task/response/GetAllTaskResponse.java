//package com.abyantra.product.trip_2.Model.restmessage.task.response;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//import com.abyantra.product.trip_2.Model.dao.pojo.Task;
//import com.abyantra.product.trip_2.Model.restmessage.task.user.MessengerResponse;
//
//import org.json.JSONException;
//
//import java.util.List;
//
//public class GetAllTaskResponse extends MessengerResponse {
//
//    List<Task> taskList;
//
//    private static final String TAG = GetAllTaskResponse.class.getSimpleName() + "--->";
//
//    public void updateResponseToDB(long currentTime) throws JSONException {
//        preCheckTaskInfoIdsValid(taskInfoIds);
//        saveDailyReport(dailyTaskReport);
//
//        if (taskList != null) {
//            for (TaskInfoObj taskInfoObj : taskList) {
//                if (taskInfoObj != null) {
//                    if (isPreExistingDataSynced(taskInfoObj)) {
//                        ServiceTaskMapping serviceTaskMapping = new ServiceTaskMapping();
//                        taskInfoObj.setServiceHistoryFlag("N");
//                        serviceTaskMapping.saveServiceTaskThroughMapping(taskInfoObj);
//                    }
//                }
//            }
//
//            /* serviceSyncTime - Time as to when the last server call was completed successfully */
//            SharedPreferences sharedPreferences = TA2Application.getApp().getSharedPreferences(CommonUtils.SHARED_PREFERENCE, Context.MODE_PRIVATE);
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putLong("serviceSyncTime", currentTime);
//            editor.apply();
//
//
//        }
//    }
//
//}
