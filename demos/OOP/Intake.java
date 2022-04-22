package demos.OOP;

public class Intake extends Subsystem {
    public Gamepad gamepad;

    public boolean servo;
    public double power;

    @Override
    public void init(){
        this.gamepad = new Gamepad();
    }

    @Override
    public void update(){
        if(servo){
            this.power = this.gamepad.A ? 1 : 0;
        } else {
            this.power = 0;
        }
    }
}
