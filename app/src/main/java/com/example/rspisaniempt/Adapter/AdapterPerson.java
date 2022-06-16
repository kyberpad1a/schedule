package com.example.rspisaniempt.Adapter;

import android.content.Context;
import android.opengl.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rspisaniempt.Model.PersonModel;
import com.example.rspisaniempt.R;

import java.util.List;


public class AdapterPerson extends RecyclerView.Adapter<AdapterPerson.ViewholderPerson> {
    private Context context;
    private List<PersonModel> list;

    public AdapterPerson(Context context, List<PersonModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewholderPerson onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mylayot,parent,false);

        return new ViewholderPerson(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewholderPerson holder, int position) {
        PersonModel personModel = list.get(position);
        holder.textView5.setText(personModel.getDay());
        holder.textView6.setText(personModel.getWhere());
        holder.textView7.setText(personModel.getNumber());
        holder.textView8.setText(personModel.getName());

        /*if(holder.textView5.getText() == "")
            holder.textView5.setVisibility(View.GONE);*/


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewholderPerson extends RecyclerView.ViewHolder {

        private TextView textView5, textView6, textView7, textView8;

        public ViewholderPerson(@NonNull View itemView) {
            super(itemView);

            textView5=itemView.findViewById(R.id.textView5);
            textView6=itemView.findViewById(R.id.textView6);
            textView7=itemView.findViewById(R.id.textView7);
            textView8=itemView.findViewById(R.id.textView8);


        }


    }
}
