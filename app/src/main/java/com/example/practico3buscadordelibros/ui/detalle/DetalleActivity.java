package com.example.practico3buscadordelibros.ui.detalle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.practico3buscadordelibros.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;
    private DetalleActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleActivityViewModel.class);

        viewModel.getmLibro().observe(this, libro -> {
            binding.tvTituloLibro.setText(libro.getTitulo());
            binding.tvAutor.setText(libro.getAutor());
            binding.tvAnio.setText(String.valueOf(libro.getAnio()));
            binding.tvPaginas.setText(String.valueOf(libro.getPaginas()));
            binding.tvGeneros.setText(String.join(", ", libro.getGeneros()));
            binding.tvDescripcion.setText(libro.getDescripcion());
            binding.ivPortada.setImageResource(libro.getImagen());
        });

        binding.btnVolver.setOnClickListener(view -> {
            finish();
        });

        viewModel.obtenerLibroDelIntent(getIntent());
    }
}