public class Exerc2 {

    public static double hipotenusa (double a, double b){
        double quadradoa = a*a; 
        double quadradob = b*b;
        double c = quadradoa + quadradob;
        c = Math.sqrt(c);
        return c; 
    }
    public static void main(String[] args) {
        System.out.println("A hipotenusa é: " + hipotenusa(10, 12));
    }
}