package com.swordartist.android.stickeytabs;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Yusuke Yanai on 2017-02-15.
 * 
 * StickyTabsFragment
 */
public class StickyTabsFragment extends Fragment {

    public StickyTabsFragment() {
    }

    /**
     * @return A new instance of fragment StickyTabsFragment.
     */
    public static StickyTabsFragment newInstance() {
        StickyTabsFragment fragment = new StickyTabsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View stickyTabsFragment = inflater.inflate(R.layout.fragment_sticky_tabs, container, false);
        
        // Instantiate a ViewPager and a PagerAdapter.
        ViewPager mPager = (ViewPager) stickyTabsFragment.findViewById(R.id.stickyTabsViewpager);
        ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) stickyTabsFragment.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mPager,true);
        
        return stickyTabsFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * A simple pager adapter that represents 3 Fragment objects, in sequence.
     *
     * Note: FragmentStatePagerAdapter destroys as Fragments that aren't being used. FragmentPagerAdapter does not.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }
        
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Tab1Fragment.newInstance();
                case 1:
                    return Tab1Fragment.newInstance();
                case 2:
                    return Tab1Fragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Page1";
                case 1:
                    return "Page2";
                case 2:
                    return "Page3";
            }
            return null;
        }
    }
}
