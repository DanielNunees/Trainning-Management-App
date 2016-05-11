package project.gym.com.br.totaltrainning11.Fragments;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import project.gym.com.br.totaltrainning11.R;
import project.gym.com.br.totaltrainning11.TabsTrasaction.FinishTabsActivity;
import project.gym.com.br.totaltrainning11.TrainningDayActivity;

/**
 * Created by DanielPC on 31/10/2015.
 */
public class TrainningTabActivity extends Fragment {

    public static TrainningTabActivity newInstance (){
        TrainningTabActivity fragmentSecond = new TrainningTabActivity();
        Bundle args = new Bundle();
        fragmentSecond.setArguments(args);
        return fragmentSecond;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.trainning_tab, container, false);


        Button monday = (Button) view.findViewById(R.id.monday);
        monday.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Toast.makeText(getActivity(), "Clique on monday", Toast.LENGTH_SHORT).show();
                                          Intent intent = new Intent(getActivity(),TrainningDayActivity.class);
                                          startActivity(intent);
                                      }
                                  });



                Button tuesday = (Button) view.findViewById(R.id.tuesday);
                tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clique on Tuesday", Toast.LENGTH_SHORT).show();
                    }
                });

                Button wednesday = (Button) view.findViewById(R.id.wednesday);
                wednesday.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clique on wednesday", Toast.LENGTH_SHORT).show();
                    }
                });

                Button thursday = (Button) view.findViewById(R.id.thursday);
                thursday.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clique on thursday", Toast.LENGTH_SHORT).show();
                    }
                });

                Button friday = (Button) view.findViewById(R.id.friday);
                friday.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clique on friday", Toast.LENGTH_SHORT).show();
                    }
                });

                Button saturday = (Button) view.findViewById(R.id.saturday);
                saturday.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clique on saturday", Toast.LENGTH_SHORT).show();
                    }
                });


                return view;

            }
        }


