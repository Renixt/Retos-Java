import java.util.Scanner;
public class CajeroAutomatico {
    int saldo;

    public CajeroAutomatico(int saldo){
        this.saldo = saldo;
    }

    public void ConsultarSaldo(){
        System.out.println("Saldo Actual: " + saldo);
        System.out.println(" ");
    }

    public void DepositarDinero(){
        System.out.println("Ingrese el monto a depositar:");
        Scanner scanner = new Scanner(System.in);
        int monto = scanner.nextInt();

        saldo= saldo+monto;
        System.out.println("Monto depositado, saldo actual: " + saldo);
    }

    public void RetirarDinero(){
        System.out.println("Ingrese el monto a retirar:");
        Scanner scanner = new Scanner(System.in);
        int monto = scanner.nextInt();

        if(monto<=saldo){
            System.out.println("Retirando dinero...");
            saldo = saldo-monto;
            System.out.println("Saldo actualizado: " + saldo);
        }else{
            System.out.println("Fondos insuficientes!");
        }
    }

}
