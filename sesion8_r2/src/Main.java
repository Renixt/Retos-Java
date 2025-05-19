import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

//MONITOR CPU
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el consumo de CPU del servidor:");
    int valor =0;
        HashSet<Object> consumoCPU =new HashSet<>();
        try {
            while (true) {


                consumoCPU.add( valor = scanner.nextInt());
                if(valor<0 || valor>100){
                    throw new ArithmeticException("❌ Error: No se permiten valores negativos ni mayores a 100%. ");
                }else if(valor>=95){
                    throw new ConsumoCriticoException("❌ Consumo Critico! 95%");
                } else if (valor==111) {
                    break;

                }
            }
        }catch (InputMismatchException | ConsumoCriticoException e){
            System.out.println("❌ Error: Debes ingresar un número entero válido.");
        }finally {
            scanner.close();
            System.out.println("📦 Recurso liberado correctamente.");
            System.out.println(consumoCPU);
        }
    }
}