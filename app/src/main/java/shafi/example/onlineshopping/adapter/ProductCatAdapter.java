package shafi.example.onlineshopping.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import shafi.example.onlineshopping.R;
import shafi.example.onlineshopping.model.ProductCategory;

public class ProductCatAdapter extends RecyclerView.Adapter<ProductCatAdapter.ProductViewHolder>{

    Context context;
    List<ProductCategory> productCategoryList;

    public ProductCatAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.catagory_row_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.catagoryName.setText(productCategoryList.get(position).getProductName());
    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView catagoryName;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            catagoryName = itemView.findViewById(R.id.cat_name);
        }
    }
}
