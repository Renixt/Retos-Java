public class TransicionSimple implements TransicionHistoria{
    @Override
    public String siguienteEscena(boolean escena) {
        String op = escena ? "Final_1" : "Final_2";
        return op;
    }
}
