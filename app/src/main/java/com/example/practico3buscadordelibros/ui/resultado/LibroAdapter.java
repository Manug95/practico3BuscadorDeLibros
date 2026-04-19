package com.example.practico3buscadordelibros.ui.resultado;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practico3buscadordelibros.databinding.ItemLibroBinding;
import com.example.practico3buscadordelibros.modelos.Libro;
import com.example.practico3buscadordelibros.ui.detalle.DetalleActivity;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {
    private Context context;
    private List<Libro> lista;

    public LibroAdapter(List<Libro> listaLibros, Context context) {
        this.lista = listaLibros;
        this.context = context;
    }

    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLibroBinding binding = ItemLibroBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LibroViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        Libro libro = lista.get(position);
        holder.bind(libro);
    }

    @Override
    public int getItemCount() {
        return lista != null ? lista.size() : 0;
    }

    public class LibroViewHolder extends RecyclerView.ViewHolder {
        private final ItemLibroBinding binding;

        public LibroViewHolder(@NonNull ItemLibroBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Libro libro) {
            String titulo = "Dirección: " + libro.getTitulo();
            String autor = "Precio: " + libro.getAutor();

            binding.tvTituloItem.setText(titulo);
            binding.tvAutorItem.setText(autor);
            binding.ivTumbnail.setImageResource(libro.getImagen());

            binding.itemLibro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context.getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("libro", libro);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });
        }
    }
}
