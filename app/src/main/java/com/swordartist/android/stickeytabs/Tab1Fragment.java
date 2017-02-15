package com.swordartist.android.stickeytabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Yusuke Yanai on 2017-02-15.
 *
 * Tab1Fragment
 */
public class Tab1Fragment extends Fragment {
    
    public Tab1Fragment() {
    }
    
    public static Tab1Fragment newInstance() {
        Tab1Fragment fragment = new Tab1Fragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }

}
