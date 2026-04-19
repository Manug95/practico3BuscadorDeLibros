package com.example.practico3buscadordelibros.ui.resultado;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico3buscadordelibros.modelos.Libro;

import java.io.Serializable;
import java.util.ArrayList;

public class ResultadoActivityViewModel extends AndroidViewModel {
    private MutableLiveData<ArrayList<Libro>> mLibros;
    public ResultadoActivityViewModel(@NonNull Application application) {
        super(application);
        mLibros = new MutableLiveData<>();
    }

    public LiveData<ArrayList<Libro>> getmLibros() {
        return mLibros;
    }

    public void obtenerLibrosDelIntent(Intent intent) {
        if (intent != null) {
            Serializable serializable = intent.getSerializableExtra("libros");
            if (serializable instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Libro> libros = (ArrayList<Libro>) serializable;
                mLibros.setValue(libros);
            }
        }
    }
}
