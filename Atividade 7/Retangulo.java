public class Retangulo extends FormaBidimensional {
    private double base; 
    private double altura;

    public Retangulo(String nome, double base, double altura){
        super(nome);
        this.base = base; this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area = base*altura;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 2*(base+altura);
        return perimetro;
    }

}
