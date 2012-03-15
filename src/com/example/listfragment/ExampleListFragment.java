package com.example.listfragment;

import java.util.ArrayList;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ExampleListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // normally you should inflate a view here and save references
	// using ListFragment default layout for this example
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    
    @Override
    public void onStart() {
	super.onStart();
	new CreateArrayListTask().execute();
    }

    private class CreateArrayListTask extends AsyncTask<String, Void, ArrayList<String>> {
	@Override
	protected ArrayList<String> doInBackground(String... params) {
	    ArrayList<String> linkArray = new ArrayList<String>();
	    linkArray.add("Item 1");
	    linkArray.add("Item 2");
	    return linkArray;
	}

	protected void onPostExecute(ArrayList<String> linkArray) {
	    ArrayAdapter<String> a = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, linkArray);
	    setListAdapter(a);
	}
    }

}
