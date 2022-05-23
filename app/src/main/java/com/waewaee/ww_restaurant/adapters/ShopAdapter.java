package com.waewaee.ww_restaurant.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.ww_restaurant.R;
import com.waewaee.ww_restaurant.delegates.ShopItemDelegate;
import com.waewaee.ww_restaurant.views.holders.ShopViewHolder;

public class ShopAdapter extends RecyclerView.Adapter<ShopViewHolder> {

    private ShopItemDelegate mShopItemDelegate;

    public ShopAdapter(ShopItemDelegate shopItemDelegate) {
        mShopItemDelegate = shopItemDelegate;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_shop, parent, false);
        return new ShopViewHolder(itemView, mShopItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
