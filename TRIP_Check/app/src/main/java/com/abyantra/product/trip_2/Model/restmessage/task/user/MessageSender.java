//package com.abyantra.product.trip_2.Model.restmessage.task.user;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//
//import androidx.localbroadcastmanager.content.LocalBroadcastManager;
//
//import com.abyantra.product.trip_2.Model.restclient.MessengerApiInterface;
//import com.abyantra.product.trip_2.Model.restclient.MessengerRestClient;
//import com.abyantra.product.trip_2.Model.restmessage.task.request.GetAllTaskRequest;
//import com.abyantra.product.trip_2.Model.restmessage.task.response.GetAllTaskResponse;
//
//import org.json.JSONException;
//
//import okhttp3.internal.annotations.EverythingIsNonNull;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class MessageSender {
//
//    private Context context;
//    private static final String TAG = MessageSender.class.getSimpleName() + "--->";
//
//    public void getAllServiceTask(final GetAllTaskRequest getAllServiceTaskRequest) {
//        MessengerApiInterface apiService = MessengerRestClient.Get().createService(MessengerApiInterface.class);
//
//        final long currentTime = System.currentTimeMillis();
//
//        Call<GetAllTaskResponse> call = apiService.getAllTask(getAllServiceTaskRequest);
//        call.enqueue(new Callback<GetAllTaskResponse>() {
//            @EverythingIsNonNull
//            @Override
//            public void onResponse(Call<GetAllTaskResponse> call, Response<GetAllTaskResponse> response) {
//
//                boolean isSuccess = response.isSuccessful();
//                if (isSuccess && response.body() != null) {
//                    boolean isResponseSuccess = response.body().isSuccess();
//                    if (isResponseSuccess) {
//                        //Code here
//                        try {
//                            response.body().updateResponseToDB(currentTime);
//                            Intent intent = new Intent("service_response");
//                            // send local broadcast
//
//                            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        Log.d(TAG, "Failure Response is " + response.body());
//                    }
//                } else {
//                    Log.d(TAG, "Failure Response is " + response.body());
//                }
//            }
//
//            @EverythingIsNonNull
//            @Override
//            public void onFailure(Call<GetAllTaskResponse> call, Throwable t) {
//                Log.d(TAG, "get all service task error:::::"  +t.toString());
//            }
//        });
//    }
//
//}
