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
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trail_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.arches,getActivity().getString(R.string.national_park_1_name),
                getActivity().getString(R.string.arches_description)));
        locations.add(new Location(R.drawable.bryce_canyon,getActivity().getString(R.string.national_park_2_name),
                getActivity().getString(R.string.bryce_canyon_description)));
        locations.add(new Location(R.drawable.canyon_lands,getActivity().getString(R.string.national_park_3_name),
                getActivity().getString(R.string.canyonlands_description)));
        locations.add(new Location(R.drawable.dinosaur,getActivity().getString(R.string.national_park_4_name),
                getActivity().getString(R.string.dinosaur_description)));
        locations.add(new Location(R.drawable.golden_spike,getActivity().getString(R.string.national_park_5_name),
                getActivity().getString(R.string.golden_spike_description)));
        locations.add(new Location(R.drawable.zion,getActivity().getString(R.string.national_park_6_name),
                getActivity().getString(R.string.zion_description)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_national_parks);


        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }

}
