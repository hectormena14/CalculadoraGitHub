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
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero");
        } else {
        	return a / b;
        }
		return b;
    }


 
    public static void main(String[] args) {
        System.out.println("Calculadora GitHub");
        System.out.println("Suma: " + sumar(8, 4));
        System.out.println("Resta: " + restar(8, 4));
        System.out.println("Multiplicación: " + multiplicar(8, 4));
        System.out.println("División: " + dividir(8, 4));
        System.out.println("División entre cero: " + dividir(8, 0));
    }

}
