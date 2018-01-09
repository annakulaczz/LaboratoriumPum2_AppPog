package com.example.ania.apppog;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ania on 2018-01-09.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place> places = new ArrayList<>();
    PlaceAdapter(ArrayList<Place> places)
    {
        this.places = places;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setPlaceName(places.get(position).getPlaceName());
        holder.setInfo(places.get(position).getInformation() + "");
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.placeName)
        TextView placeName;

        @BindView(R.id.itemInfo)
        TextView itemInfo;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private  void setPlaceName(String name)
        {
            placeName.setText(name);
        }
        public void setInfo(String info)
        {
            itemInfo.setText(info);
        }
    }
}
