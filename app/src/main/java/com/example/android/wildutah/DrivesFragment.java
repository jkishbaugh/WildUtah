package com.example.android.wildutah;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrivesFragment extends Fragment {


    public DrivesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
       locations.add(new Location(R.drawable.alpine_loop, "Alpine Loop",
               getActivity().getString(R.string.alpine_loop_description),"Distance: 20 miles"));
        locations.add(new Location(R.drawable.gandy_warm_springs, "Gandy Warm Springs",
                getActivity().getString(R.string.gandy_warm_springs_description),"Distance: 4 1/2 hour drive"));
        locations.add(new Location(R.drawable.liberty_avon_road, "Liberty-Avon Road",
                getActivity().getString(R.string.liberty_avon_road_description),"Distance: 1-2 hour drive"));
        locations.add(new Location(R.drawable.little_bear_river_porcupine_reservoir_salmon_run, "Little Bear River Salmon Run",
                getActivity().getString(R.string.little_bear_river_description),"Distance: 1-2 hour drive"));
        locations.add(new Location(R.drawable.logan_canyon_scenic_byway, "Logan Canyon Scenic Byway",
                getActivity().getString(R.string.logan_canyon_description),"Distance:  39 miles"));
        locations.add(new Location(R.drawable.tour_tilted_rocks, "Tour of Tilted Rocks",
                getActivity().getString(R.string.tilted_rocks_description),"Distance: 10 miles"));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_drives);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
