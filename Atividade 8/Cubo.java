public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(String nome, double lado){
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = 6*(lado*lado);
        return area;
    }

    @Override
    public double calcularVolume(){
        double volume = (lado*lado*lado);
        return volume;
    }

}
