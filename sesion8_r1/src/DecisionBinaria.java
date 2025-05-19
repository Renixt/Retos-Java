
import java.util.Locale;
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{
    @Override
    public boolean leerDesicion(){
        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine().toLowerCase(Locale.ROOT);
        int i=0;
        while (i!=1) {


            if (decision.equals("a")) {
                i=1;

                return true;

            } else if (decision.equals("b")) {
                i=1;
                return false;

            } else {
                System.out.println("Intenta de nuevo:");
                 decision = scanner.nextLine().toLowerCase(Locale.ROOT);
            }
        }
        System.out.println("ultimo false?");
        return false;
    }

    public void imprimirDesicion(boolean decision){
        String op = decision ? "a" : "b";
            System.out.println("Elegiste la opcion " + op);

    }
}
