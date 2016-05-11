package project.gym.com.br.totaltrainning11;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;
import project.gym.com.br.totaltrainning11.Fragments.TrainningFragment;
import project.gym.com.br.totaltrainning11.domain.Exercices;

public class TrainningDayActivity extends ActionBarActivity {

    private static String TAG = "LOG";
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trainning_day_layout);

        mToolbar = (Toolbar) findViewById(R.id.tb_main);
        mToolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        mToolbar.setSubtitleTextColor(Color.parseColor("#FFFFFF"));
        mToolbar.setTitle("Segunda-Feira");
        mToolbar.setSubtitle("Treino");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

         //FRAGMENT
        TrainningFragment frag = (TrainningFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if(frag == null) {
            frag = new TrainningFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_container, frag, "mainFrag");
            ft.commit();
        }
    }


        public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_finish_tabs, menu);
        return true;
    }


    public List<Exercices> getSetExercicesList(int qnt){
        String[] exercice = new String[]{"Supino reto","Cross Over","Agachamento","Barra Fixa"};
        String[] charge = new String[]{"62kg","47kg","100kg","98kg"};
        int[] photo = new int[]{R.drawable.supino,R.drawable.cross,R.drawable.agachamento,R.drawable.barra};
        List<Exercices> listAux = new ArrayList<>();

        for(int i = 0; i<qnt;i++){
            Exercices exercices = new Exercices( exercice[i %exercice.length],charge[i%charge.length],  photo[i%photo.length]);
            listAux.add(exercices);
        }
        return(listAux);
    }

}
