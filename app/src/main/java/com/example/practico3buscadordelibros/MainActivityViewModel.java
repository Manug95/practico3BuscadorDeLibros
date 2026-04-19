package com.example.practico3buscadordelibros;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico3buscadordelibros.modelos.Libro;
import com.example.practico3buscadordelibros.modelos.RepositorioLibro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivityViewModel extends AndroidViewModel {
    private final RepositorioLibro repo;
    private MutableLiveData<Libro> mLibro;
    private MutableLiveData<ArrayList<Libro>> mLibros;
    private MutableLiveData<String> mMensaje;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mLibro = new MutableLiveData<>();
        mLibros = new MutableLiveData<>();
        mMensaje = new MutableLiveData<>();
        repo = RepositorioLibro.getInstance(application.getApplicationContext());
    }

    public LiveData<Libro> getMutableTitulo() {
        return mLibro;
    }
    public LiveData<ArrayList<Libro>> getmLibros() {
        return mLibros;
    }
    public LiveData<String> getmMensaje() {
        return mMensaje;
    }

    public void buscarLibro(String titulo) {
        Libro libroEncontrado = repo.buscarLibroPorTitulo(titulo);
        if (libroEncontrado != null) {
            mLibro.setValue(libroEncontrado);
        }
        else {
            mMensaje.setValue(getApplication().getString(R.string.no_hubo_resultados));
        }
    }

    public void buscarLibros(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            ArrayList<Libro> libros = repo.listarLibrosPorTitulo(titulo);
            if (!libros.isEmpty()) {
                Collections.sort(libros);
                mLibros.setValue(libros);
            }
            else {
                mMensaje.setValue(getApplication().getString(R.string.no_hubo_resultados));
            }
        } else {
            mMensaje.setValue(getApplication().getString(R.string.campo_titulo_vacio));
        }
    }
}
