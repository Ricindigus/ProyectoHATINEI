package pe.gob.inei.encuestahabilidades.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P24;

/**
 * Created by RICARDO on 6/08/2017.
 */

public class Mod5P24Adapter extends RecyclerView.Adapter<Mod5P24Adapter.ViewHolder>{
    ArrayList<ItemMod5P24> itemMod5P24s;
    Context context;
    OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position, int idBD);
    }

    public Mod5P24Adapter(ArrayList<ItemMod5P24> itemMod5P24s, Context context, OnItemClickListener mOnItemClickListener) {
        this.itemMod5P24s = itemMod5P24s;
        this.context = context;
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p17p21p23p24,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD = itemMod5P24s.get(position).getId();
        holder.txTextView.setText(itemMod5P24s.get(position).getOcupacion());
        if(itemMod5P24s.get(position).getCheck() == 0){
            holder.imageView.setBackgroundResource(R.drawable.check_disabled);
        }
        if(itemMod5P24s.get(position).getCheck() == 1){
            holder.imageView.setBackgroundResource(R.drawable.check_enabled);
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(view,position,idBD);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMod5P24s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txTextView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_mod5_p17p21p23p24_cardview);
            txTextView = (TextView) itemView.findViewById(R.id.item_mod5_p17p21p23p24_txt);
            imageView = (ImageView) itemView.findViewById(R.id.item_mod5_p17p21p23p24_img);
        }
    }
}
