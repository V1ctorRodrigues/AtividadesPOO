public class Quadrado extends FormaBidimensional{ 
    private double lado;

    public Quadrado(double lado, String nome){
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = lado*lado;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 4*lado;
        return perimetro;
    }
}
