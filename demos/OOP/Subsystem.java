package demos.OOP;

public abstract class Subsystem {
    public abstract void init();

    public abstract void update();

    public Subsystem(){
        this.init();
    };
}
