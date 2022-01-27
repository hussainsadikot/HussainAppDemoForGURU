package com.ams.store.hussainappdemoforguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>  {
    private ArrayList<DataModel> productList;
    private ArrayList<DataModel> fullProductList;
    private Context context;

    public ProductAdapter(Context context,ArrayList<DataModel> productList){
        this.context = context;
        this.productList = productList;
        fullProductList = new ArrayList<>(productList);

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
        final DataModel product = productList.get(position);
        String id = productList.get(position).getId();
        String title = productList.get(position).getTitle();
        String price = productList.get(position).getPrice();
        String qty = Integer.toString(productList.get(position).getQty());

        holder.productId.setText(id);
        holder.productTitle.setText(title);
        holder.productPrice.setText(price);
        holder.qtyTotal.setText(qty);
        holder.qtyIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int currentQty = product.getQty()+1;
                 productList.get(holder.getAbsoluteAdapterPosition()).setQty(currentQty);
                 notifyItemChanged(holder.getAbsoluteAdapterPosition());
            }
        });
        holder.qtyDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentQty = product.getQty();
                if (currentQty==0){
                    productList.get(holder.getAbsoluteAdapterPosition()).setQty(currentQty);
                }else {
                    currentQty = product.getQty()-1;
                    productList.get(holder.getAbsoluteAdapterPosition()).setQty(currentQty);
                }

                notifyItemChanged(holder.getAbsoluteAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

//    @Override
//    public Filter getFilter(){
////        return exampleFilter;
//        return null;
//    }


//    private Filter exampleFilter = new Filter() {
//        @Override
//        protected FilterResults performFiltering(CharSequence charSequence) {
//            ArrayList<DataModel> filteredProduct = new ArrayList<>();
//            if (charSequence == null || charSequence.length()==0){
//                productList.
//            }
//            return null ;
//        }
//
//        @Override
//        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//
//        }
//    }


    public class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView qtyTotal,productId,
        productTitle ,productPrice;
        Button qtyIncrement,qtyDecrement;

        public ProductViewHolder(View itemView){
            super(itemView);
            productId=(TextView)itemView.findViewById(R.id.product_id);
            productTitle=(TextView)itemView.findViewById(R.id.product_title);
            productPrice=(TextView)itemView.findViewById(R.id.product_price);
            qtyTotal=(TextView)itemView.findViewById(R.id.qtyTV);
            qtyIncrement=(Button) itemView.findViewById(R.id.increase);
            qtyDecrement=(Button) itemView.findViewById(R.id.decrease);

        }

    }

}
