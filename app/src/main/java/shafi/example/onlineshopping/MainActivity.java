package shafi.example.onlineshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import shafi.example.onlineshopping.adapter.ProductAdapter;
import shafi.example.onlineshopping.adapter.ProductCatAdapter;
import shafi.example.onlineshopping.model.ProductCategory;
import shafi.example.onlineshopping.model.Products;

public class MainActivity extends AppCompatActivity {

    ProductCatAdapter productCatAdapter;
    RecyclerView productRecycler,prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All Products"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"Hair"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1,"Fragrantica Date For Men Fragrance One for men","pRICE","540TK",R.drawable.product1));
        productsList.add(new Products(2,"Fragrantica Date For Men Fragrance One for men","250 ml","560TK",R.drawable.product1));
        productsList.add(new Products(3,"Fragrantica Date For Men Fragrance One for men","250 ml","560TK",R.drawable.product1));
        productsList.add(new Products(4,"Fragrantica Date For Men Fragrance One for men","250 ml","560TK",R.drawable.product1));
        productsList.add(new Products(5,"Fragrantica Date For Men Fragrance One for men","250 ml","560TK",R.drawable.product1));
        productsList.add(new Products(6,"Fragrantica Date For Men Fragrance One for men","250 ml","pRICE",R.drawable.product1));
        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){
        productRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        productRecycler.setLayoutManager(layoutManager);
        productCatAdapter = new ProductCatAdapter(this,productCategoryList);
        productRecycler.setAdapter(productCatAdapter);

    }

    private void setProdItemRecycler(List<Products> productsList){
        prodItemRecycler = findViewById(R.id.productRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }


}