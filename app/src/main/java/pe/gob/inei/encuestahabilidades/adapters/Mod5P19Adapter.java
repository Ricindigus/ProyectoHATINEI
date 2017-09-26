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
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P19;

/**
 * Created by RICARDO on 6/08/2017.
 */

public class Mod5P19Adapter extends RecyclerView.Adapter<Mod5P19Adapter.ViewHolder>{
    ArrayList<ItemMod5P19> itemMod5P19s;
    Context context;
    OnItemSelectedListener onItemSelectedListener;

    public interface OnItemSelectedListener{
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l, int pos, int idBD);
    }

    public Mod5P19Adapter(ArrayList<ItemMod5P19> itemMod5P19s, Context context, OnItemSelectedListener onItemSelectedListener) {
        this.itemMod5P19s = itemMod5P19s;
        this.context = context;
        this.onItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p19,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final int idBD = itemMod5P19s.get(position).getId();
        holder.textView.setText(itemMod5P19s.get(position).getOcupacion());
        holder.spinner.setSelection(itemMod5P19s.get(position).getSpOpcion());
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
        return itemMod5P19s.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        Spinner spinner;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_mod5_p19_txt);
            spinner = (Spinner) itemView.findViewById(R.id.item_mod5_p19_sp);
        }
    }
}
