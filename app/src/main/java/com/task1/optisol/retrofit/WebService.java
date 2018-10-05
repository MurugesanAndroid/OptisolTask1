package com.task1.optisol.retrofit;

import com.task1.optisol.models.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface WebService {

    @Headers("Authorization: JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ijk0IiwiaWF0IjoxNTM3ODgzMzM1LCJleHAiOjE1Mzc4OTQxMzV9.jIH_fKI8VDdi0v5QTz_1Jz27l6JXpoGBMacTCu_sMcs")
    @GET("event/event_getAll")
    Call<Model> callGetService();

}