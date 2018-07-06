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
        locations.add(new Location(R.drawable.adams_canyon_cabin,"Adams Cabin Trail",
                getActivity().getString(R.string.adams_canyon_description),"Distance: 3.5 miles",
                "41° 3.978’N, 111° 54.591’W","Difficulty: Easy"));
        locations.add(new Location(R.drawable.bear_river_migratory_bird_refuge,"Bear River Bird Refuge",
                getActivity().getString(R.string.bear_river_migratory_refuge),"Distance: varies",
                "41.479102°N, -112.267650°W","Difficulty: Easy"));
        locations.add(new Location(R.drawable.baker_mine,"Baker Mine Trail",
                getActivity().getString(R.string.baker_mine),"Distance: 3 miles",
                "Baker Mine, Wellsville, UT 84339","Difficulty: Difficult"));
        locations.add(new Location(R.drawable.bluebell_mine,"Bluebell Mine",
                getActivity().getString(R.string.bluebell_mine_description),"Distance: 9.08",
                " 41º 24′ 47″ N, 111º 50′ 36″ W","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.deuel_creek,"Deuel Creek Trail",
                getActivity().getString(R.string.deuel_creek_description),"About 2 miles",
                "40.917337°, -111.863836°″ W","Difficulty: Moderate"));
        locations.add(new Location(R.drawable.east_mountain_wilderness_park,"East Mountain Park",
                getActivity().getString(R.string.east_mountain_description),"1 mile",
                "41° 2’48.02″N – 111°54’17.06″W","Difficulty: Easy"));
        locations.add(new Location(R.drawable.jardine_juniper,"Jardine Juniper Trail",
                getActivity().getString(R.string.jardine_juniper_description),"11 miles",
                "41.81605 N, 111.63267 W","Difficulty: Moderate"));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_hiking);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location location = locations.get(position);


            }
        });
*/


        return rootView;
    }

}
