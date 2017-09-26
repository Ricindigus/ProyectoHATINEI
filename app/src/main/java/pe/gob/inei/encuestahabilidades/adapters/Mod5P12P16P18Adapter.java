package pe.gob.inei.encuestahabilidades.adapters;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P12P16P18Adapter extends RecyclerView.Adapter<Mod5P12P16P18Adapter.ViewHolder>{
    ArrayList<ItemMod5P12P16P18> itemMod5P12P16P18s;
    Context context;
    OnCheckedChangeListener myOnCheckedChangeListener;

    public interface OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup group, int checkedId, int position, int idBD);
    }

    public Mod5P12P16P18Adapter(ArrayList<ItemMod5P12P16P18> itemMod5P12P16P18s, Context context, OnCheckedChangeListener myOnCheckedChangeListener) {
        this.itemMod5P12P16P18s = itemMod5P12P16P18s;
        this.context = context;
        this.myOnCheckedChangeListener = myOnCheckedChangeListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p12p16p18,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final int idBD = itemMod5P12P16P18s.get(position).getId();
        holder.txtOcupacion.setText(itemMod5P12P16P18s.get(position).getOcupacion());
        RadioButton rbSi = (RadioButton) holder.radioGroup.getChildAt(0);
        RadioButton rbNo = (RadioButton) holder.radioGroup.getChildAt(1);
        if(itemMod5P12P16P18s.get(position).getOpcionRg() == 0) rbSi.setChecked(true);
        if(itemMod5P12P16P18s.get(position).getOpcionRg() == 1) rbNo.setChecked(true);
        if(itemMod5P12P16P18s.get(position).getOpcionRg() == 2) holder.radioGroup.clearCheck();
        holder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                myOnCheckedChangeListener.onCheckedChanged(group,checkedId,position,idBD);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMod5P12P16P18s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtOcupacion;
        RadioGroup radioGroup;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.item_mod5p12p16p18_cardview);
            txtOcupacion = (TextView) itemView.findViewById(R.id.item_mod5p12p16p18_txt);
            radioGroup = (RadioGroup) itemView.findViewById(R.id.item_mod5p12p16p18_rg);
        }
    }
}


