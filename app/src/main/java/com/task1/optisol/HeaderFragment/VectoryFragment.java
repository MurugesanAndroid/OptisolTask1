package com.task1.optisol.HeaderFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task1.optisol.ChildFfragment.NearbyFragment;
import com.task1.optisol.ChildFfragment.PopularFragment;
import com.task1.optisol.ChildFfragment.SearchFragment;
import com.task1.optisol.R;

public class VectoryFragment extends Fragment {

    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_header,container,false);
        initWidget(view);
        return view;
    }


    private void initWidget(View v) {
        initTabs(v);
    }

    private void initTabs(View v) {
        tabLayout = v.findViewById(R.id.inner_tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Popular"));
        tabLayout.addTab(tabLayout.newTab().setText("Nearby"));
        tabLayout.addTab(tabLayout.newTab().setText("Search"));
        replaceFragment(new PopularFragment());
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    replaceFragment(new PopularFragment());

                }else if(tab.getPosition() == 1){
                    replaceFragment(new NearbyFragment());

                }else if(tab.getPosition() == 2) {
                    replaceFragment(new SearchFragment());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
