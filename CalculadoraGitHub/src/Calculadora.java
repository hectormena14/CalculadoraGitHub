public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }
 
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
    	if (!esValido(a) || !esValido(b)) {
            System.out.println("Error: operandos no válidos");
            return Double.NaN;
        }

        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero");
        } 
        return a / b;
    }
    
    public static boolean esValido(double numero) {
        return !Double.isNaN(numero) && !Double.isInfinite(numero);
    }

    public static void main(String[] args) {
        System.out.println("Calculadora GitHub");
        System.out.println("Suma: " + sumar(8, 4));
    }
}
