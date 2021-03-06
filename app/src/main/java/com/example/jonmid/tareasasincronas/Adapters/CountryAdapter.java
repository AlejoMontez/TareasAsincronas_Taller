package com.example.jonmid.tareasasincronas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.tareasasincronas.Models.Country;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabri on 24/04/2018.
 */

public class CountryAdapter  extends RecyclerView.Adapter<CountryAdapter.Viewholder>{

    List<Country> countryList = new ArrayList<>();

    Context context;

    // Constuctor de la clase
    public CountryAdapter(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

// En este metodo se instancia el cardview
    //****************************************************************

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //configuracion inicial
        // Obtener el archivo de item (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        //Pasar el archivo .xml al ViewHolder
        Viewholder viewHolder = new Viewholder(item);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        //Asignar los valores a la vista
        holder.textViewCountry.setText(countryList.get(position).getName());
        holder.textViewAlpha2.setText(countryList.get(position).getAlpha2_code());
        holder.textViewAlpha3.setText(countryList.get(position).getAlpha3_code());

    }

    @Override
    public int getItemCount() {

        return countryList.size();
    }


    //****************************************************************

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView textViewCountry;
        TextView textViewAlpha2;
        TextView textViewAlpha3;

        public Viewholder(View itemView) {
            super(itemView);

            textViewCountry = (TextView) itemView.findViewById(R.id.id_tv_country);
            textViewAlpha2 = (TextView) itemView.findViewById(R.id.id_tv_alpha2);
            textViewAlpha3 = (TextView) itemView.findViewById(R.id.id_tv_alpha3);
        }
    }
}
