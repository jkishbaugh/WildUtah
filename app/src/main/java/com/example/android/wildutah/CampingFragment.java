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
       locations.add(new Location("Box Elder Campground", getActivity().getString(R.string.box_elder_campground),
               "Fee: $22/night","Sites: 4 group & several singles"));
        locations.add(new Location("Weber Memorial Campgrounnd", getActivity().getString(R.string.weber_memorial_campground),
                "Fee: $20/day","Sites: 60"));
        locations.add(new Location("North Fork Campground", getActivity().getString(R.string.north_fork_campground),
                "Fee: $20/day","Sites: 200"));
        locations.add(new Location("Monte Cristo Campground", getActivity().getString(R.string.monte_cristo_campground),
                "Fee: $23/day","Sites: 44"));
        locations.add(new Location("Fort Buenaventura Campground", getActivity().getString(R.string.fort_buenaventura_campground),
                "Fee: $20/day","Sites: several(large & single)"));
        locations.add(new Location("Willard Bay Campground", getActivity().getString(R.string.willard_bay_campground),
                "Fee: $30/night","Sites: multiple"));
        locations.add(new Location("South Fork Campground", getActivity().getString(R.string.south_fork_campground),
                "Fee: $23/night","Sites: multiple"));
        locations.add(new Location("Bridger Bay Campground", getActivity().getString(R.string.bridger_bay_campground),
                "Fee: $15/day","Sites: few"));
        locations.add(new Location("Bountiful Creek Campground", getActivity().getString(R.string.bountiful_creek_campground),
                "Fee: $16/day","Sites: 39"));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_camping);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
