package com.example.colliensepodder.retrofit;

import com.example.colliensepodder.retrofit.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/bins/15nwt2")
        Call<List<User>> getData();
}
