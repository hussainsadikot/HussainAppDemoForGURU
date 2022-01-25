package com.ams.store.hussainappdemoforguru;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CallMethod {
    @GET("products")
    Call<ArrayList<DataModel>> getAllData();

}
