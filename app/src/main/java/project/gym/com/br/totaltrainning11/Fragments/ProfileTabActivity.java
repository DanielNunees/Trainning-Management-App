package project.gym.com.br.totaltrainning11.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import project.gym.com.br.totaltrainning11.R;

@SuppressWarnings("deprecation")
public class ProfileTabActivity extends Fragment {


    public static ProfileTabActivity newInstance (){
        ProfileTabActivity fragmentFirst = new ProfileTabActivity();
        Bundle args = new Bundle();
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_tab, container, false);
        return view;
    }

}
