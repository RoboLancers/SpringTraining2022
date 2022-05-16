package demos.motors;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

// basic use for motors
public class Motor {
    // normally these are stored in constants file
    private final static int kPort = 0;
    private final static double kP = 0;
    private final static double kI = 0;
    private final static double kD = 0;
    private final static double kFF = 0;

    // basic motor object
    private CANSparkMax motor;
    // read position and velocity from a motor
    private RelativeEncoder encoder;
    // accurately set position and/or speed of a motor
    private SparkMaxPIDController controller;

    public Motor(){
        // defining a motor requires the port and type
        this.motor = new CANSparkMax(Motor.kPort, CANSparkMax.MotorType.kBrushless);

        // get encoder instance from a motor
        this.encoder = this.motor.getEncoder();

        // get pid controller instance from a motor, you must set P, I, D, and FF (they can be updated at any time)
        this.controller = this.motor.getPIDController();
        this.controller.setP(Motor.kP); this.controller.setI(Motor.kI); this.controller.setD(Motor.kD); this.controller.setFF(Motor.kFF);
    }

    // basic motor control
    public void setPower(double power){
        this.motor.set(power);
    }

    // read and write to position
    public double getPosition(){
        return this.encoder.getPosition();
    }
    public void setPosition(double position){
        this.controller.setReference(position, CANSparkMax.ControlType.kPosition);
    }
    public void setEncoder(double count){
        this.encoder.setPosition(count);
    }

    // read and write to velocity
    public double getVelocity(){
        return this.encoder.getVelocity();
    }
    public void setVelocity(double velocity){
        this.controller.setReference(velocity, CANSparkMax.ControlType.kVelocity);
    }
}
