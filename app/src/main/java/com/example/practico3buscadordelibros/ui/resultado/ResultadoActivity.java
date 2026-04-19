package com.example.practico3buscadordelibros.ui.resultado;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.practico3buscadordelibros.R;
import com.example.practico3buscadordelibros.databinding.ActivityResultadoBinding;
import com.example.practico3buscadordelibros.modelos.Libro;

import java.util.ArrayList;

public class ResultadoActivity extends AppCompatActivity {
    private ActivityResultadoBinding binding;
    private ResultadoActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityResultadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ResultadoActivityViewModel.class);

        viewModel.getmLibros().observe(this, new Observer<ArrayList<Libro>>() {
            @Override
            public void onChanged(ArrayList<Libro> libros) {
                LibroAdapter adapter = new LibroAdapter(libros, getApplicationContext());
                LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
                binding.rvResultados.setLayoutManager(llm);
                binding.rvResultados.setAdapter(adapter);
            }
        });

        binding.fbVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        viewModel.obtenerLibrosDelIntent(getIntent());
    }
}