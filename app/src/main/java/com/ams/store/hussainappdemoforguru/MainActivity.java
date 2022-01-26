package com.ams.store.hussainappdemoforguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    Button addToCart;
    TextView infoTv;
    RecyclerView ProductListRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoTv =(TextView)findViewById(R.id.infoTv);
        ProductListRv = (RecyclerView)findViewById(R.id.recyclerView);
        ProductListRv.setHasFixedSize(true);
        ProductListRv.setLayoutManager(new LinearLayoutManager(this));
//        getData();
        ArrayList<DataModel> list = new ArrayList<>();
        DataModel dataModel1 = new DataModel("1","Product 1","100",10);
        DataModel dataModel2 = new DataModel("2","Product 2","200",21);
        DataModel dataModel3 = new DataModel("3","Product 3","300",30);
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);

        ProductListRv.setAdapter(new ProductAdapter(this,list));


    }
//    private void getData() {
//
//        Retrofit retrofit = RetroFitClient.getRetrofitInstance();
//        CallMethod jsonPlaceholder = retrofit.create(CallMethod.class);
//        Call<ArrayList<DataModel>> callData = jsonPlaceholder.getAllData();
//        callData.enqueue(new Callback<ArrayList<DataModel>>() {
//            @Override
//            public void onResponse(Call<ArrayList<DataModel>> call, Response<ArrayList<DataModel>> response) {
//                if(!response.isSuccessful()){
//                    infoTv.setVisibility(View.VISIBLE);
//                    infoTv.setText("Code"+response.code());
//                    return;
//                }
//                ArrayList<DataModel> dataModels = response.body();
//                ProductListRv.setAdapter(new ProductAdapter(dataModels));
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<DataModel>> call, Throwable t) {
////                infoTv.setVisibility(View.VISIBLE);
////                infoTv.setText(t.getMessage());
//
//
//            }
//        });
//
//
//
//    }

}