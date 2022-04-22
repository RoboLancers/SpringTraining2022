package demos;

public class EnumExample {
    enum Curses {
        IGNITE,
        TELEPORT,
        FLOAT,
        FUDGE;
    } 

    public static void main(String[] args) {
        Curses ourCurse = Curses.TELEPORT;
        switch(ourCurse) {
            case IGNITE:
                System.out.println("You are ignited");
                break;
            case TELEPORT:
                System.out.println("You are teleported");    
                break;
        }
    }
}
