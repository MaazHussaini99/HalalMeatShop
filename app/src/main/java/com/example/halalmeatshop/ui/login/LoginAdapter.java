package com.example.halalmeatshop.ui.login;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class LoginAdapter extends FragmentStateAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs, Lifecycle lifecycle){
        super(fm, lifecycle);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position == 0){
            Fragment fragment = new LoginFragment();
            Bundle args = new Bundle();
            args.putString(LoginFragment.TITLE, "Login");
            fragment.setArguments(args);
            return fragment;
        }else if (position == 1){
            Fragment fragment1 = new SignUpFragment();
            Bundle args = new Bundle();
            args.putString(SignUpFragment.TITLE, "Sign Up");
            fragment1.setArguments(args);
            return fragment1;
        }

return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
