package com.example.practico3buscadordelibros;

import android.app.Application;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico3buscadordelibros.modelos.Libro;
import com.example.practico3buscadordelibros.modelos.LibroData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private final LibroData libroData;
    private MutableLiveData<Libro> mLibro;
    private MutableLiveData<ArrayList<Libro>> mLibros;
    private MutableLiveData<String> mMensaje;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mLibro = new MutableLiveData<>();
        mLibros = new MutableLiveData<>();
        mMensaje = new MutableLiveData<>();
        libroData = LibroData.getInstance();
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
        Libro libroEncontrado = libroData.buscarLibroPorTitulo(titulo);
        if (libroEncontrado != null) {
            mLibro.setValue(libroEncontrado);
        }
        else {
            mMensaje.setValue("No hubo ningún resultado en la búsqueda");
        }
    }

    public void buscarLibros(String titulo) {
        ArrayList<Libro> libros = libroData.listarLibrosPorTitulo(titulo);
        if (!libros.isEmpty()) {
            mLibros.setValue(libros);
        }
        else {
            mMensaje.setValue("No hubo ningún resultado en la búsqueda");
        }
    }
}
