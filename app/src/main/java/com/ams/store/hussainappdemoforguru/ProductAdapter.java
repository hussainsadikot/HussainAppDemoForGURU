package com.ams.store.hussainappdemoforguru;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<DataModel> productList;

    public ProductAdapter(ArrayList<DataModel> productList){
        this.productList = productList;

    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        String id = productList.get(position).getId();
        String title = productList.get(position).getTitle();
        String price = productList.get(position).getPrice();
        String qty = productList.get(position).getQty();
        holder.productId.setText(id);
        holder.productTitle.setText(title);
        holder.productPrice.setText(price);
        holder.qtyTotal.setText(qty);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView qtyTotal,productId,
        productTitle ,productPrice;
        Button qtyIncrement,qtyDecrement;

        public ProductViewHolder(View itemView){
            super(itemView);
            productId=(TextView)itemView.findViewById(R.id.product_id);
            productId=(TextView)itemView.findViewById(R.id.product_title);
            productId=(TextView)itemView.findViewById(R.id.product_price);
            qtyTotal=(TextView)itemView.findViewById(R.id.qtyTV);
            qtyIncrement=(Button) itemView.findViewById(R.id.increase);
            qtyDecrement=(Button) itemView.findViewById(R.id.decrease);




        }
    }
}
