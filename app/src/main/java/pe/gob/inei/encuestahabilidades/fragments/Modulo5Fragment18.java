package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P22Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P21;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P22;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment18 extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P22Adapter mod5P22Adapter;
    private ArrayList<ItemMod5P22> arrayP22;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment18() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment18(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment18, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p22_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P22Adapter = new Mod5P22Adapter(arrayP22, getActivity().getApplicationContext(),
                new Mod5P22Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, final int idBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p22, null);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5p22_lyt);
                        final EditText edt = (EditText) dialogView.findViewById(R.id.dialog_mod5p22_edt);
                        final Spinner spinner  = (Spinner) dialogView.findViewById(R.id.dialog_mod5p22_sp);
                        final LinearLayout lytSp = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5p22_lytSp);

                        edt.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                        edt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                        alert.setTitle("Agregar Datos");
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
                                        if(!edt.getText().toString().equals("") && spinner.getSelectedItemPosition() != 0){
                                            arrayP22.get(position).setRemuneracion(edt.getText().toString());
                                            arrayP22.get(position).setTiempoPagado(spinner.getSelectedItem().toString());
                                            alertDialog.dismiss();
                                            mod5P22Adapter.notifyDataSetChanged();
                                        }else{
                                            Toast.makeText(getActivity().getApplicationContext(), "DEBE LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }
                        });
                        alertDialog.show();
                    }
                });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P22Adapter);

    }
    private void cargarDatos() {
        arrayP22 = new ArrayList<ItemMod5P22>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    ItemMod5P22 itemMod5P22 = new ItemMod5P22(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            modulo5Dinamico.getC5_P22_1_1(),
                            modulo5Dinamico.getC5_P22_2_1(), 1);
                    arrayP22.add(itemMod5P22);
                }
            }
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP22.size()){
            if(arrayP22.get(c).getRemuneracion().equals("")) correcto = false;
            c++;
        }
        if(!correcto) mostrarMensaje("DEBE MARCAR PARA TODAS LAS OCUPACIONES");
        return correcto;
    }
    public void mostrarMensaje(String m){
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(m);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P22 itemMod5P22 : arrayP22){
            ContentValues contentValues = new ContentValues(22);
            contentValues.put(SQLConstantes.MODULO5_P22_1_1,itemMod5P22.getRemuneracion()+"");
            contentValues.put(SQLConstantes.MODULO5_P22_2_1,itemMod5P22.getTiempoPagado()+"");
            data.actualizarModulo5Dinamico(itemMod5P22.getId(),contentValues);
        }
        data.close();
    }
}
