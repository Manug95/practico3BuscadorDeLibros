package com.example.practico3buscadordelibros.ui.detalle;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico3buscadordelibros.modelos.Libro;

import java.io.Serializable;

public class DetalleActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> mLibro;
    public DetalleActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getmLibro() {
        if (mLibro == null) {
            mLibro = new MutableLiveData<>();
        }
        return mLibro;
    }

    public void obtenerLibroDelIntent(Intent intent) {
        if (intent != null) {
            Serializable serializable = intent.getSerializableExtra("libro");
            if (serializable instanceof Libro) {
                mLibro.setValue((Libro) serializable);
            }
        }
    }
}
