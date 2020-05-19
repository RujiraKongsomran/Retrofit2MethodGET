package com.rujirakongsomran.retrofit2methodget;

import com.rujirakongsomran.retrofit2methodget.Model.Users;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("/api/users?page=2")
    Call<Users> getListUsers();
}
