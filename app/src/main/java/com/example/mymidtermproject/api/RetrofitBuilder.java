package com.example.mymidtermproject.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    public Retrofit retrofit;

    public RetrofitBuilder(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl.baseURL())
               .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
