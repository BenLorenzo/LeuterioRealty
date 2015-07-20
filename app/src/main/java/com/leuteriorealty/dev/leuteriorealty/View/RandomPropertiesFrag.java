package com.leuteriorealty.dev.leuteriorealty.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leuteriorealty.dev.leuteriorealty.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RandomPropertiesFrag extends Fragment {


    public RandomPropertiesFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_random_properties, container, false);
    }


}
