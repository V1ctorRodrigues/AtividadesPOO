public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio=raio;
    }

    @Override
    public double calcularArea(){
        double area = raio*Math.PI;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 2*Math.PI*raio;
        return perimetro;
    }

}
