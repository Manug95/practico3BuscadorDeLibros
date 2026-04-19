package com.example.practico3buscadordelibros.modelos;

import android.content.Context;

import com.example.practico3buscadordelibros.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class RepositorioLibro {
    private static RepositorioLibro instancia;
    private Context context;
    private List<Libro> libros;

    private RepositorioLibro(Context context) {
        this.context = context;
        libros = new ArrayList<>();

        libros.add(new Libro(1, "El Principito", "Antoine de Saint-Exupéry", 1943, 96,
                context.getString(R.string.sinopsis_principito), new ArrayList<>(Arrays.asList("Fantasía", "Infantil")), R.drawable.principito));
        libros.add(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 1000,
                context.getString(R.string.sinopsis_quijote), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.quijote));
        libros.add(new Libro(3, "1984", "George Orwell", 1949, 328,
                context.getString(R.string.sinopsis_1984), new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.l1984));
        libros.add(new Libro(4, "Cien años de soledad", "Gabriel García Márquez", 1967, 417,
                context.getString(R.string.sinopsis_cienanios), new ArrayList<>(Arrays.asList("Realismo Mágico", "Novela")), R.drawable.cienanios));
        libros.add(new Libro(5, "Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 223,
                context.getString(R.string.sinopsis_potter), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter));
        libros.add(new Libro(6, "El señor de los anillos: La comunidad del Anillo", "J.R.R. Tolkien", 1954, 1178,
                context.getString(R.string.sinopsis_anillos), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.anillos));
        libros.add(new Libro(7, "El gran Gatsby", "F. Scott Fitzgerald", 1925, 180,
                context.getString(R.string.sinopsis_gatsby), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.gatsby));
        libros.add(new Libro(8, "Orgullo y prejuicio", "Jane Austen", 1813, 374,
                context.getString(R.string.sinopsis_orgullo), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.orgullo));
        libros.add(new Libro(9, "Matar a un ruiseñor", "Harper Lee", 1960, 279,
                context.getString(R.string.sinopsis_ruisenior), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.ruisenior));
        libros.add(new Libro(10, "Crimen y castigo", "Fyodor Dostoevsky", 1866, 112,
                context.getString(R.string.sinopsis_crimen), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.crimen));
        libros.add(new Libro(11, "Los juegos del hambre", "Suzanne Collins", 2008, 309,
                context.getString(R.string.sinopsis_hambre), new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.hambre));
        libros.add(new Libro(12, "El alquimista", "Paulo Coelho", 1988, 209,
                context.getString(R.string.sinopsis_alquimista), new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.alquimista));
        libros.add(new Libro(13, "El nombre del viento", "Patrick Rothfuss", 2007, 662,
                context.getString(R.string.sinopsis_viento), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.viento));
        libros.add(new Libro(14, "El hobbit", "J.R.R. Tolkien", 1937, 310,
                context.getString(R.string.sinopsis_hobbit), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.hobbit));
        libros.add(new Libro(15, "El código Da Vinci", "Dan Brown", 2003, 454,
                context.getString(R.string.sinopsis_davinci), new ArrayList<>(Arrays.asList("Misterio", "Thriller")), R.drawable.davinci));
        libros.add(new Libro(16, "La llamada de Cthulhu", "H. P. Lovecraft", 1898, 420,
                context.getString(R.string.sinopsis_cthulhu), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.cthulhu));
        libros.add(new Libro(17, "Harry Potter y la camara secreta", "J.K. Rowling", 1998, 352,
                context.getString(R.string.sinopsis_potter2), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter2));
        libros.add(new Libro(18, "Harry Potter y el prisionero de Azkaban", "J.K. Rowling", 1999, 435,
                context.getString(R.string.sinopsis_potter3), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter3));
        libros.add(new Libro(19, "Harry Potter y el cáliz de fuego", "J.K. Rowling", 2000, 720,
                context.getString(R.string.sinopsis_potter4), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter4));
        libros.add(new Libro(20, "Harry Potter y la orden del fenix", "J.K. Rowling", 2003, 636,
                context.getString(R.string.sinopsis_potter5), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter5));
        libros.add(new Libro(21, "Harry Potter las reliquias de la muerte", "J.K. Rowling", 2007, 607,
                context.getString(R.string.sinopsis_potter6), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter6));
        libros.add(new Libro(22, "El Señor de los anillos: Las dos torres", "J.R.R. Tolkien", 1954, 352,
                context.getString(R.string.sinopsis_anillos2), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.anillos2));
        libros.add(new Libro(23, "El Señor de los anillos: El retorno del rey", "J.R.R. Tolkien", 1955, 416,
                context.getString(R.string.sinopsis_anillos3), new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.anillos3));
        libros.add(new Libro(24, "Los juegos del hambre: En Llamas", "Suzanne Collins", 2008, 309,
                context.getString(R.string.sinopsis_hambre2), new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.hambre2));
        libros.add(new Libro(25, "Los juegos del hambre: Sinsajo", "Suzanne Collins", 2008, 309,
                context.getString(R.string.sinopsis_hambre3), new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.hambre3));
    }

    public static RepositorioLibro getInstance(Context context) {
        if (instancia == null)
            instancia = new RepositorioLibro(context);

        return instancia;
    }

    public ArrayList<Libro> listarLibrosPorTitulo(String titulo) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        if (titulo != null) {
            for (Libro libro : libros) {
                if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                    librosEncontrados.add(libro);
                }
            }
        }
        return librosEncontrados;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        if (titulo != null) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    return  libro;
                }
            }
        }
        return null;
    }
}
