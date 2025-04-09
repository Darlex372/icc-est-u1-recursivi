public class App 
{
    public static void main(String[] args) throws Exception {

        int n = 5;
        int resultadofinal = factorial(n);
        System.out.println("resultado: " + resultadofinal);

        EjerciciosRecursivos e = new EjerciciosRecursivos();
        int fibo = 10;
        System.out.println("El fibonacci de: " + fibo + " es: "+ e.fibonacci(fibo));


        int suma=5;
        System.out.println("La suma consecutiva de: " + suma + " es: " + e.sumaConsecutivos(suma));


    }

    public static int factorial(int n)
    {
        if(n == 0) 
        {
            System.out.println("Alcance el caso base");
            return 1;
        }

        int resultado = n * factorial(n-1);
        System.out.println("Calculando factorial de:" + n + " * factorial("+(n-1)+ "-1)");
        return resultado;


    }
}
