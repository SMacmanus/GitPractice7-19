public class Main {
    double a;
    double b;
    double c;

    public static void main(String[] args){
        System.out.println("Hello World");
    }

    public void add(double a, double b){
        System.out.println(a + b);
    }
    public void subtract(double a, double b){
        System.out.println(a - b);
    }
    public void multiply(double a, double b){
        System.out.println(a * b);
    }
    public void divide(double a, double b){
        System.out.println(a / b);
    }
    public void exponentiate(double a, double b) {
        System.out.println(Math.pow( a, b));
    }
    public void add(double a, double b, double c){
        System.out.println(a + b + c);
    }
    public void multiply(double a, double b, double c){
        System.out.println(a * b * c);
    }
}
