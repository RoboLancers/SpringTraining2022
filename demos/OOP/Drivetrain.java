package demos.OOP;

public class Drivetrain extends Subsystem {
    public Gamepad gamepad;

    private int motor1;
    private int motor2;

    public Drivetrain(){}

    @Override
    public void init(){
        this.gamepad = new Gamepad();
    }

    @Override
    public void update(){
        // do driving!
    }
}
