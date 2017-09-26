package pe.gob.inei.encuestahabilidades.activities;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.ExpandListAdapter;
import pe.gob.inei.encuestahabilidades.fragments.CaratulaFragment;
import pe.gob.inei.encuestahabilidades.fragments.InicioFragment;
import pe.gob.inei.encuestahabilidades.fragments.Modulo10Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment10;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment11;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment12;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment13;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment14;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment15;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment16;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment17;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment18;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment19;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment20;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment21;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment22;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment23;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment8;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment9;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment10;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment11;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment12;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment13;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment8;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment9;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo9Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment1;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment2;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BDFragment;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;
import pe.gob.inei.encuestahabilidades.pojos.Modulo8;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;
import pe.gob.inei.encuestahabilidades.pojos.OcupacionMod5P9;

public class EnhatrapeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ArrayList<String> listDataHeader;
    private ExpandableListView expListView;
    private HashMap<String, List<String>> listDataChild;
    private ExpandListAdapter listAdapter;
    private ViewPager pager;
    private Button btnAtras, btnSiguiente;
//    private MyPagerAdapter myPagerAdapter;
    private LinearLayout linearLayoutContainer;
    private int posicionFragment = 0;
    private Fragment fragmentActual = new Fragment();
    private Fragment fragmentSiguiente = new Fragment();
    private String idEmpresa = "";
    private Data data;
    private String observaciones = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhatrape);

        final Bundle recupera=getIntent().getExtras();
        if(recupera != null){
            idEmpresa = recupera.getString("idEmpresa");
        }

        data = new Data(this);
        data.open();
        String idInsertar = idEmpresa+0;
        if(!data.existeFragment(idInsertar)){
            ArrayList<BDFragment> bdFragments = new ArrayList<BDFragment>();
            BDFragment bdFragment = new BDFragment();
            for (int i = 0; i <= 67 ; i++) {
                bdFragment = new BDFragment(idEmpresa+i,"1","0");
                bdFragments.add(bdFragment);
            }
            data.insertarFragments(bdFragments);
        }
        data.close();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnAtras = (Button) findViewById(R.id.btn_anterior);
        btnSiguiente = (Button) findViewById(R.id.btn_siguiente);
        linearLayoutContainer = (LinearLayout) findViewById(R.id.container_encuesta_enhatrape);
        
//        pager = (ViewPager) findViewById(R.id.container_enhatrape);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultarTeclado(btnAtras);
                if(posicionFragment - 1 >= 0){
                    data = new Data(getApplicationContext());
                    data.open();
                    int semaforo = 0;
                    posicionFragment--;
                    while(semaforo == 0){
                        BDFragment bdFragment = data.getFragment(idEmpresa+posicionFragment);
                        if(bdFragment.getFRAGMENT_HABILITADO().equals("1")){
                            semaforo = 1;
                        }else{
                            posicionFragment--;
                        }
                    }
                    setFragment(posicionFragment,-1);
                    data.close();
                }
//                launchHomeScreen();
//                int current = pager.getCurrentItem() - 1;
//                if (current > -1) {
//                    // move to next screen
//                    pager.setCurrentItem(current);}
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking for last page
                // if last page home screen will be launched
//                int current = pager.getCurrentItem() + 1;
//                if (current < myPagerAdapter.getCount()) {
//                    // move to next screen
//                    pager.setCurrentItem(current);}
                ocultarTeclado(btnSiguiente);
                if(posicionFragment + 1 <= 67){
                    if(validarFragment(posicionFragment)){
                        guardarFragment(posicionFragment);
                        guardarObservaciones(posicionFragment);
                        int semaforo = 0;
                        posicionFragment++;
                        data = new Data(getApplicationContext());
                        data.open();
                        while(semaforo == 0){
                            BDFragment bdFragment = data.getFragment(idEmpresa+posicionFragment);
                            if(bdFragment.getFRAGMENT_HABILITADO().equals("1")){
                                semaforo = 1;
                            }else{
                                posicionFragment++;
                            }
                        }

                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put(SQLConstantes.FRAGMENT_AVANCE,"1");
                        data.actualizarFragment(idEmpresa+posicionFragment,contentValues);
                        data.close();
                        setFragment(posicionFragment,1);
                    }
                }else if(posicionFragment + 1 == 68){
                    if(validarFragment(posicionFragment)){
                        guardarFragment(posicionFragment);
                        posicionFragment = 2;
                        setFragment(posicionFragment,1);
                    }
                }
            }
        });

        setSupportActionBar(toolbar);
//        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
//        pager.setAdapter(myPagerAdapter);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        enableExpandableList();


//        pager.setCurrentItem(3);
        setFragment(0,1);
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void guardarObservaciones(int tipo){
        data = new Data(EnhatrapeActivity.this);
                            data.open();
                            if(posicionFragment >= 4 && posicionFragment <= 5){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,observaciones);
                                    data.actualizarModulo1(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 7 && posicionFragment <= 11){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO2_OBS_MOD_II,observaciones);
                                    data.actualizarModulo2(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 13 && posicionFragment <= 13){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,observaciones);
                                    data.actualizarModulo3(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 15 && posicionFragment <= 16){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO4_OBS_MOD_IV,observaciones);
                                    data.actualizarModulo4(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 18 && posicionFragment <= 39){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO5_OBS_MOD_V,observaciones);
                                    data.actualizarModulo5(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 41 && posicionFragment <= 45){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO6_OBS_MOD_VI,observaciones);
                                    data.actualizarModulo6(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 47 && posicionFragment <= 58){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO7_OBS_MOD_VII,observaciones);
                                    data.actualizarModulo7(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 60 && posicionFragment <= 64){

                                    ContentValues contentValues = new ContentValues(1);
                                    contentValues.put(SQLConstantes.MODULO8_OBS_MOD_VIII,observaciones);
                                    data.actualizarModulo8(idEmpresa,contentValues);

                            }
                            data.close();
    }
    public boolean validarFragment(int tipo){
        boolean correcto = false;
        switch (tipo){
            case 0:
                CaratulaFragment caratulaFragment = (CaratulaFragment) fragmentActual;
                correcto = caratulaFragment.validar();
                break;
            case 1:
                VisitaFragment1 visitaFragment1 = (VisitaFragment1) fragmentActual;
                correcto = visitaFragment1.validar();
                break;
            case 2:
                VisitaFragment2 visitaFragment2 = (VisitaFragment2) fragmentActual;
                correcto = visitaFragment2.validar();
                break;
            case 3:
                InicioFragment inicioFragment = (InicioFragment) fragmentActual;
                correcto = inicioFragment.validar();
                break;
            case 4:
                Modulo1Fragment1 modulo1Fragment1 = (Modulo1Fragment1) fragmentActual;
                correcto = modulo1Fragment1.validar();
                break;
            case 5:
                Modulo1Fragment2 modulo1Fragment2= (Modulo1Fragment2) fragmentActual;
                correcto = modulo1Fragment2.validar();
                break;
            case 6:
                Modulo1Fragment3 modulo1Fragment3= (Modulo1Fragment3) fragmentActual;
                correcto = modulo1Fragment3.validar();
                break;
            case 7:
                Modulo2Fragment1 modulo2Fragment1= (Modulo2Fragment1) fragmentActual;
                correcto = modulo2Fragment1.validar();
                break;
            case 8:
                Modulo2Fragment2 modulo2Fragment2 = (Modulo2Fragment2) fragmentActual;
                correcto = modulo2Fragment2.validar();
                break;
            case 9:
                Modulo2Fragment3 modulo2Fragment3 = (Modulo2Fragment3) fragmentActual;
                correcto = modulo2Fragment3.validar();
                break;
            case 10:
                Modulo2Fragment4 modulo2Fragment4 = (Modulo2Fragment4) fragmentActual;
                correcto = modulo2Fragment4.validar();
                break;
            case 11:
                Modulo2Fragment5 modulo2Fragment5 = (Modulo2Fragment5) fragmentActual;
                correcto = modulo2Fragment5.validar();
                break;
            case 12:
                Modulo2Fragment6 modulo2Fragment6 = (Modulo2Fragment6) fragmentActual;
                correcto = modulo2Fragment6.validar();
                break;
            case 13:
                Modulo3Fragment1 modulo3Fragment1 = (Modulo3Fragment1) fragmentActual;
                correcto = modulo3Fragment1.validar();
                break;
            case 14:
                Modulo3Fragment2 modulo3Fragment2 = (Modulo3Fragment2) fragmentActual;
                correcto = modulo3Fragment2.validar();
                break;
            case 15:
                Modulo4Fragment1 modulo4Fragment1 = (Modulo4Fragment1) fragmentActual;
                correcto = modulo4Fragment1.validar();
                break;
            case 16:
                Modulo4Fragment2 modulo4Fragment2 = (Modulo4Fragment2) fragmentActual;
                correcto = modulo4Fragment2.validar();
                break;
            case 17:
                Modulo4Fragment3 modulo4Fragment3 = (Modulo4Fragment3) fragmentActual;
                correcto = modulo4Fragment3.validar();
                break;
            case 18:
                Modulo5Fragment1 modulo5Fragment1 = (Modulo5Fragment1) fragmentActual;
                correcto = modulo5Fragment1.validar();
                break;
            case 19:
                Modulo5Fragment2 modulo5Fragment2 = (Modulo5Fragment2) fragmentActual;
                correcto = modulo5Fragment2.validar();
                break;
            case 20:
                Modulo5Fragment3 modulo5Fragment3 = (Modulo5Fragment3) fragmentActual;
                correcto = modulo5Fragment3.validar();
                break;
            case 21:
                Modulo5Fragment4 modulo5Fragment4 = (Modulo5Fragment4) fragmentActual;
                correcto = modulo5Fragment4.validar();
                break;
            case 22:
                Modulo5Fragment5 modulo5Fragment5 = (Modulo5Fragment5) fragmentActual;
                correcto = modulo5Fragment5.validar();
                break;
            case 23:
                Modulo5Fragment6 modulo5Fragment6 = (Modulo5Fragment6) fragmentActual;
                correcto = modulo5Fragment6.validar();
                break;
            case 24:
                Modulo5Fragment7 modulo5Fragment7 = (Modulo5Fragment7) fragmentActual;
                correcto = modulo5Fragment7.validar();
                break;
            case 25:
                Modulo5Fragment8 modulo5Fragment8 = (Modulo5Fragment8) fragmentActual;
                correcto = modulo5Fragment8.validar();
                break;
            case 26:
                Modulo5Fragment9 modulo5Fragment9 = (Modulo5Fragment9) fragmentActual;
                correcto = modulo5Fragment9.validar();
                break;
            case 27:
                Modulo5Fragment10 modulo5Fragment10 = (Modulo5Fragment10) fragmentActual;
                correcto = modulo5Fragment10.validar();
                break;
            case 28:
                Modulo5Fragment11 modulo5Fragment11 = (Modulo5Fragment11) fragmentActual;
                correcto = modulo5Fragment11.validar();
                break;
            case 29:
                Modulo5Fragment12 modulo5Fragment12 = (Modulo5Fragment12) fragmentActual;
                correcto = modulo5Fragment12.validar();
                break;
            case 30:
                Modulo5Fragment13 modulo5Fragment13 = (Modulo5Fragment13) fragmentActual;
                correcto = modulo5Fragment13.validar();
                break;
            case 31:
                Modulo5Fragment14 modulo5Fragment14 = (Modulo5Fragment14) fragmentActual;
                correcto = modulo5Fragment14.validar();
                break;
            case 32:
                Modulo5Fragment15 modulo5Fragment15 = (Modulo5Fragment15) fragmentActual;
                correcto = modulo5Fragment15.validar();
                break;
            case 33:
                Modulo5Fragment16 modulo5Fragment16 = (Modulo5Fragment16) fragmentActual;
                correcto = modulo5Fragment16.validar();
                break;
            case 34:
                Modulo5Fragment17 modulo5Fragment17 = (Modulo5Fragment17) fragmentActual;
                correcto = modulo5Fragment17.validar();
                break;
            case 35:
                Modulo5Fragment18 modulo5Fragment18 = (Modulo5Fragment18) fragmentActual;
                correcto = modulo5Fragment18.validar();
                break;
            case 36:
                Modulo5Fragment19 modulo5Fragment19 = (Modulo5Fragment19) fragmentActual;
                correcto = modulo5Fragment19.validar();
                break;
            case 37:
                Modulo5Fragment20 modulo5Fragment20 = (Modulo5Fragment20) fragmentActual;
                correcto = modulo5Fragment20.validar();
                break;
            case 38:
                Modulo5Fragment21 modulo5Fragment21 = (Modulo5Fragment21) fragmentActual;
                correcto = modulo5Fragment21.validar();
                break;
            case 39:
                Modulo5Fragment22 modulo5Fragment22 = (Modulo5Fragment22) fragmentActual;
                correcto = modulo5Fragment22.validar();
                break;
            case 40:
                Modulo5Fragment23 modulo5Fragment23 = (Modulo5Fragment23) fragmentActual;
                correcto = modulo5Fragment23.validar();
                break;
            case 41:
                Modulo6Fragment1 modulo6Fragment1 = (Modulo6Fragment1) fragmentActual;
                correcto = modulo6Fragment1.validar();
                break;
            case 42:
                Modulo6Fragment2 modulo6Fragment2 = (Modulo6Fragment2) fragmentActual;
                correcto = modulo6Fragment2.validar();
                break;
            case 43:
                Modulo6Fragment3 modulo6Fragment3 = (Modulo6Fragment3) fragmentActual;
                correcto = modulo6Fragment3.validar();
                break;
            case 44:
                Modulo6Fragment4 modulo6Fragment4 = (Modulo6Fragment4) fragmentActual;
                correcto = modulo6Fragment4.validar();
                break;
            case 45:
                Modulo6Fragment5 modulo6Fragment5 = (Modulo6Fragment5) fragmentActual;
                correcto = modulo6Fragment5.validar();
                break;
            case 46:
                Modulo6Fragment6 modulo6Fragment6 = (Modulo6Fragment6) fragmentActual;
                correcto = modulo6Fragment6.validar();
                break;
            case 47:
                Modulo7Fragment1 modulo7Fragment1 = (Modulo7Fragment1) fragmentActual;
                correcto = modulo7Fragment1.validar();
                break;
            case 48:
                Modulo7Fragment2 modulo7Fragment2 = (Modulo7Fragment2) fragmentActual;
                correcto = modulo7Fragment2.validar();
                break;
            case 49:
                Modulo7Fragment3 modulo7Fragment3 = (Modulo7Fragment3) fragmentActual;
                correcto = modulo7Fragment3.validar();
                break;
            case 50:
                Modulo7Fragment4 modulo7Fragment4 = (Modulo7Fragment4) fragmentActual;
                correcto = modulo7Fragment4.validar();
                break;
            case 51:
                Modulo7Fragment5 modulo7Fragment5 = (Modulo7Fragment5) fragmentActual;
                correcto = modulo7Fragment5.validar();
                break;
            case 52:
                Modulo7Fragment6 modulo7Fragment6 = (Modulo7Fragment6) fragmentActual;
                correcto = modulo7Fragment6.validar();
                break;
            case 53:
                Modulo7Fragment7 modulo7Fragment7 = (Modulo7Fragment7) fragmentActual;
                correcto = modulo7Fragment7.validar();
                break;
            case 54:
                Modulo7Fragment8 modulo7Fragment8 = (Modulo7Fragment8) fragmentActual;
                correcto = modulo7Fragment8.validar();
                break;
            case 55:
                Modulo7Fragment9 modulo7Fragment9 = (Modulo7Fragment9) fragmentActual;
                correcto = modulo7Fragment9.validar();
                break;
            case 56:
                Modulo7Fragment10 modulo7Fragment10 = (Modulo7Fragment10) fragmentActual;
                correcto = modulo7Fragment10.validar();
                break;
            case 57:
                Modulo7Fragment11 modulo7Fragment11 = (Modulo7Fragment11) fragmentActual;
                correcto = modulo7Fragment11.validar();
                break;
            case 58:
                Modulo7Fragment12 modulo7Fragment12 = (Modulo7Fragment12) fragmentActual;
                correcto = modulo7Fragment12.validar();
                break;
            case 59:
                Modulo7Fragment13 modulo7Fragment13 = (Modulo7Fragment13) fragmentActual;
                correcto = modulo7Fragment13.validar();
                break;
            case 60:
                Modulo8Fragment1 modulo8Fragment1 = (Modulo8Fragment1) fragmentActual;
                correcto = modulo8Fragment1.validar();
                break;
            case 61:
                Modulo8Fragment2 modulo8Fragment2 = (Modulo8Fragment2) fragmentActual;
                correcto = modulo8Fragment2.validar();
                break;
            case 62:
                Modulo8Fragment3 modulo8Fragment3 = (Modulo8Fragment3) fragmentActual;
                correcto = modulo8Fragment3.validar();
                break;
            case 63:
                Modulo8Fragment4 modulo8Fragment4 = (Modulo8Fragment4) fragmentActual;
                correcto = modulo8Fragment4.validar();
                break;
            case 64:
                Modulo8Fragment5 modulo8Fragment5 = (Modulo8Fragment5) fragmentActual;
                correcto = modulo8Fragment5.validar();
                break;
            case 65:
                Modulo8Fragment6 modulo8Fragment6 = (Modulo8Fragment6) fragmentActual;
                correcto = modulo8Fragment6.validar();
                break;
            case 66:
                Modulo9Fragment1 modulo9Fragment1 = (Modulo9Fragment1) fragmentActual;
                correcto = modulo9Fragment1.validar();
                break;
            case 67:
                Modulo10Fragment1 modulo10Fragment1 = (Modulo10Fragment1) fragmentActual;
                correcto = modulo10Fragment1.validar();
                break;
        }
        return correcto;
    }

    public void guardarFragment(int tipo){
        switch (tipo){
            case 0:
                CaratulaFragment caratulaFragment = (CaratulaFragment) fragmentActual;
                caratulaFragment.guardarDatos();break;
            case 1:
                VisitaFragment1 visitaFragment1 = (VisitaFragment1) fragmentActual;
                visitaFragment1.guardarDatos();break;
            case 2:
                VisitaFragment2 visitaFragment2 = (VisitaFragment2) fragmentActual;
                visitaFragment2.guardarDatos();break;
            case 3:
                InicioFragment inicioFragment = (InicioFragment) fragmentActual;
                inicioFragment.guardarDatos();break;
            case 4:
                Modulo1Fragment1 modulo1Fragment1 = (Modulo1Fragment1) fragmentActual;
                modulo1Fragment1.guardarDatos();break;
            case 5:
                Modulo1Fragment2 modulo1Fragment2 = (Modulo1Fragment2) fragmentActual;
                modulo1Fragment2.guardarDatos();break;
            case 6:
                Modulo1Fragment3 modulo1Fragment3 = (Modulo1Fragment3) fragmentActual;
                modulo1Fragment3.guardarDatos();break;
            case 7:
                Modulo2Fragment1 modulo2Fragment1= (Modulo2Fragment1) fragmentActual;
                modulo2Fragment1.guardarDatos();break;
            case 8:
                Modulo2Fragment2 modulo2Fragment2 = (Modulo2Fragment2) fragmentActual;
                modulo2Fragment2.guardarDatos();break;
            case 9:
                Modulo2Fragment3 modulo2Fragment3 = (Modulo2Fragment3) fragmentActual;
                modulo2Fragment3.guardarDatos();break;
            case 10:
                Modulo2Fragment4 modulo2Fragment4 = (Modulo2Fragment4) fragmentActual;
                modulo2Fragment4.guardarDatos();break;
            case 11:
                Modulo2Fragment5 modulo2Fragment5 = (Modulo2Fragment5) fragmentActual;
                modulo2Fragment5.guardarDatos();break;
            case 12:
                Modulo2Fragment6 modulo2Fragment6 = (Modulo2Fragment6) fragmentActual;
                modulo2Fragment6.guardarDatos();break;
            case 13:
                Modulo3Fragment1 modulo3Fragment1 = (Modulo3Fragment1) fragmentActual;
                modulo3Fragment1.guardarDatos();break;
            case 14:
                Modulo3Fragment2 modulo3Fragment2 = (Modulo3Fragment2) fragmentActual;
                modulo3Fragment2.guardarDatos();break;
            case 15:
                Modulo4Fragment1 modulo4Fragment1 = (Modulo4Fragment1) fragmentActual;
                modulo4Fragment1.guardarDatos();break;
            case 16:
                Modulo4Fragment2 modulo4Fragment2 = (Modulo4Fragment2) fragmentActual;
                modulo4Fragment2.guardarDatos();break;
            case 17:
                Modulo4Fragment3 modulo4Fragment3 = (Modulo4Fragment3) fragmentActual;
                modulo4Fragment3.guardarDatos();break;
            case 18:
                Modulo5Fragment1 modulo5Fragment1 = (Modulo5Fragment1) fragmentActual;
                modulo5Fragment1.guardarDatos();break;
            case 19:
                Modulo5Fragment2 modulo5Fragment2 = (Modulo5Fragment2) fragmentActual;
                modulo5Fragment2.guardarDatos();break;
            case 20:
                Modulo5Fragment3 modulo5Fragment3 = (Modulo5Fragment3) fragmentActual;
                modulo5Fragment3.guardarDatos();break;
            case 21:
                Modulo5Fragment4 modulo5Fragment4 = (Modulo5Fragment4) fragmentActual;
                modulo5Fragment4.guardarDatos();break;
            case 22:
                Modulo5Fragment5 modulo5Fragment5 = (Modulo5Fragment5) fragmentActual;
                modulo5Fragment5.guardarDatos();break;
            case 23:
                Modulo5Fragment6 modulo5Fragment6 = (Modulo5Fragment6) fragmentActual;
                modulo5Fragment6.guardarDatos();break;
            case 24:
                Modulo5Fragment7 modulo5Fragment7 = (Modulo5Fragment7) fragmentActual;
                modulo5Fragment7.guardarDatos();break;
            case 25:
                Modulo5Fragment8 modulo5Fragment8 = (Modulo5Fragment8) fragmentActual;
                modulo5Fragment8.guardarDatos();break;
            case 26:
                Modulo5Fragment9 modulo5Fragment9 = (Modulo5Fragment9) fragmentActual;
                modulo5Fragment9.guardarDatos();break;
            case 27:
                Modulo5Fragment10 modulo5Fragment10 = (Modulo5Fragment10) fragmentActual;
                modulo5Fragment10.guardarDatos();break;
            case 28:
                Modulo5Fragment11 modulo5Fragment11 = (Modulo5Fragment11) fragmentActual;
                modulo5Fragment11.guardarDatos();break;
            case 29:
                Modulo5Fragment12 modulo5Fragment12 = (Modulo5Fragment12) fragmentActual;
                modulo5Fragment12.guardarDatos();break;
            case 30:
                Modulo5Fragment13 modulo5Fragment13 = (Modulo5Fragment13) fragmentActual;
                modulo5Fragment13.guardarDatos();break;
            case 31:
                Modulo5Fragment14 modulo5Fragment14 = (Modulo5Fragment14) fragmentActual;
                modulo5Fragment14.guardarDatos();break;
            case 32:
                Modulo5Fragment15 modulo5Fragment15 = (Modulo5Fragment15) fragmentActual;
                modulo5Fragment15.guardarDatos();break;
            case 33:
                Modulo5Fragment16 modulo5Fragment16 = (Modulo5Fragment16) fragmentActual;
                modulo5Fragment16.guardarDatos();break;
            case 34:
                Modulo5Fragment17 modulo5Fragment17 = (Modulo5Fragment17) fragmentActual;
                modulo5Fragment17.guardarDatos();break;
            case 35:
                Modulo5Fragment18 modulo5Fragment18 = (Modulo5Fragment18) fragmentActual;
                modulo5Fragment18.guardarDatos();break;
            case 36:
                Modulo5Fragment19 modulo5Fragment19 = (Modulo5Fragment19) fragmentActual;
                modulo5Fragment19.guardarDatos();break;
            case 37:
                Modulo5Fragment20 modulo5Fragment20 = (Modulo5Fragment20) fragmentActual;
                modulo5Fragment20.guardarDatos();break;
            case 38:
                Modulo5Fragment21 modulo5Fragment21 = (Modulo5Fragment21) fragmentActual;
                modulo5Fragment21.guardarDatos();break;
            case 39:
                Modulo5Fragment22 modulo5Fragment22 = (Modulo5Fragment22) fragmentActual;
                modulo5Fragment22.guardarDatos();break;
            case 40:
                Modulo5Fragment23 modulo5Fragment23 = (Modulo5Fragment23) fragmentActual;
                modulo5Fragment23.guardarDatos();break;
            case 41:
                Modulo6Fragment1 modulo6Fragment1 = (Modulo6Fragment1) fragmentActual;
                modulo6Fragment1.guardarDatos();break;
            case 42:
                Modulo6Fragment2 modulo6Fragment2 = (Modulo6Fragment2) fragmentActual;
                modulo6Fragment2.guardarDatos();break;
            case 43:
                Modulo6Fragment3 modulo6Fragment3 = (Modulo6Fragment3) fragmentActual;
                modulo6Fragment3.guardarDatos();break;
            case 44:
                Modulo6Fragment4 modulo6Fragment4 = (Modulo6Fragment4) fragmentActual;
                modulo6Fragment4.guardarDatos();break;
            case 45:
                Modulo6Fragment5 modulo6Fragment5 = (Modulo6Fragment5) fragmentActual;
                modulo6Fragment5.guardarDatos();break;
            case 46:
                Modulo6Fragment6 modulo6Fragment6 = (Modulo6Fragment6) fragmentActual;
                modulo6Fragment6.guardarDatos();break;
            case 47:
                Modulo7Fragment1 modulo7Fragment1 = (Modulo7Fragment1) fragmentActual;
                modulo7Fragment1.guardarDatos();break;
            case 48:
                Modulo7Fragment2 modulo7Fragment2 = (Modulo7Fragment2) fragmentActual;
                modulo7Fragment2.guardarDatos();break;
            case 49:
                Modulo7Fragment3 modulo7Fragment3 = (Modulo7Fragment3) fragmentActual;
                modulo7Fragment3.guardarDatos();break;
            case 50:
                Modulo7Fragment4 modulo7Fragment4 = (Modulo7Fragment4) fragmentActual;
                modulo7Fragment4.guardarDatos();break;
            case 51:
                Modulo7Fragment5 modulo7Fragment5 = (Modulo7Fragment5) fragmentActual;
                modulo7Fragment5.guardarDatos();break;
            case 52:
                Modulo7Fragment6 modulo7Fragment6 = (Modulo7Fragment6) fragmentActual;
                modulo7Fragment6.guardarDatos();break;
            case 53:
                Modulo7Fragment7 modulo7Fragment7 = (Modulo7Fragment7) fragmentActual;
                modulo7Fragment7.guardarDatos();break;
            case 54:
                Modulo7Fragment8 modulo7Fragment8 = (Modulo7Fragment8) fragmentActual;
                modulo7Fragment8.guardarDatos();break;
            case 55:
                Modulo7Fragment9 modulo7Fragment9 = (Modulo7Fragment9) fragmentActual;
                modulo7Fragment9.guardarDatos();break;
            case 56:
                Modulo7Fragment10 modulo7Fragment10 = (Modulo7Fragment10) fragmentActual;
                modulo7Fragment10.guardarDatos();break;
            case 57:
                Modulo7Fragment11 modulo7Fragment11 = (Modulo7Fragment11) fragmentActual;
                modulo7Fragment11.guardarDatos();break;
            case 58:
                Modulo7Fragment12 modulo7Fragment12 = (Modulo7Fragment12) fragmentActual;
                modulo7Fragment12.guardarDatos();break;
            case 59:
                Modulo7Fragment13 modulo7Fragment13 = (Modulo7Fragment13) fragmentActual;
                modulo7Fragment13.guardarDatos();break;
            case 60:
                Modulo8Fragment1 modulo8Fragment1 = (Modulo8Fragment1) fragmentActual;
                modulo8Fragment1.guardarDatos();break;
            case 61:
                Modulo8Fragment2 modulo8Fragment2 = (Modulo8Fragment2) fragmentActual;
                modulo8Fragment2.guardarDatos();break;
            case 62:
                Modulo8Fragment3 modulo8Fragment3 = (Modulo8Fragment3) fragmentActual;
                modulo8Fragment3.guardarDatos();break;
            case 63:
                Modulo8Fragment4 modulo8Fragment4 = (Modulo8Fragment4) fragmentActual;
                modulo8Fragment4.guardarDatos();break;
            case 64:
                Modulo8Fragment5 modulo8Fragment5 = (Modulo8Fragment5) fragmentActual;
                modulo8Fragment5.guardarDatos();break;
            case 65:
                Modulo8Fragment6 modulo8Fragment6 = (Modulo8Fragment6) fragmentActual;
                modulo8Fragment6.guardarDatos();break;
            case 66:
                Modulo9Fragment1 modulo9Fragment1 = (Modulo9Fragment1) fragmentActual;
                modulo9Fragment1.guardarDatos();break;
            case 67:
                Modulo10Fragment1 modulo10Fragment1 = (Modulo10Fragment1) fragmentActual;
                modulo10Fragment1.guardarDatos();break;
        }
    }

    public void setFragment(int pos,int direccion){
        observaciones = "";
        data = new Data(this);
        data.open();
        if(posicionFragment >= 4 && posicionFragment <= 6){
            observaciones = data.getModulo1(idEmpresa).getOBS_MOD_I();
        }
        if(posicionFragment >= 7 && posicionFragment <= 12){
            observaciones = data.getModulo2(idEmpresa).getOBS_MOD_II();
        }
        if(posicionFragment >= 13 && posicionFragment <= 14){
            observaciones = data.getModulo3(idEmpresa).getOBS_MOD_III();
        }
        if(posicionFragment >= 15 && posicionFragment <= 17){
            observaciones = data.getModulo4(idEmpresa).getOBS_MOD_IV();
        }
        if(posicionFragment >= 18 && posicionFragment <= 40){
            observaciones = data.getModulo5(idEmpresa).getOBS_MOD_V();
        }
        if(posicionFragment >= 41 && posicionFragment <= 46){
            observaciones = data.getModulo6(idEmpresa).getOBS_MOD_VI();
        }
        if(posicionFragment >= 47 && posicionFragment <= 59){
            observaciones = data.getModulo7(idEmpresa).getOBS_MOD_VII();
        }
        if(posicionFragment >= 60 && posicionFragment <= 65){
            observaciones = data.getModulo8(idEmpresa).getOBS_MOD_VIII();
        }
        if(posicionFragment == 66){
            observaciones = data.getModulo9(idEmpresa).getOBS_MOD_IX();
        }
        if(posicionFragment == 67){
            observaciones = data.getModulo10(idEmpresa).getOBS_MOD_X();
        }
        data.close();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(direccion > 0){
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
        }

        switch (pos){
            case 0:
                fragmentActual = new CaratulaFragment(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 1:
                fragmentActual = new VisitaFragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 2:
                fragmentActual = new VisitaFragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 3:
                fragmentActual = new InicioFragment(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 4:
                fragmentActual = new Modulo1Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 5:
                fragmentActual = new Modulo1Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 6:
                fragmentActual = new Modulo1Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 7:
                fragmentActual = new Modulo2Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 8:
                fragmentActual = new Modulo2Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 9:
                fragmentActual = new Modulo2Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 10:
                fragmentActual = new Modulo2Fragment4(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 11:
                fragmentActual = new Modulo2Fragment5(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 12:
                fragmentActual = new Modulo2Fragment6(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 13:
                fragmentActual = new Modulo3Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 14:
                fragmentActual = new Modulo3Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 15:
                fragmentActual = new Modulo4Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 16:
                fragmentActual = new Modulo4Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 17:
                fragmentActual = new Modulo4Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 18:
                fragmentActual = new Modulo5Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 19:
                fragmentActual = new Modulo5Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 20:
                fragmentActual = new Modulo5Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 21:
                fragmentActual = new Modulo5Fragment4(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 22:
                fragmentActual = new Modulo5Fragment5(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 23:
                fragmentActual = new Modulo5Fragment6(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 24:
                fragmentActual = new Modulo5Fragment7(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 25:
                fragmentActual = new Modulo5Fragment8(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 26:
                fragmentActual= new Modulo5Fragment9(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 27:
                fragmentActual = new Modulo5Fragment10(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 28:
                fragmentActual = new Modulo5Fragment11(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 29:
                fragmentActual = new Modulo5Fragment12(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 30:
                fragmentActual = new Modulo5Fragment13(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 31:
                fragmentActual = new Modulo5Fragment14(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 32:
                fragmentActual = new Modulo5Fragment15(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 33:
                fragmentActual = new Modulo5Fragment16(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 34:
                fragmentActual = new Modulo5Fragment17(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 35:
                fragmentActual = new Modulo5Fragment18(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 36:
                fragmentActual = new Modulo5Fragment19(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 37:
                fragmentActual = new Modulo5Fragment20(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 38:
                fragmentActual = new Modulo5Fragment21(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 39:
                fragmentActual = new Modulo5Fragment22(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 40:
                fragmentActual = new Modulo5Fragment23(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 41:
                fragmentActual= new Modulo6Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 42:
                fragmentActual = new Modulo6Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 43:
                fragmentActual = new Modulo6Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 44:
                fragmentActual = new Modulo6Fragment4(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 45:
                fragmentActual = new Modulo6Fragment5(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 46:
                fragmentActual = new Modulo6Fragment6(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 47:
                fragmentActual = new Modulo7Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 48:
                fragmentActual = new Modulo7Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 49:
                fragmentActual = new Modulo7Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 50:
                fragmentActual = new Modulo7Fragment4(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 51:
                fragmentActual = new Modulo7Fragment5(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 52:
                fragmentActual = new Modulo7Fragment6(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 53:
                fragmentActual = new Modulo7Fragment7(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 54:
                fragmentActual = new Modulo7Fragment8(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 55:
                fragmentActual = new Modulo7Fragment9(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 56:
                fragmentActual = new Modulo7Fragment10(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 57:
                fragmentActual = new Modulo7Fragment11(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 58:
                fragmentActual = new Modulo7Fragment12(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 59:
                fragmentActual = new Modulo7Fragment13(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 60:
                fragmentActual = new Modulo8Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 61:
                fragmentActual = new Modulo8Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 62:
                fragmentActual = new Modulo8Fragment3(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 63:
                fragmentActual = new Modulo8Fragment4(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 64:
                fragmentActual= new Modulo8Fragment5(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 65:
                fragmentActual = new Modulo8Fragment6(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 66:
                fragmentActual = new Modulo9Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 67:
                fragmentActual = new Modulo10Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.enhatrape, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if(posicionFragment > 3 && posicionFragment!=6
                && posicionFragment!=12
                && posicionFragment!=14
                && posicionFragment!=17
                && posicionFragment!=40
                && posicionFragment!=46
                && posicionFragment!=59
                && posicionFragment!=65
                && posicionFragment!=66
                && posicionFragment!=67
                ) getMenuInflater().inflate(R.menu.enhatrape, menu);
        else getMenuInflater().inflate(R.menu.enhatrape_simple, menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final int id = item.getItemId();
        if (id == R.id.action_marco || id == R.id.action_marco_simple) {
            onBackPressed();
            return true;
        }
        if( id == R.id.action_observaciones){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            final View dialogView = this.getLayoutInflater().inflate(R.layout.dialog_observaciones, null);
            LinearLayout lytObservaciones = dialogView.findViewById(R.id.dialog_lytObservaciones);
            final EditText edtObservaciones = dialogView.findViewById(R.id.dialog_edtObservaciones);
            dialog.setView(dialogView);
            dialog.setTitle("Observaciones");
            dialog.setPositiveButton("Guardar",null);
            dialog.setNegativeButton("Cancelar",null);
            final AlertDialog alertDialog = dialog.create();
            alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialogInterface) {

                    edtObservaciones.setText(observaciones);
//                    data.close();
                    Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // TODO Do something
//                            data = new Data(EnhatrapeActivity.this);
//                            data.open();
//                            if(posicionFragment >= 4 && posicionFragment <= 6){
//                                if(!data.existeModulo1(idEmpresa)){
//                                    Modulo1 modulo1 = new Modulo1();
//                                    modulo1.setMODULO1_ID(idEmpresa);
//                                    modulo1.setOBS_MOD_I(edtObservaciones.getText().toString());
//                                    data.insertarModulo1(modulo1);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,observaciones);
//                                    data.actualizarModulo1(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 7 && posicionFragment <= 12){
//                                if(!data.existeModulo2(idEmpresa)){
//                                    Modulo2 modulo2 = new Modulo2();
//                                    modulo2.setOBS_MOD_II(edtObservaciones.getText().toString());
//                                    data.insertarModulo2(modulo2);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO2_OBS_MOD_II,observaciones);
//                                    data.actualizarModulo2(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 13 && posicionFragment <= 14){
//                                if(!data.existeModulo3(idEmpresa)){
//                                    Modulo3 modulo3 = new Modulo3();
//                                    modulo3.setOBS_MOD_III(edtObservaciones.getText().toString());
//                                    data.insertarModulo3(modulo3);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,observaciones);
//                                    data.actualizarModulo3(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 15 && posicionFragment <= 17){
//                                if(!data.existeModulo4(idEmpresa)){
//                                    Modulo4 modulo4 = new Modulo4();
//                                    modulo4.setOBS_MOD_IV(edtObservaciones.getText().toString());
//                                    data.insertarModulo4(modulo4);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO4_OBS_MOD_IV,observaciones);
//                                    data.actualizarModulo4(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 18 && posicionFragment <= 40){
//                                if(!data.existeModulo5(idEmpresa)){
//                                    Modulo5 modulo5 = new Modulo5();
//                                    modulo5.setOBS_MOD_V(edtObservaciones.getText().toString());
//                                    data.insertarModulo5(modulo5);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO5_OBS_MOD_V,observaciones);
//                                    data.actualizarModulo5(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 41 && posicionFragment <= 46){
//                                if(!data.existeModulo6(idEmpresa)){
//                                    Modulo6 modulo6 = new Modulo6();
//                                    modulo6.setOBS_MOD_VI(edtObservaciones.getText().toString());
//                                    data.insertarModulo6(modulo6);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO6_OBS_MOD_VI,observaciones);
//                                    data.actualizarModulo6(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 47 && posicionFragment <= 59){
//                                if(!data.existeModulo7(idEmpresa)){
//                                    Modulo7 modulo7 = new Modulo7();
//                                    modulo7.setOBS_MOD_VII(edtObservaciones.getText().toString());
//                                    data.insertarModulo7(modulo7);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO7_OBS_MOD_VII,observaciones);
//                                    data.actualizarModulo7(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 60 && posicionFragment <= 65){
//                                if(!data.existeModulo8(idEmpresa)){
//                                    Modulo8 modulo8 = new Modulo8();
//                                    modulo8.setOBS_MOD_VIII(edtObservaciones.getText().toString());
//                                    data.insertarModulo8(modulo8);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO8_OBS_MOD_VIII,observaciones);
//                                    data.actualizarModulo8(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment == 66){
//                                if(!data.existeModulo9(idEmpresa)){
//                                    Modulo9 modulo9 = new Modulo9();
//                                    modulo9.setOBS_MOD_IX(edtObservaciones.getText().toString());
//                                    data.insertarModulo9(modulo9);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO9_OBS_MOD_IX,observaciones);
//                                    data.actualizarModulo9(idEmpresa,contentValues);
//                                }
//                            }
//                            data.close();
                            observaciones = edtObservaciones.getText().toString();
                            alertDialog.dismiss();
                        }
                    });
                }
            });
            alertDialog.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void enableExpandableList() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        expListView = (ExpandableListView) findViewById(R.id.left_drawer);

        prepareListData(listDataHeader, listDataChild);
        listAdapter = new ExpandListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });


        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                // Temporary code:

                // till here
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition)+ "\n"+groupPosition, Toast.LENGTH_SHORT)
//                        .show();
                int posicion = 0;
                switch (groupPosition){
                    case 0:
                        switch (childPosition){
                            case 0:setFragment(childPosition,1);posicionFragment = childPosition;break;
                            case 1:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();}
//                                data.close();
                                break;
                            case 2:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{
//                                    Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                                }
//                                data.close();
                                break;
                            case 3:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{
//                                    Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                                }
//                                data.close();
                                break;
                        }
                        break;
                    case 1:
                        posicion = childPosition + 4;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 2:
                        posicion = childPosition + 7;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 3:
                        posicion = childPosition + 13;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 4:
                        posicion = childPosition + 15;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 5:
                        posicion = childPosition + 18;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 6:
                        posicion = childPosition + 41;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 7:
                        posicion = childPosition + 47;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 8:
                        posicion = childPosition + 60;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 9:
                        posicion = childPosition + 66;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 10:
                        posicion = childPosition + 67;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                }
                return false;
            }
        });
    }


    @SuppressLint("NewApi")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Está seguro que desea volver al marco y salir de la encuesta?")
                    .setTitle("Aviso")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })
                    .setPositiveButton("Sí",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    finish();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void prepareListData(List<String> listDataHeader, Map<String, List<String>> listDataChild) {

        // Adding child data
        listDataHeader.add("INICIO");
        listDataHeader.add("MÓDULO I");listDataHeader.add("MÓDULO II");listDataHeader.add("MÓDULO III");
        listDataHeader.add("MÓDULO IV");listDataHeader.add("MÓDULO V");listDataHeader.add("MÓDULO VI");
        listDataHeader.add("MÓDULO VII");listDataHeader.add("MÓDULO VIII");listDataHeader.add("MÓDULO IX");
        listDataHeader.add("MÓDULO X");
        // Adding child data
        List<String> inicio = new ArrayList<String>();
        inicio.add("Carátula");inicio.add("Datos de la Entrevista");
        inicio.add("Control de Visitas");inicio.add("Identificación de la empresa");

        List<String> modulo1 = new ArrayList<String>();
        modulo1.add("Módulo I: P1 - P4");modulo1.add("Módulo I: P5 - P7");modulo1.add("Módulo I: P8 - P12");

        List<String> modulo2 = new ArrayList<String>();
        modulo2.add("Módulo II: P1 - P5");modulo2.add("Módulo II: P6 - P13");modulo2.add("Módulo II: P14 - P17");
        modulo2.add("Módulo II: P18 - P19");modulo2.add("Módulo II: P20 - P22");modulo2.add("Módulo II: P23 - P25");

        List<String> modulo3 = new ArrayList<String>();
        modulo3.add("Módulo III: P1 - P6");modulo3.add("Módulo III: P7 - P12");

        List<String> modulo4 = new ArrayList<String>();
        modulo4.add("Módulo IV: P1 - P3");modulo4.add("Módulo IV: P4 - P7");modulo4.add("Módulo IV: P8 - P10");

        List<String> modulo5 = new ArrayList<String>();
        modulo5.add("Módulo V: P1");modulo5.add("Módulo V: P2");modulo5.add("Módulo V: P3 - P5");
        modulo5.add("Módulo V: P6 - P8");modulo5.add("Módulo V: P9");modulo5.add("Módulo V: P10");
        modulo5.add("Módulo V: P11");modulo5.add("Módulo V: P12");modulo5.add("Módulo V: P13");
        modulo5.add("Módulo V: P14");modulo5.add("Módulo V: P15");modulo5.add("Módulo V: P16");
        modulo5.add("Módulo V: P17");modulo5.add("Módulo V: P18");modulo5.add("Módulo V: P19");
        modulo5.add("Módulo V: P20");modulo5.add("Módulo V: P21");modulo5.add("Módulo V: P22");
        modulo5.add("Módulo V: P23");modulo5.add("Módulo V: P24");modulo5.add("Módulo V: P25");
        modulo5.add("Módulo V: P26");modulo5.add("Módulo V: P27");

        List<String> modulo6 = new ArrayList<String>();
        modulo6.add("Módulo VI: P1 - P3");modulo6.add("Módulo VI: P4");modulo6.add("Módulo VI: P5");
        modulo6.add("Módulo VI: P6");modulo6.add("Módulo VI: P7 - P8");modulo6.add("Módulo VI: P9 - P10");

        List<String> modulo7 = new ArrayList<String>();
        modulo7.add("Módulo VII: P1 - P4");modulo7.add("Módulo VII: P5 - P7");modulo7.add("Módulo VII: P8");
        modulo7.add("Módulo VII: P9");modulo7.add("Módulo VII: P10 - P14");modulo7.add("Módulo VII: P15 - P17");
        modulo7.add("Módulo VII: P18");modulo7.add("Módulo VII: P19");modulo7.add("Módulo VII: P20 - P33");
        modulo7.add("Módulo VII: P34 - P36");modulo7.add("Módulo VII: P37 - P39");
        modulo7.add("Módulo VII: P40 - P43");modulo7.add("Módulo VII: P44 - P46");

        List<String> modulo8 = new ArrayList<String>();
        modulo8.add("Módulo VIII: Inteligencia Artificial/Aprendizaje Automático");modulo8.add("Módulo VIII: Robótica Avanzada");
        modulo8.add("Módulo VIII: Transporte Autónomo");modulo8.add("Módulo VIII: Manufactura Avanzada");
        modulo8.add("Módulo VIII: Producción con impresión en 3D");modulo8.add("Módulo VIII: Servicios Avanzados en Redes (Computacion en la nube, BIG DATA)");

        List<String> modulo9 = new ArrayList<String>();
        modulo9.add("Módulo IX: P1 - P2");

        List<String> modulo10 = new ArrayList<String>();
        modulo10.add("Módulo X: P1 - P4");

        listDataChild.put(listDataHeader.get(0), inicio);// Header, Child data
        listDataChild.put(listDataHeader.get(1), modulo1);
        listDataChild.put(listDataHeader.get(2), modulo2);
        listDataChild.put(listDataHeader.get(3), modulo3);
        listDataChild.put(listDataHeader.get(4), modulo4);
        listDataChild.put(listDataHeader.get(5), modulo5);
        listDataChild.put(listDataHeader.get(6), modulo6);
        listDataChild.put(listDataHeader.get(7), modulo7);
        listDataChild.put(listDataHeader.get(8), modulo8);
        listDataChild.put(listDataHeader.get(9), modulo9);
        listDataChild.put(listDataHeader.get(10), modulo10);
    }

//    private class MyPagerAdapter extends FragmentPagerAdapter {
//
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int pos) {
//
//            switch(pos) {
//                case 0: return new InicioFragment();
//                case 1: return new CaratulaFragment();
//                case 2: return new VisitaFragment2();
//
//                case 3: return new Modulo1Fragment1();
//                case 4: return new Modulo1Fragment2();
//                case 5: return new Modulo1Fragment3();
//
//                case 6: return new Modulo2Fragment1();
//                case 7: return new Modulo2Fragment2();
//                case 8: return new Modulo2Fragment3();
//                case 9: return new Modulo2Fragment4();
//                case 10: return new Modulo2Fragment5();
//                case 11: return new Modulo2Fragment6();
//
//                case 12: return new Modulo3Fragment1();
//                case 13: return new Modulo3Fragment2();
//
//                case 14: return new Modulo4Fragment1();
//                case 15: return new Modulo4Fragment2();
//                case 16: return new Modulo4Fragment3();
//
//                case 17: return new Modulo5Fragment1();
//                case 18: return new Modulo5Fragment2();
//                case 19: return new Modulo5Fragment3();
//                case 20: return new Modulo5Fragment4();
//                case 21: return new Modulo5Fragment5();
//                case 22: return new Modulo5Fragment6();
//                case 23: return new Modulo5Fragment7();
//                case 24: return new Modulo5Fragment8();
//                case 25: return new Modulo5Fragment9();
//                case 26: return new Modulo5Fragment10();
//                case 27: return new Modulo5Fragment11();
//                case 28: return new Modulo5Fragment12();
//                case 29: return new Modulo5Fragment13();
//                case 30: return new Modulo5Fragment14();
//                case 31: return new Modulo5Fragment15();
//                case 32: return new Modulo5Fragment16();
//                case 33: return new Modulo5Fragment17();
//                case 34: return new Modulo5Fragment18();
//                case 35: return new Modulo5Fragment19();
//                case 36: return new Modulo5Fragment20();
//                case 37: return new Modulo5Fragment21();
//                case 38: return new Modulo5Fragment22();
//                case 39: return new Modulo5Fragment23();
//
//                case 40: return new Modulo6Fragment1();
//                case 41: return new Modulo6Fragment2();
//                case 42: return new Modulo6Fragment3();
//                case 43: return new Modulo6Fragment4();
//                case 44: return new Modulo6Fragment5();
//                case 45: return new Modulo6Fragment6();
//
//                case 46: return new Modulo7Fragment1();
//                case 47: return new Modulo7Fragment2();
//                case 48: return new Modulo7Fragment3();
//                case 49: return new Modulo7Fragment4();
//                case 50: return new Modulo7Fragment5();
//                case 51: return new Modulo7Fragment6();
//                case 52: return new Modulo7Fragment7();
//                case 53: return new Modulo7Fragment8();
//                case 54: return new Modulo7Fragment9();
//                case 55: return new Modulo7Fragment10();
//                case 56: return new Modulo7Fragment11();
//                case 57: return new Modulo7Fragment12();
//                case 58: return new Modulo7Fragment13();
//                case 59: return new Modulo7Fragment10();
//                case 60: return new Modulo7Fragment11();
//                case 61: return new Modulo7Fragment12();
//                case 62: return new Modulo7Fragment13();
//
//                case 63: return new Modulo8Fragment1();
//                case 64: return new Modulo8Fragment2();
//                case 65: return new Modulo8Fragment3();
//                case 66: return new Modulo8Fragment4();
//                case 67: return new Modulo8Fragment5();
//                case 68: return new Modulo8Fragment6();
//
//                case 69: return new Modulo9Fragment1();
//
//                default: return new InicioFragment();
//            }
//        }
//
//        @Override
//        public int getCount() {
//            return 70;
//        }
//
//        public void setFragment(int pos){
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            switch (pos){
//                case 0:
//                    CaratulaFragment caratulaFragment = new CaratulaFragment();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, caratulaFragment);
//                    break;
//                case 1:
//                    VisitaFragment2 visitaFragment = new VisitaFragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, visitaFragment);
//                    break;
//                case 2:
//                    InicioFragment inicioFragment = new InicioFragment();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, inicioFragment);
//                    break;
//                case 3:
//                    Modulo1Fragment1 modulo1Fragment1 = new Modulo1Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo1Fragment1);
//                    break;
//                case 4:
//                    Modulo1Fragment2 modulo1Fragment2= new Modulo1Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo1Fragment2);
//                    break;
//                case 5:
//                    Modulo1Fragment3 modulo1Fragment3= new Modulo1Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo1Fragment3);
//                    break;
//                case 6:
//                    Modulo2Fragment1 modulo2Fragment1= new Modulo2Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment1);
//                    break;
//                case 7:
//                    Modulo2Fragment2 modulo2Fragment2 = new Modulo2Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment2);
//                    break;
//                case 8:
//                    Modulo2Fragment3 modulo2Fragment3 = new Modulo2Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment3);
//                    break;
//                case 9:
//                    Modulo2Fragment4 modulo2Fragment4 = new Modulo2Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment4);
//                    break;
//                case 10:
//                    Modulo2Fragment5 modulo2Fragment5 = new Modulo2Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment5);
//                    break;
//                case 11:
//                    Modulo2Fragment6 modulo2Fragment6 = new Modulo2Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment6);
//                    break;
//                case 12:
//                    Modulo3Fragment1 modulo3Fragment1 = new Modulo3Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo3Fragment1);
//                    break;
//                case 13:
//                    Modulo3Fragment2 modulo3Fragment2 = new Modulo3Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo3Fragment2);
//                    break;
//                case 15:
//                    Modulo4Fragment1 modulo4Fragment1 = new Modulo4Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment1);
//                    break;
//                case 16:
//                    Modulo4Fragment2 modulo4Fragment2 = new Modulo4Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment2);
//                    break;
//                case 17:
//                    Modulo4Fragment3 modulo4Fragment3 = new Modulo4Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment3);
//                    break;
//                case 18:
//                    Modulo5Fragment1 modulo5Fragment1 = new Modulo5Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment1);
//                    break;
//                case 19:
//                    Modulo5Fragment2 modulo5Fragment2 = new Modulo5Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment2);
//                    break;
//                case 20:
//                    Modulo5Fragment3 modulo5Fragment3 = new Modulo5Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment3);
//                    break;
//                case 21:
//                    Modulo5Fragment4 modulo5Fragment4 = new Modulo5Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment4);
//                    break;
//                case 22:
//                    Modulo5Fragment5 modulo5Fragment5 = new Modulo5Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment5);
//                    break;
//                case 23:
//                    Modulo5Fragment6 modulo5Fragment6 = new Modulo5Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment6);
//                    break;
//                case 24:
//                    Modulo6Fragment1 modulo6Fragment1 = new Modulo6Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment1);
//                    break;
//                case 25:
//                    Modulo6Fragment2 modulo6Fragment2 = new Modulo6Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment2);
//                    break;
//                case 26:
//                    Modulo6Fragment3 modulo6Fragment3 = new Modulo6Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment3);
//                    break;
//                case 27:
//                    Modulo6Fragment4 modulo6Fragment4 = new Modulo6Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment4);
//                    break;
//                case 28:
//                    Modulo7Fragment1 modulo7Fragment1 = new Modulo7Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment1);
//                    break;
//                case 29:
//                    Modulo7Fragment2 modulo7Fragment2 = new Modulo7Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment2);
//                    break;
//                case 30:
//                    Modulo7Fragment3 modulo7Fragment3 = new Modulo7Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment3);
//                    break;
//                case 31:
//                    Modulo7Fragment4 modulo7Fragment4 = new Modulo7Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment4);
//                    break;
//                case 32:
//                    Modulo7Fragment5 modulo7Fragment5 = new Modulo7Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment5);
//                    break;
//                case 33:
//                    Modulo7Fragment6 modulo7Fragment6 = new Modulo7Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment6);
//                    break;
//                case 34:
//                    Modulo7Fragment7 modulo7Fragment7 = new Modulo7Fragment7();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment7);
//                    break;
//                case 35:
//                    Modulo7Fragment8 modulo7Fragment8 = new Modulo7Fragment8();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment8);
//                    break;
//                case 36:
//                    Modulo7Fragment9 modulo7Fragment9 = new Modulo7Fragment9();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment9);
//                    break;
//                case 37:
//                    Modulo7Fragment10 modulo7Fragment10 = new Modulo7Fragment10();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment10);
//                    break;
//                case 38:
//                    Modulo7Fragment11 modulo7Fragment11 = new Modulo7Fragment11();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment11);
//                    break;
//                case 39:
//                    Modulo7Fragment12 modulo7Fragment12 = new Modulo7Fragment12();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment12);
//                    break;
//                case 40:
//                    Modulo7Fragment13 modulo7Fragment13 = new Modulo7Fragment13();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment13);
//                    break;
//                case 41:
//                    Modulo7Fragment10 modulo7Fragment14 = new Modulo7Fragment10();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment14);
//                    break;
//                case 42:
//                    Modulo7Fragment11 modulo7Fragment15 = new Modulo7Fragment11();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment15);
//                    break;
//                case 43:
//                    Modulo7Fragment12 modulo7Fragment16 = new Modulo7Fragment12();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment16);
//                    break;
//                case 44:
//                    Modulo7Fragment13 modulo7Fragment17 = new Modulo7Fragment13();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment17);
//                    break;
//                case 45:
//                    Modulo8Fragment1 modulo8Fragment1 = new Modulo8Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment1);
//                    break;
//                case 46:
//                    Modulo8Fragment2 modulo8Fragment2 = new Modulo8Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment2);
//                    break;
//                case 47:
//                    Modulo8Fragment3 modulo8Fragment3 = new Modulo8Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment3);
//                    break;
//                case 48:
//                    Modulo8Fragment4 modulo8Fragment4 = new Modulo8Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment4);
//                    break;
//                case 49:
//                    Modulo8Fragment5 modulo8Fragment5 = new Modulo8Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment5);
//                    break;
//                case 50:
//                    Modulo8Fragment6 modulo8Fragment6 = new Modulo8Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment6);
//                    break;
//                case 52:
//                    Modulo9Fragment1 modulo9Fragment1 = new Modulo9Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo9Fragment1);
//                    break;
//            }
//            fragmentTransaction.commit();
//        }
//    }
}
