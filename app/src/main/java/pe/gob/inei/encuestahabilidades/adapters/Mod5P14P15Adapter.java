package pe.gob.inei.encuestahabilidades.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P14P15;

/**
 * Created by user on 4/08/2017.
 */

public class Mod5P14P15Adapter extends RecyclerView.Adapter<Mod5P14P15Adapter.ViewHolder>{
    ArrayList<ItemMod5P14P15> itemMod5P14P15s;
    Context context;
    OnItemSelectedListener onItemSelectedListener;

    public interface OnItemSelectedListener{
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l, int pos, int idBD);
    }

    public Mod5P14P15Adapter(ArrayList<ItemMod5P14P15> itemMod5P14P15s, Context context, OnItemSelectedListener onItemSelectedListener) {
        this.itemMod5P14P15s = itemMod5P14P15s;
        this.context = context;
        this.onItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p14p15,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD = itemMod5P14P15s.get(position).getId();
        holder.textView.setText(itemMod5P14P15s.get(position).getOcupacion());
        holder.spinner.setSelection(itemMod5P14P15s.get(position).getSpOpcion());
        holder.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                onItemSelectedListener.onItemSelected(adapterView,view,i,l,position,idBD);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMod5P14P15s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        Spinner spinner;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_mod5_p14p15_txt);
            spinner = (Spinner) itemView.findViewById(R.id.item_mod5_p14p15_sp);
        }
    }
}
