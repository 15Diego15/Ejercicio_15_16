

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main(String args[]) throws IOException {
        Ejercicio15 ejercicio15 = new Ejercicio15();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese los grados Celsius:");
        String celsiusDegreeString = br.readLine();

        Float celsiusDegree = Float.parseFloat(celsiusDegreeString);
        Float kelvinDegrees = ejercicio15.getKelvinDegrees(celsiusDegree);
        Float fahrenheitDegrees = ejercicio15.getFahrenheitDegrees(celsiusDegree);

        System.out.println("Grados Kelvin: " + kelvinDegrees);
        System.out.println("Grados Fahrenheit: " + fahrenheitDegrees);
    }

    private Float getKelvinDegrees(Float celsiusDegree) {
        return 273.15f + celsiusDegree;
    }

    private Float getFahrenheitDegrees(Float celsiusDegree) {
        return (celsiusDegree * 9 / 5) + 32;
    }
}
