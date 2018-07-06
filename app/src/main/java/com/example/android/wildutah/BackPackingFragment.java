package com.example.android.wildutah;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BackPackingFragment extends Fragment {


    public BackPackingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.bowman_trail,"Bowman Trail",
                getActivity().getString(R.string.bowman_trail_description),"Distance: 5.7 miles",
                " 40.696861°, -111.716073°","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.double_top_mountain,"Double Top Mountain",
                getActivity().getString(R.string.double_top_mountain_description),"Distance: 6.44 miles",
                "42.01118N, 111.59671W","Difficulty: Easy"));
        locations.add(new Location(R.drawable.high_creek_lake,"High Creek Lake",
                getActivity().getString(R.string.high_creek_lake_description),"Distance: 11.54 miles",
                "41.97431N, 111.70912W","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.naturalist_basin,"Naturalist Basin",
                getActivity().getString(R.string.naturalist_basin_description),"Distance: 15.5 miles",
                " 40.721951°, -110.864152°","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.notch_lake,"Notch Lake",
                getActivity().getString(R.string.notch_lake_description),"Distance: 5.4 miles",
                "40.688944°,-110.903903°","Difficulty: Easy"));
        locations.add(new Location(R.drawable.white_pine_lake,"White Pine Lake",
                getActivity().getString(R.string.white_pine_lake_description),"Distance: 8.05 miles",
                "41.89493N, 111.64239W","Difficulty: Moderate"));


        LocationAdapter backpackAdapter = new LocationAdapter(getActivity(), locations, R.color.category_backpacking);



        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(backpackAdapter);


        return rootView;
    }

}
