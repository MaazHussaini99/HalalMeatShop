package com.example.halalmeatshop.ui.login;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class SignUpAdapter extends FragmentStateAdapter {

    private Context context;
    int totalTabs;

    public SignUpAdapter(FragmentManager fm, Context context, int totalTabs, Lifecycle lifecycle){
        super(fm, lifecycle);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment1 = new SignUpFragment();
        Bundle args = new Bundle();
        args.putString(SignUpFragment.TITLE, "Sign Up");
        fragment1.setArguments(args);
        return fragment1;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}