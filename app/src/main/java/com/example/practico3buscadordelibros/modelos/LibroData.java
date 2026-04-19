package com.example.practico3buscadordelibros.modelos;

import com.example.practico3buscadordelibros.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class LibroData {
    private static LibroData instancia;
    private List<Libro> libros;

    private LibroData() {
        libros = new ArrayList<>();

        libros.add(new Libro(1, "El Principito", "Antoine de Saint-Exupéry", 1943, 96,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Infantil")), R.drawable.principito));
        libros.add(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 1000,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.quijote));
        libros.add(new Libro(3, "1984", "George Orwell", 1949, 328,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.l1984));
        libros.add(new Libro(4, "Cien años de soledad", "Gabriel García Márquez", 1967, 417,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Realismo Mágico", "Novela")), R.drawable.cienanios));
        libros.add(new Libro(5, "Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 223,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter));
        libros.add(new Libro(6, "El señor de los anillos", "J.R.R. Tolkien", 1954, 1178,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.anillos));
        libros.add(new Libro(7, "El gran Gatsby", "F. Scott Fitzgerald", 1925, 180,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.gatsby));
        libros.add(new Libro(8, "Orgullo y prejuicio", "Jane Austen", 1813, 374,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.orgullo));
        libros.add(new Libro(9, "Matar a un ruiseñor", "Harper Lee", 1960, 279,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.ruisenior));
        libros.add(new Libro(10, "Crimen y castigo", "Fyodor Dostoevsky", 1866, 112,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.crimen));
        libros.add(new Libro(11, "Los juegos del hambre", "Suzanne Collins", 2008, 309,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.hambre));
        libros.add(new Libro(12, "El alquimista", "Paulo Coelho", 1988, 209,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.alquimista));
        libros.add(new Libro(13, "El nombre del viento", "Patrick Rothfuss", 2007, 662,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.viento));
        libros.add(new Libro(14, "El hobbit", "J.R.R. Tolkien", 1937, 310,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.hobbit));
        libros.add(new Libro(15, "El código Da Vinci", "Dan Brown", 2003, 454,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Misterio", "Thriller")), R.drawable.davinci));
        libros.add(new Libro(16, "La llamada de Cthulhu", "H. P. Lovecraft", 1898, 420,
                "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.cthulhu));
    }

    public static LibroData getInstance() {
        if (instancia == null)
            instancia = new LibroData();

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
