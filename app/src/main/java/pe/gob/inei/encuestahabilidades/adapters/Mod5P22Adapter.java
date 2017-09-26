package pe.gob.inei.encuestahabilidades.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P22;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P22Adapter extends RecyclerView.Adapter<Mod5P22Adapter.ViewHolder>{

    ArrayList<ItemMod5P22> itemMod5P22s;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position, int idBD);
    }

    public Mod5P22Adapter(ArrayList<ItemMod5P22> itemMod5P22s, Context context, OnItemClickListener onItemClickListener) {
        this.itemMod5P22s = itemMod5P22s;
        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p22,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD = itemMod5P22s.get(position).getId();
        holder.txtOcupacion.setText(itemMod5P22s.get(position).getOcupacion());
        holder.txtRemuneracion.setText(itemMod5P22s.get(position).getRemuneracion());
        holder.txtTiempo.setText(itemMod5P22s.get(position).getTiempoPagado());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(view,position,idBD);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMod5P22s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtOcupacion;
        TextView txtRemuneracion;
        TextView txtTiempo;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_mod5_p22_cardview);
            txtOcupacion = (TextView) itemView.findViewById(R.id.item_mod5_p22_txtOcupacion);
            txtRemuneracion = (TextView) itemView.findViewById(R.id.item_mod5_p22_txt1);
            txtTiempo = (TextView) itemView.findViewById(R.id.item_mod5_p22_txt2);
        }
    }
}
