package project.gym.com.br.totaltrainning11.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project.gym.com.br.totaltrainning11.Fragments.TrainningFragment;
import project.gym.com.br.totaltrainning11.Interfaces.RecyclerViewOnClickListenerHack;
import project.gym.com.br.totaltrainning11.domain.Exercices;
import project.gym.com.br.totaltrainning11.R;

/**
 * Created by DanielPC on 05/11/2015.
 */
public class TrainningAdapter extends RecyclerView.Adapter<TrainningAdapter.MyViewHolder> {
    private List<Exercices> mList;
    private LayoutInflater mLayoutInflater;
    private RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;


    public TrainningAdapter(Context c, List<Exercices> l) {
        mList = l;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Log.i("LOG", "onCreateViewHolder()");
        View v = mLayoutInflater.inflate(R.layout.exercice_item_layout, viewGroup, false);
        MyViewHolder mvh = new MyViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Log.i("LOG", "onBindViewHolder()");
        myViewHolder.ivCar.setImageResource(mList.get(position).getPhoto());
        myViewHolder.tvModel.setText(mList.get(position).getExerciceName());
        myViewHolder.tvBrand.setText(mList.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public void setRecyclerViewOnClickListenerHack(TrainningFragment r) {
        mRecyclerViewOnClickListenerHack = r;
    }


    public void addListItem(Exercices c, int position) {
        mList.add(c);
        notifyItemInserted(position);
    }


    public void removeListItem(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView ivCar;
        public TextView tvModel;
        public TextView tvBrand;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivCar = (ImageView) itemView.findViewById(R.id.iv_car);
            tvModel = (TextView) itemView.findViewById(R.id.tv_model);
            tvBrand = (TextView) itemView.findViewById(R.id.tv_brand);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mRecyclerViewOnClickListenerHack != null) {
                mRecyclerViewOnClickListenerHack.onClickListener(v, getPosition());
            }
        }

    }
}
