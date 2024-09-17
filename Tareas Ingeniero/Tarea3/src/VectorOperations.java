public class VectorOperations {

    // Suma de vectores
    public static Vector2D add(Vector2D vec1, Vector2D vec2) {
        return new Vector2D(vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY());
    }

    // Resta de vectores
    public static Vector2D subtract(Vector2D vec1, Vector2D vec2) {
        return new Vector2D(vec1.getX() - vec2.getX(), vec1.getY() - vec2.getY());
    }

    // Multiplicación por un escalar
    public static Vector2D multiply(Vector2D vec, double scalar) {
        return new Vector2D(vec.getX() * scalar, vec.getY() * scalar);
    }

    // División por un escalar
    public static Vector2D divide(Vector2D vec, double scalar) {
        if (scalar != 0) {
            return new Vector2D(vec.getX() / scalar, vec.getY() / scalar);
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}