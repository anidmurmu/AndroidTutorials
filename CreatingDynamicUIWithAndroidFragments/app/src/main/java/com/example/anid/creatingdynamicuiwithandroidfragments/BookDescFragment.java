package com.example.anid.creatingdynamicuiwithandroidfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookDescFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        View viewHierarchy =
                inflater.inflate(R.layout.fragment_book_desc, container,
                        false);
        return viewHierarchy;
    }
}