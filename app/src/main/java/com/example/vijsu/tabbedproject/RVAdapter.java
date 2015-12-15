package com.example.vijsu.tabbedproject;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vijsu on 12/15/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MenuViewHolder> {
    List<MenuItems> menuItemsList;

    RVAdapter(List<MenuItems> menuItemsList){
        this.menuItemsList = menuItemsList;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_veiw,viewGroup,false);
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.MenuItemName.setText(menuItemsList.get(i).itemName);
        menuViewHolder.MenuItemPrice.setText(menuItemsList.get(i).itemPrice);
        menuViewHolder.MenuItemImage.setImageResource(menuItemsList.get(i).itemImage);
    }

    @Override
    public int getItemCount() {
        return menuItemsList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView MenuItemName;
        TextView MenuItemPrice;
        ImageView MenuItemImage;

        MenuViewHolder(View itemView){
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cardView);
            MenuItemName = (TextView)itemView.findViewById(R.id.itemName);
            MenuItemPrice = (TextView)itemView.findViewById(R.id.itemPrice);
            MenuItemImage = (ImageView)itemView.findViewById(R.id.itemImage);
        }
    }


}
