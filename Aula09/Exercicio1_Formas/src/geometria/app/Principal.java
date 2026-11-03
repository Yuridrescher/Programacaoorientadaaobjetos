package geometria.app;

import geometria.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        
        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(4.0, 6.0));
        formas.add(new Triangulo(3.0, 4.0, 5.0));
        formas.add(new Losango(8.0, 6.0, 5.0));

        for (Forma f : formas) {
            System.out.println("Forma: " + f.getClass().getSimpleName());
            System.out.printf("Area: %.2f | Perimetro: %.2f\n", f.calcularArea(), f.calcularPerimetro());
        }
    }
}
