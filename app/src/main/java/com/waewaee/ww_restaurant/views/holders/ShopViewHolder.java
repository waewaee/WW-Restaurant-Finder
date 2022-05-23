package com.waewaee.ww_restaurant.views.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.ww_restaurant.delegates.ShopItemDelegate;

public class ShopViewHolder extends RecyclerView.ViewHolder {

    public ShopViewHolder(@NonNull View itemView, ShopItemDelegate shopItemDelegate) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shopItemDelegate.onTapShop();
            }
        });
    }
}
