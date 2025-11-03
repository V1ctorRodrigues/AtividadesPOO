public class RetanguloExercicio2 {
    private double altura = 1;
    private double largura = 1;

    public void setAltura(double altura){
        if(altura <= 0 || altura > 20){
            System.out.println("Valor inválido");}
        else{
            this.altura = altura;
        }
    }

    public void setLargura(double largura){
         if(largura <= 0 || largura > 20){
            System.out.println("Valor inválido");}
        else{
            this.largura = largura;
        }
    }

    public double getAltura(){
        System.out.println("Sua altura atual: " + altura);
        return altura;
    }

    public double getLargura(){
        System.out.println("Sua largura atual: " + largura);
        return largura;
    }

    public double calcularPerimetro (){
        double perimetro = 2*(altura+largura);
        System.out.println("O valor do perimetro é: " + perimetro);
        return perimetro;
    }

    public double calcularArea(){
        double area = (altura*largura);
        System.out.println("O valor da area é: " + area);
        return area;
    }
    
}
