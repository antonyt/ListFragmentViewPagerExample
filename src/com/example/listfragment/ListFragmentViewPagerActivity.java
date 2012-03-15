package com.example.listfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class ListFragmentViewPagerActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);

	ViewPager pager = (ViewPager) findViewById(R.id.pager);
	pager.setAdapter(new ExamplePagerAdapter(getSupportFragmentManager()));
    }

    public class ExamplePagerAdapter extends FragmentPagerAdapter {

	public ExamplePagerAdapter(FragmentManager fm) {
	    super(fm);
	}

	@Override
	public int getCount() {
	    return 5;
	}

	@Override
	public Fragment getItem(int position) {
	    Fragment fragment = new ExampleListFragment();

	    // set arguments here, if required
	    Bundle args = new Bundle();
	    // args.put(...)
	    fragment.setArguments(args);

	    return fragment;
	}
    }
}