import java.util.ArrayList;

public class TesteFormas {
    public static void main(String[] args) {

        ArrayList<FormaBidimensional> formas2D = new ArrayList<>();
        ArrayList<FormaTridimensional> formas3D = new ArrayList<>();

        formas2D.add(new Retangulo("Retângulo", 5, 3));
        formas2D.add(new Circulo("Círculo", 2));

        formas3D.add(new Cubo("Cubo", 4));

        System.out.println("=== Formas Bidimensionais ===");
        for (FormaBidimensional forma : formas2D) {
            System.out.println("Nome: " + forma.nome);
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();
        }

        System.out.println("=== Formas Tridimensionais ===");
        for (FormaTridimensional forma : formas3D) {
            System.out.println("Nome: " + forma.nome);
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Volume: " + forma.calcularVolume());
            System.out.println();
        }
    }
}
