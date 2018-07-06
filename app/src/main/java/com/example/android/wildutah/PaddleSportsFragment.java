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
        locations.add(new Location(R.drawable.colorado_river_day_float,"Colorado River Day Float",
                getActivity().getString(R.string.colorado_river_description),"Distance: 9.1 miles",
                "38.69569, -109.41353","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.mantua_reservoir,"Mantua Reservoir",
                getActivity().getString(R.string.mantua_resevoir_description),"Distance: TBD",
                "Mantua Reservoir, Mantua, UT 84324","Difficulty: Easy"));
        locations.add(new Location(R.drawable.mirror_lake,"Mirror Lake",
                getActivity().getString(R.string.mirror_lake_description),"Distance: 2.8 miles",
                "Mirror Lake, Utah 84031","Difficulty: Easy"));
        locations.add(new Location(R.drawable.smith_and_morehouse,"Smith & Morehouse Reservoir",
                getActivity().getString(R.string.smith_moorehouse_description),"Distance: 2.5 miles",
                "Smith and Morehouse Reservoir, Utah 84036","Difficulty: Easy"));
        locations.add(new Location(R.drawable.willard_bay,"Willard Bay",
                getActivity().getString(R.string.willard_bay_description),"Distance: 1.2 miles",
                "Willard Bay, Utah","Difficulty: Easy"));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_paddle_sports);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
