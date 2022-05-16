package demos;

public class Polymorphism {
    public static void main(String[] args){
        sayHello("Matt", "Perlman");
        sayHello("Finn");
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public static void sayHello(String fName, String lName){
        System.out.println("Hello " + fName + " " + lName);
    }

    public static class Something {
        public Something(int a, int b){
            System.out.println(a + " " + b);
        }

        public Something(int a, int b, int c){
            this(a, b);
            System.out.println(c);
        }
    }
}
