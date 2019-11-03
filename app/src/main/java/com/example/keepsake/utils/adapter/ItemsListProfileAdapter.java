package com.example.keepsake.utils.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.keepsake.R;
import com.example.keepsake.database.firebaseSnapshot.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ItemsListProfileAdapter extends RecyclerView.Adapter<ItemsListProfileAdapter.ViewHolder> {

    public List<Item> itemsList;
    public ImageView urlView;

    public ItemsListProfileAdapter(List<Item> itemsList) {

        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemsListProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsListProfileAdapter.ViewHolder holder, int position) {

        // Loads the name from database into the viewer
        holder.nameText.setText(itemsList.get(position).getName());
        // Loads the description from database into the viewer
        holder.descriptionText.setText(itemsList.get(position).getDescription());
        // Loads the image from database into the viewer
        Picasso.get().load(itemsList.get(position).getUrl()).into(urlView);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View mView;

        public TextView nameText;
        public TextView descriptionText;
        public TextView urlText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView;

            nameText = (TextView) mView.findViewById(R.id.timelineFamilyName);
            descriptionText = (TextView) mView.findViewById(R.id.description);
            urlText =  mView.findViewById(R.id.url);
            urlView = mView.findViewById(R.id.urlView);
        }
    }
}