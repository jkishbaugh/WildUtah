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
       locations.add(new Location(R.drawable.alpine_loop, getActivity().getString(R.string.drive_1_name),
               getActivity().getString(R.string.alpine_loop_description),getActivity().getString(R.string.drive_1_distance)));

        locations.add(new Location(R.drawable.gandy_warm_springs, getActivity().getString(R.string.drive_2_name),
                getActivity().getString(R.string.gandy_warm_springs_description),getActivity().getString(R.string.drive_2_distance)));

        locations.add(new Location(R.drawable.liberty_avon_road, getActivity().getString(R.string.drive_3_name),
                getActivity().getString(R.string.liberty_avon_road_description),getActivity().getString(R.string.drive_3_distance)));

        locations.add(new Location(R.drawable.little_bear_river_porcupine_reservoir_salmon_run, getActivity().getString(R.string.drive_4_name),
                getActivity().getString(R.string.little_bear_river_description),getActivity().getString(R.string.drive_4_distance)));

        locations.add(new Location(R.drawable.logan_canyon_scenic_byway, getActivity().getString(R.string.drive_5_name),
                getActivity().getString(R.string.logan_canyon_description),getActivity().getString(R.string.drive_5_distance)));

        locations.add(new Location(R.drawable.tour_tilted_rocks, getActivity().getString(R.string.drive_6_name),
                getActivity().getString(R.string.tilted_rocks_description),getActivity().getString(R.string.drive_6_distance)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_drives);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
