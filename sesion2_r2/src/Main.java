import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int saldo = 1000;
        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(saldo);
        int op;
        Scanner scanner= new Scanner(System.in);


        do {
            System.out.println("Bienvenido al cajero automatico!");
            System.out.println("1.Consultar saldo.");
            System.out.println("2.Depositar dinero.");
            System.out.println("3.Retirar dinero.");
            System.out.println("4.Salir.");
             op = scanner.nextInt();
            switch(op) {
          case 1 -> {
              System.out.println("1.Consultar saldo.");
                cajeroAutomatico.ConsultarSaldo();
          }
          case 2 ->{
              System.out.println("2.Depositar dinero.");
              cajeroAutomatico.DepositarDinero();

          }
          case 3 ->{
              System.out.println("3.Retirar dinero.");
              cajeroAutomatico.RetirarDinero();
          }
          case 4->System.out.println("4.Salir.");

          default -> System.out.println("Opcion invalida, vuelve a intentarlo.");
            }



        }while(op!=4);


    }
}