package com.mvp3.myvegancityfinal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private String[] titles= new String[]{"Search City", "Vegan 101", "Easy Fast Food", "Vegan Swaps"};

    public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new CitySearch();
            case 1:
                return new Vegan101();
            case 2:
                return new EasyFastFood();
            case 3:
                return new VeganSwaps();
        }
        return new CitySearch();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
