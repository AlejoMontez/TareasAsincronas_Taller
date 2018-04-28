package com.example.jonmid.tareasasincronas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.tareasasincronas.Models.Country;
import com.example.jonmid.tareasasincronas.Models.Post;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabri on 26/04/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Viewholder>{
    List<Post> postList = new ArrayList<>();

    Context context;

    // Constuctor de la clase
    public PostAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;

    }

    @NonNull
    @Override
    public PostAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //configuracion inicial
        // Obtener el archivo de item (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);

        //Pasar el archivo .xml al ViewHolder
        Viewholder viewHolder = new Viewholder(item);



        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        //Asignar los valores a la vista
        holder.textViewId.setText(postList.get(position).getId());
        holder.textViewTitle.setText(postList.get(position).getTitle());
        holder.textViewBody.setText(postList.get(position).getBody());

    }

    @Override
    public int getItemCount() {

        return postList.size();
    }


    //****************************************************************

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView textViewId;
        TextView textViewTitle;
        TextView textViewBody;

        public Viewholder(View itemView) {
            super(itemView);

            textViewId = (TextView) itemView.findViewById(R.id.id_tv_id);
            textViewTitle = (TextView) itemView.findViewById(R.id.id_tv_title);
            textViewBody = (TextView) itemView.findViewById(R.id.id_tv_body);
        }
    }
}
