package com.example.colliensepodder.retrofit.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.colliensepodder.retrofit.Adapter.RecyclerViewAdapter;
import com.example.colliensepodder.retrofit.ApiService;
import com.example.colliensepodder.retrofit.Model.User;
import com.example.colliensepodder.retrofit.Network.ApiClient;
import com.example.colliensepodder.retrofit.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserLIst();
    }

    private void getUserLIst() {

        try {
            ApiService service = ApiClient.getRetrofit().create(ApiService.class);
            Call<List<User>> call =service.getData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    //Log.d("onResponse",response.message());

                    List<User>userList = response.body();
                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = findViewById(R.id.recycler);
                    recyclerView.setLayoutManager(linearLayoutManager);

                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(userList);
                    recyclerView.setAdapter(recyclerViewAdapter);

                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {

                }
            });

        }catch (Exception e){

        }
    }
}
