package com.example.lab6_loginfpt.network;

import com.example.lab6_loginfpt.data.model.ApiResponse;
import com.example.lab6_loginfpt.data.model.LoginRequest;
import com.example.lab6_loginfpt.data.model.LoginResponse;
import com.example.lab6_loginfpt.data.model.RegisterRequest;
import com.example.lab6_loginfpt.data.model.UserProfile;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserApiService {
    @POST("api/User/Register")
    Call<ApiResponse> register(@Body RegisterRequest request);

    @POST("api/User/Login")
    Call<LoginResponse> login(@Body LoginRequest request);

    @GET("api/User/Profile")
    Call<UserProfile> getUserProfile(@Header("Authorization") String token);
}
