public class Main {
    public static void main(String[] args) {
        Author edgarAllanPoe = new Author("Edgar Allan Poe");

        // Usando sobrecarga addBook con un objeto Book
        Book book1 = new Book("El Cuervo", edgarAllanPoe, 15.99);
        edgarAllanPoe.addBook(book1);

        // Usando sobrecarga addBook con título y precio
        edgarAllanPoe.addBook("La Caída de la Casa Usher", 12.99);
        edgarAllanPoe.addBook("El Corazón Delator", 10.99);
        edgarAllanPoe.addBook("El Gato Negro", 9.99);

        // Mostrar información de los libros del autor
        for (Book book : edgarAllanPoe.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}