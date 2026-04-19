# Practico 3 BuscadorDeLibros

Esta es una aplicación de Android desarrollada en Java que permite a los usuarios buscar libros de una biblioteca local y visualizar sus detalles.

## Funcionalidades
- **Buscador Principal**: Búsqueda de libros por título con un campo de texto.
- **Lista de Resultados**: Visualización de los libros encontrados en un `RecyclerView` con tarjetas personalizadas.
- **Detalle del Libro**: Vista detallada que incluye la portada, autor, año, páginas, géneros y descripción.
- **Validaciones**: Manejo de búsquedas sin resultados mediante mensajes dinámicos.

## Tecnologías y Conceptos Utilizados
- **Arquitectura**: MVVM (Model-View-ViewModel).
- **Componentes de Arquitectura**: `ViewModel` y `LiveData`.
- **UI**: 
  - `ConstraintLayout` para diseños complejos.
  - `View Binding` para la interacción con las vistas.
  - `RecyclerView` con `Adapter` para listas eficientes.
- **Navegación**: Pasaje de objetos entre Actividades mediante `Intent` y `Serializable`.

## Libros Incluidos en la Base de Datos
La aplicación cuenta con una colección predefinida que incluye títulos clásicos y modernos:
*   El Principito
*   Don Quijote de la Mancha
*   1984
*   Cien años de soledad
*   Harry Potter (Saga completa)
*   El Señor de los Anillos (Trilogía)
*   Orgullo y Prejuicio
*   Crimen y Castigo
*   Los Juegos del Hambre (Trilogía)
*   El Hobbit
*   El Código Da Vinci
*   La llamada de Cthulhu
*   ... entre otros.
