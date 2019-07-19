public class Main {
    String a = "Hello ";
    String b = "world ";
    String c = "and ";
    String d = "goodnight.";

    public static void main(String[] args){
        System.out.println("Hello World");
    }

    public void concatOne(String a, String b, String c, String d){
        System.out.println(a + b + c + d);
    }
    public void concatOne(String a, String b){
        System.out.println(a + b);
    }
}
