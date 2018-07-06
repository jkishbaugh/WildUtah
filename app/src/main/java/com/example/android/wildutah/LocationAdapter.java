package com.example.android.wildutah;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public LocationAdapter( Context context,  ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
        }

        //get current list item location
        Location currentLocation = getItem(position);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        ImageView image = listItemView.findViewById(R.id.image);
        if (currentLocation != null) {
            if(currentLocation.hasImage()){
                image.setImageResource(currentLocation.getImageResourceId());

                image.setVisibility(View.VISIBLE);
            }else{
                image.setVisibility(View.GONE);
            }
        }
        TextView locationName = listItemView.findViewById(R.id.name);
        if (currentLocation != null) {
            locationName.setText(currentLocation.getTrailName());
        }

        TextView locationDescription = listItemView.findViewById(R.id.description);
        if (currentLocation != null) {
            locationDescription.setText(currentLocation.getTrailDescription());
        }

        TextView locationDifficulty = listItemView.findViewById(R.id.difficulty);
        if (currentLocation != null) {
            if (currentLocation.hasDifficulty()) {
                locationDifficulty.setText(currentLocation.getDifficulty());
                locationDifficulty.setVisibility(View.VISIBLE);
            } else {
                locationDifficulty.setVisibility(View.GONE);
            }
        }

        TextView locationDistance = listItemView.findViewById(R.id.distance);
        if (currentLocation != null) {
            if (currentLocation.hasDistance()) {
                locationDistance.setText(currentLocation.getTrailDistance());
                locationDistance.setVisibility(View.VISIBLE);
            }else{
                locationDistance.setVisibility(View.GONE);
            }
        }
        TextView fee = listItemView.findViewById(R.id.fee);
        if (currentLocation != null) {
            if (currentLocation.hasFee()) {
                fee.setText(currentLocation.getFee());
                locationDistance.setVisibility(View.GONE);
                fee.setVisibility(View.VISIBLE);
            }else{
               fee.setVisibility(View.GONE);
            }
        }
        TextView numberOfCampsites = listItemView.findViewById(R.id.campsites);
        if (currentLocation != null) {
            if (currentLocation.hasCampsites()) {
                numberOfCampsites.setText(currentLocation.getmNumberCampSites());
                locationDifficulty.setVisibility(View.GONE);
                numberOfCampsites.setVisibility(View.VISIBLE);
            }else{
                numberOfCampsites.setVisibility(View.GONE);
            }
        }


        return listItemView;
    }
}
