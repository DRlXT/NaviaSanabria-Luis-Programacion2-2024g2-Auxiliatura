import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer valores del primer vector
        System.out.print("Ingrese el valor de x para el primer vector: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese el valor de y para el primer vector: ");
        double y1 = scanner.nextDouble();
        Vector2D vec1 = new Vector2D(x1, y1);

        // Leer valores del segundo vector
        System.out.print("Ingrese el valor de x para el segundo vector: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese el valor de y para el segundo vector: ");
        double y2 = scanner.nextDouble();
        Vector2D vec2 = new Vector2D(x2, y2);

        // Leer valor del escalar
        System.out.print("Ingrese el valor del escalar: ");
        double scalar = scanner.nextDouble();

        // Realizar operaciones
        Vector2D sum = VectorOperations.add(vec1, vec2);
        Vector2D diff = VectorOperations.subtract(vec1, vec2);
        Vector2D prod = VectorOperations.multiply(vec1, scalar);
        Vector2D quot = VectorOperations.divide(vec1, scalar);

        // Mostrar resultados
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + diff);
        System.out.println("Multiplicación por escalar: " + prod);
        System.out.println("División por escalar: " + quot);

        scanner.close();
    }
}