package demos;

public class Abstraction {
    public static void main(String[] args){
        // won't work
        // Person finn = new Person("Finn", 17);

        BankUser matt = new BankUser("Matt", 16);
    }

    static abstract class Person {
        public String name;
        public int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        abstract public void sayHello();
    }

    static class BankUser extends Person {
        public BankUser(String name, int age){
            super(name, age);
        }

        @Override
        public void sayHello(){
            System.out.println("Hello");
        }
    }
}
