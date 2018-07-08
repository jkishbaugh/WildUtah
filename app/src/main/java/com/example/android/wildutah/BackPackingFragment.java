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
        locations.add(new Location(R.drawable.bowman_trail,getActivity().getString(R.string.backpack_1_name),
                getActivity().getString(R.string.bowman_trail_description),getActivity().getString(R.string.backpack_1_distance),
                getActivity().getString(R.string.backpack_1_address),getActivity().getString(R.string.backpack_1_difficulty)));
        locations.add(new Location(R.drawable.double_top_mountain,getActivity().getString(R.string.backpack_2_name),
                getActivity().getString(R.string.double_top_mountain_description),getActivity().getString(R.string.backpack_2_distance),
                getActivity().getString(R.string.backpack_2_address),getActivity().getString(R.string.backpack_2_difficulty)));
        locations.add(new Location(R.drawable.high_creek_lake,getActivity().getString(R.string.backpack_3_name),
                getActivity().getString(R.string.high_creek_lake_description),getActivity().getString(R.string.backpack_3_distance),
                getActivity().getString(R.string.backpack_3_address),getActivity().getString(R.string.backpack_3_difficulty)));
        locations.add(new Location(R.drawable.naturalist_basin,getActivity().getString(R.string.backpack__4_name),
                getActivity().getString(R.string.naturalist_basin_description),getActivity().getString(R.string.backpack_4_distance),
                getActivity().getString(R.string.backpack_4_address),getActivity().getString(R.string.backpack_4_difficulty)));
        locations.add(new Location(R.drawable.notch_lake,getActivity().getString(R.string.backpack_5_name),
                getActivity().getString(R.string.notch_lake_description),getActivity().getString(R.string.backpack_5_distance),
                getActivity().getString(R.string.backpack_5_address),getActivity().getString(R.string.backpack_5_difficulty)));
        locations.add(new Location(R.drawable.white_pine_lake,getActivity().getString(R.string.backpack_6_name),
                getActivity().getString(R.string.white_pine_lake_description),getActivity().getString(R.string.backpack_6_distance),
                getActivity().getString(R.string.backpack_6_address),getActivity().getString(R.string.backpack_6_difficulty)));


        LocationAdapter backpackAdapter = new LocationAdapter(getActivity(), locations, R.color.category_backpacking);



        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(backpackAdapter);


        return rootView;
    }

}
