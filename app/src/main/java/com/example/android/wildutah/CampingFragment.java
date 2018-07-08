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
public class CampingFragment extends Fragment {


    public CampingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
       locations.add(new Location(getActivity().getString(R.string.campground_1_name), getActivity().getString(R.string.box_elder_campground),
               getActivity().getString(R.string.campground_1_fee),getActivity().getString(R.string.campground_1_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_2_name), getActivity().getString(R.string.weber_memorial_campground),
                getActivity().getString(R.string.campground_2_fee),getActivity().getString(R.string.campground_2_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_3_name), getActivity().getString(R.string.north_fork_campground),
                getActivity().getString(R.string.campground_3_fee),getActivity().getString(R.string.campground_3_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_4_name), getActivity().getString(R.string.monte_cristo_campground),
                getActivity().getString(R.string.campground_4_fee),getActivity().getString(R.string.campground_4_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_5_name), getActivity().getString(R.string.fort_buenaventura_campground),
                getActivity().getString(R.string.campground_5_fee),getActivity().getString(R.string.campground_5_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_6_name), getActivity().getString(R.string.willard_bay_campground),
                getActivity().getString(R.string.campground_6_fee),getActivity().getString(R.string.campground_6_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_7_name), getActivity().getString(R.string.south_fork_campground),
                getActivity().getString(R.string.campground_7_fee),getActivity().getString(R.string.campground_7_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_8_name), getActivity().getString(R.string.bridger_bay_campground),
                getActivity().getString(R.string.campground_8_fee),getActivity().getString(R.string.campground_8_sites)));
        locations.add(new Location(getActivity().getString(R.string.campground_9_name), getActivity().getString(R.string.bountiful_creek_campground),
                getActivity().getString(R.string.campground_9_fee),getActivity().getString(R.string.campground_9_sites)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_camping);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
