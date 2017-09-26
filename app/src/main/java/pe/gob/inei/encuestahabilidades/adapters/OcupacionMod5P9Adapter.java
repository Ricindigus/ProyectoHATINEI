package pe.gob.inei.encuestahabilidades.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P10P11;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P14P15;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P17;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P19;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P21;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P22;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P23;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P24;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P25P26;
import pe.gob.inei.encuestahabilidades.pojos.OcupacionMod5P9;

/**
 * Created by user on 31/07/2017.
 */

public class OcupacionMod5P9Adapter extends RecyclerView.Adapter<OcupacionMod5P9Adapter.ViewHolder>{
    ArrayList<OcupacionMod5P9> ocupacionMod5P9s;
    ArrayList<Integer> eliminados;
    ArrayList<Integer> editados;
    Context contexto;
    Activity actividad;

    public OcupacionMod5P9Adapter(ArrayList<OcupacionMod5P9> ocupacionMod5P9s, Context contexto, Activity actividad) {
        this.ocupacionMod5P9s = ocupacionMod5P9s;
        this.contexto = contexto;
        this.actividad = actividad;
        eliminados = new ArrayList<Integer>();
        editados = new ArrayList<Integer>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ocupacion_item_mod5_p9,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.txtOcupacion.setText(ocupacionMod5P9s.get(position).getCodOcupacion()+"");
        holder.txtEspecifica.setText(ocupacionMod5P9s.get(position).getOcupacionEspecifica());
        holder.txtCantidad.setText(ocupacionMod5P9s.get(position).getCantidadRequerida()+"");
        holder.imgBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(actividad);
                builder.setMessage("¿Está seguro de eliminar los datos?")
                        .setTitle("Aviso")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setPositiveButton("Aceptar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        eliminados.add(ocupacionMod5P9s.get(position).getId());
                                        ocupacionMod5P9s.remove(position);
                                        notifyDataSetChanged();
                                        dialog.dismiss();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });
        holder.imgEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final OcupacionMod5P9 ocupacionMod5P9 = ocupacionMod5P9s.get(position);
                AlertDialog.Builder alert = new AlertDialog.Builder(actividad);
                final View dialogView = actividad.getLayoutInflater().inflate(R.layout.dialog_ocupacion, null);
                final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_lyt);
                final AutoCompleteTextView autOcupacion = (AutoCompleteTextView) dialogView.findViewById(R.id.dialog_auto);
                final TextView txtSelecccion = (TextView) dialogView.findViewById(R.id.dialog_txt);
                final EditText edtEspecifica = (EditText) dialogView.findViewById(R.id.dialog_edt1);
                final EditText edtCantidad = (EditText) dialogView.findViewById(R.id.dialog_edt2);

                txtSelecccion.setText(ocupacionMod5P9.getOcupacion());
                edtEspecifica.setText(ocupacionMod5P9.getOcupacionEspecifica());
                edtCantidad.setText(ocupacionMod5P9.getCantidadRequerida()+"");

                final String[] ocupaciones = actividad.getResources().getStringArray(R.array.ocupaciones);
                ArrayAdapter adapter = new ArrayAdapter(actividad.getApplicationContext(),R.layout.lista_item,R.id.item,ocupaciones);
                autOcupacion.setAdapter(adapter);
                autOcupacion.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                        if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)) {
                            ocultarTeclado(autOcupacion);
                            lytDialog.requestFocus();
                            return true;
                        }
                        return false;
                    }
                });
                autOcupacion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        txtSelecccion.setText(autOcupacion.getText().toString().toUpperCase());
                        ocultarTeclado(autOcupacion);
                        lytDialog.requestFocus();
                    }
                });

                txtSelecccion.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                edtEspecifica.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                edtCantidad.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                edtEspecifica.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(300)});
                edtCantidad.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                alert.setTitle("Agregar Ocupación");
                alert.setView(dialogView);
                alert.setPositiveButton("OK",null);
                alert.setNegativeButton("Cancelar",null);

                final AlertDialog alertDialog = alert.create();

                alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialogInterface) {
                        Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        b.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // TODO Do something
                                if(!txtSelecccion.getText().toString().equals("") && !edtEspecifica.getText().toString().equals("") && !edtCantidad.getText().toString().equals("")){
                                    OcupacionMod5P9 item = new OcupacionMod5P9(ocupacionMod5P9s.get(position).getId(),
                                            String.valueOf(extraerCodigo(txtSelecccion.getText().toString())),
                                            txtSelecccion.getText().toString(),
                                            edtEspecifica.getText().toString(),
                                            Integer.parseInt(edtCantidad.getText().toString()));
                                    ocupacionMod5P9s.remove(position);
                                    ocupacionMod5P9s.add(position,item);
                                    notifyDataSetChanged();
                                    editados.add(ocupacionMod5P9s.get(position).getId());
                                    alertDialog.dismiss();
                                }else{
                                    Toast.makeText(actividad.getApplicationContext(), "DEBE LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });
                alertDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ocupacionMod5P9s.size();
    }

    public ArrayList<Integer> getEliminados() {
        return eliminados;
    }
    public ArrayList<Integer> getEditados() {
        return editados;
    }
    public void setEliminados(ArrayList<Integer> eliminados) {
        this.eliminados = eliminados;
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) actividad.getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public int extraerCodigo(String ocupacion){
        int codigo = 0;
        int indiceI = ocupacion.indexOf("[");
        int indiceF = ocupacion.indexOf("]");
        ocupacion = ocupacion.substring(indiceI + 1, indiceF);
        codigo = Integer.parseInt(ocupacion);
        return codigo;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtOcupacion;
        TextView txtEspecifica;
        TextView txtCantidad;
        ImageView imgBorrar;
        ImageView imgEditar;


        public ViewHolder(View itemView) {
            super(itemView);
            txtOcupacion = (TextView) itemView.findViewById(R.id.mod5_p9_txtOcupacion);
            txtEspecifica = (TextView) itemView.findViewById(R.id.mod5_p9_txtOcupacionEspecifica);
            txtCantidad = (TextView) itemView.findViewById(R.id.mod5_p9_txtCantidadRequerida);
            imgBorrar = (ImageView) itemView.findViewById(R.id.mod5_p9_btnEliminar);
            imgEditar = (ImageView) itemView.findViewById(R.id.mod5_p9_btnEditar);
        }
    }
}
