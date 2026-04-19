package com.example.practico3buscadordelibros;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.practico3buscadordelibros.databinding.ActivityMainBinding;
import com.example.practico3buscadordelibros.ui.detalle.DetalleActivity;
import com.example.practico3buscadordelibros.ui.resultado.ResultadoActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        viewModel.getMutableTitulo().observe(this, libro -> {
            binding.tvMensaje.setText("");
            Intent intent = new Intent(this, DetalleActivity.class);
            intent.putExtra("libro", libro);
            startActivity(intent);
        });

        viewModel.getmLibros().observe(this, libros -> {
            binding.tvMensaje.setText("");
            Intent intent = new Intent(this, ResultadoActivity.class);
            intent.putExtra("libros", libros);
            startActivity(intent);
        });

        viewModel.getmMensaje().observe(this, mensaje -> {
            binding.tvMensaje.setText(mensaje);
        });

        binding.btnBuscar.setOnClickListener(view -> {
            String titulo = binding.etBuscarLibro.getText().toString();
            viewModel.buscarLibros(titulo);
        });
    }
}