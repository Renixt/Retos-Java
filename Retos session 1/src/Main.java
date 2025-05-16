import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresa el nombre del paciente");
        String nombre = myObj.nextLine();
        //sout
        System.out.println("Ingresa la edad del paciente");
        int edad = myObj.nextInt();
    //limpiar buh¡ffer input.nextLine()
        System.out.println("Ingresa el expediente del paciente");
        int exp = myObj.nextInt();

        //cerrar scanner
        myObj.close();

    //crear mi objeto
        Paciente paciente1 = new Paciente();
        paciente1.nombre = nombre;
        paciente1.edad = edad;
        paciente1.expediente = exp;

     paciente1.mostrarInfo();
    }
}