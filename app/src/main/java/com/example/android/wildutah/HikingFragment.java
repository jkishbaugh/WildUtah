package com.example.android.wildutah;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HikingFragment extends Fragment {


    public HikingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(R.drawable.bear_river_migratory_bird_refuge,getActivity().getString(R.string.hike_1_name),
                getActivity().getString(R.string.bear_river_migratory_refuge),getActivity().getString(R.string.hike_1_distance),
                getActivity().getString(R.string.hike_1_address),getActivity().getString(R.string.hike_1_difficulty)));
        locations.add(new Location(R.drawable.baker_mine,getActivity().getString(R.string.hike_2_name),
                getActivity().getString(R.string.baker_mine),getActivity().getString(R.string.hike_2_distance),
                getActivity().getString(R.string.hike_2_address),getActivity().getString(R.string.hike_2_difficulty)));
        locations.add(new Location(R.drawable.bluebell_mine,getActivity().getString(R.string.hike_3_name),
                getActivity().getString(R.string.bluebell_mine_description),getActivity().getString(R.string.hike_3_distance),
                getActivity().getString(R.string.hike_3_address),getActivity().getString(R.string.hike_3_difficulty)));
        locations.add(new Location(R.drawable.deuel_creek,getActivity().getString(R.string.hike_4_name),
                getActivity().getString(R.string.deuel_creek_description),getActivity().getString(R.string.hike_4_distance),
                getActivity().getString(R.string.hike_4_address),getActivity().getString(R.string.hike_4_difficulty)));
        locations.add(new Location(R.drawable.east_mountain_wilderness_park,getActivity().getString(R.string.hike_5_name),
                getActivity().getString(R.string.east_mountain_description),getActivity().getString(R.string.hike_5_distance),
                getActivity().getString(R.string.hike_5_address),getActivity().getString(R.string.hike_5_difficulty)));
        locations.add(new Location(R.drawable.jardine_juniper,getActivity().getString(R.string.hike_6_name),
                getActivity().getString(R.string.jardine_juniper_description),getActivity().getString(R.string.hike_6_distance),
                getActivity().getString(R.string.hike_6_address),getActivity().getString(R.string.hike_6_difficulty)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_hiking);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);


        return rootView;
    }

}
