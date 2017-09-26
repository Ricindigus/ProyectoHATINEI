package pe.gob.inei.encuestahabilidades.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P13P20Adapter extends RecyclerView.Adapter<Mod5P13P20Adapter.ViewHolder>{
    ArrayList<ItemMod5P13P20> itemMod5P13p20s;
    Context context;
    OnItemClickListener mOnItemClickListener;

    public Mod5P13P20Adapter(ArrayList<ItemMod5P13P20> itemMod5P13p20s, Context context, OnItemClickListener mOnItemClickListener) {
        this.itemMod5P13p20s = itemMod5P13p20s;
        this.context = context;
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int i, int posBD);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p13p20,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD  = itemMod5P13p20s.get(position).getId();
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(view,position,idBD);
            }
        });
        holder.txtOcupacion.setText(itemMod5P13p20s.get(position).getOcupacion());
        holder.txtCantidad.setText(itemMod5P13p20s.get(position).getCantidad());
    }

    @Override
    public int getItemCount() {
        return itemMod5P13p20s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtOcupacion;
        TextView txtCantidad;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_mod5_p13p20_cardview);
            txtOcupacion = (TextView) itemView.findViewById(R.id.item_mod5_p13p20_txt1);
            txtCantidad = (TextView) itemView.findViewById(R.id.item_mod5_p13p20_txt2);
        }
    }
}
