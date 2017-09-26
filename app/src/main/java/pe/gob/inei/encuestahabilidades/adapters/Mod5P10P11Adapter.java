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
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P10P11;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P10P11Adapter extends RecyclerView.Adapter<Mod5P10P11Adapter.ViewHolder>{
    ArrayList<ItemMod5P10P11> itemMod5P10P11s;
    Context contexto;
    private int llenados;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public Mod5P10P11Adapter(ArrayList<ItemMod5P10P11> itemMod5P10P11s, Context contexto, OnItemClickListener mOnItemClickListener) {
        this.itemMod5P10P11s = itemMod5P10P11s;
        this.contexto = contexto;
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public Mod5P10P11Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p10p11,parent,false);
        Mod5P10P11Adapter.ViewHolder viewHolder = new Mod5P10P11Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Mod5P10P11Adapter.ViewHolder holder, final int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(view,position);
            }
        });
        holder.txtOcupacion.setText(itemMod5P10P11s.get(position).getOcupacion());
        holder.txt1.setText(itemMod5P10P11s.get(position).getCampoNumero1());
        holder.txt2.setText(itemMod5P10P11s.get(position).getCampoNumero2());
    }

    @Override
    public int getItemCount() {
        return itemMod5P10P11s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtOcupacion;
        TextView txt1;
        TextView txt2;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            txtOcupacion = (TextView) itemView.findViewById(R.id.item_mod5p10p11_txtOcupacion);
            txt1 = (TextView) itemView.findViewById(R.id.item_mod5p10p11_txtsp1);
            txt2 = (TextView) itemView.findViewById(R.id.item_mod5p10p11_txtsp2);
        }
    }
}
