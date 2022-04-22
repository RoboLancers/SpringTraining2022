package demos.OOP;

public class Gamepad {
    public boolean A;
    public boolean B;
    public boolean X;
    public boolean Y;

    public double leftStick;
    public double rightStick;

    public Gamepad(){
        this.A = false;
        this.B = false;
        this.X = false;
        this.Y = false;

        this.leftStick = 0;
        this.rightStick = 0;
    }
}
