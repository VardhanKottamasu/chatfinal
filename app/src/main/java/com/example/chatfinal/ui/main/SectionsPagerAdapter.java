package com.example.chatfinal.ui.main;

import android.content.Context;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatfinal.R;
import com.example.chatfinal.Tab1Chats;
import com.example.chatfinal.Tab2Groups;
import com.example.chatfinal.Tab3Nearby;
import com.example.chatfinal.Tab4Active;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Tab1Chats tab1=new Tab1Chats();
                return tab1;

            case 1:
                Tab2Groups tab2=new Tab2Groups();
                return tab2;

            case 2:
                Tab3Nearby tab3=new Tab3Nearby();
                return tab3;
            case 3:
                Tab4Active tab4=new Tab4Active();
                return tab4;
            default:
                return null;
        }
    }

//    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}