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
public class PaddleSportsFragment extends Fragment {


    public PaddleSportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.colorado_river_day_float,getActivity().getString(R.string.paddle_sports_1_name),
                getActivity().getString(R.string.colorado_river_description),getActivity().getString(R.string.paddle_sports_1_distance),
                getActivity().getString(R.string.paddle_sports_1_address),getActivity().getString(R.string.paddle_sports_1_difficulty)));

        locations.add(new Location(R.drawable.mantua_reservoir,getActivity().getString(R.string.paddle_sports_2_name),
                getActivity().getString(R.string.mantua_resevoir_description),getActivity().getString(R.string.paddle_sports_2_distance),
                getActivity().getString(R.string.paddle_sports_2_address),getActivity().getString(R.string.paddle_sports_2_difficulty)));

        locations.add(new Location(R.drawable.mirror_lake,getActivity().getString(R.string.paddle_sports_3_name),
                getActivity().getString(R.string.mirror_lake_description),getActivity().getString(R.string.paddle_sports_3_distance),
                getActivity().getString(R.string.paddle_sports_3_address),getActivity().getString(R.string.paddle_sports_3_difficulty)));

        locations.add(new Location(R.drawable.smith_and_morehouse,getActivity().getString(R.string.paddle_sports_4_name),
                getActivity().getString(R.string.smith_moorehouse_description),getActivity().getString(R.string.paddle_sports_4_distance),
                getActivity().getString(R.string.paddle_sports_4_address),getActivity().getString(R.string.paddle_sports_4_difficulty)));

        locations.add(new Location(R.drawable.willard_bay,getActivity().getString(R.string.paddle_sports_5_name),
                getActivity().getString(R.string.willard_bay_description),getActivity().getString(R.string.paddle_sports_5_distance),
                getActivity().getString(R.string.paddle_sports_5_address),getActivity().getString(R.string.paddle_sports_5_difficulty)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_paddle_sports);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
