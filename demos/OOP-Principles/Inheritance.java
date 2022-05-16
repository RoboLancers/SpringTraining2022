package demos;

public class Inheritance {
    public static void main(String[] args){
        Person finn = new Person("Finn", 17);
        finn.sayHello();

        BankUser matt = new BankUser("Matt", 16, 12345);
        matt.sayHello();

        Person phong = new BankUser("Phong", 18, 67890);
        phong.sayHello();
    }

    static class Person {
        public String name;
        public int age;

        public Person(){};

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void sayHello(){
            System.out.println("Hello I'm a person");
        }
    }

    static class BankUser extends Person {
        private int ID;

        public BankUser(String name, int age, int ID){
            super(name, age);

            this.ID = ID;
        }

        @Override
        public void sayHello(){
            System.out.println("Hello! I'm a Bank User");
        }
    }
}
