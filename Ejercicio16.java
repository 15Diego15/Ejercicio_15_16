
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio16 {
    public static void main(String args[]) throws IOException {
        Ejercicio16 ejercicio16 = new Ejercicio16();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese cantidad en EUROS:");
        String eurosString = br.readLine();

        Float euros = Float.parseFloat(eurosString);
        Float dolars = ejercicio16.getDolars(euros);
        Float pounds = ejercicio16.getPounds(euros);

        System.out.println("Dolars: " + dolars + "$");
        System.out.println("Pounds: " + pounds + "£");
    }

    private Float getDolars(Float euros) {
        return euros * 1.06f;
    }

    private Float getPounds(Float euros) {
        return euros / 1.16f;
    }
}
