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
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P25P26;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P25P26Adapter extends RecyclerView.Adapter<Mod5P25P26Adapter.ViewHolder>{

    ArrayList<ItemMod5P25P26> itemMod5P25P26s;
    Context context;
    OnItemClickListener mOnItemClickListener;
    public interface OnItemClickListener {
        public void onItemClick(View view, int i, int posBD);
    }


    public Mod5P25P26Adapter(ArrayList<ItemMod5P25P26> itemMod5P25P26s, Context context, OnItemClickListener mOnItemClickListener) {
        this.itemMod5P25P26s = itemMod5P25P26s;
        this.context = context;
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p25p26,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD  = itemMod5P25P26s.get(position).getId();
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(view,position,idBD);
            }
        });
        holder.txtOcupacion.setText(itemMod5P25P26s.get(position).getOcupacion());
        holder.txtMotivo.setText(itemMod5P25P26s.get(position).getMotivo());
    }

    @Override
    public int getItemCount() {
        return itemMod5P25P26s.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtOcupacion;
        TextView txtMotivo;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_mod5_p25p26_cardview);
            txtOcupacion = (TextView) itemView.findViewById(R.id.item_mod5_p25p26_txt1);
            txtMotivo = (TextView) itemView.findViewById(R.id.item_mod5_p25p26_txt2);
        }
    }
}
