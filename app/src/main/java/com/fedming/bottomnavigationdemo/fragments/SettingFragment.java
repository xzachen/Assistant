package com.fedming.bottomnavigationdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.fedming.bottomnavigationdemo.Model.User;
import com.fedming.bottomnavigationdemo.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {
    private CircleImageView imageview;
    private TextView username;



    public SettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.diagonallayout_activity_main, null);
        initSettingView(view);
        return view;
    }

    public void initSettingView(View view) {
        username = (TextView) view.findViewById(R.id.username);
        imageview = (CircleImageView) view.findViewById(R.id.imageView);
        User user = (User) getActivity().getIntent().getSerializableExtra("person_data");
        username.setText(user.getName());
        Glide.with(getActivity()).load(user.getImageUri()).into(imageview);

    }

}
