package frc.team4159.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4159.robot.subsystems.Arm;


public class OI {
    private static OI instance;

    public static OI getInstance(){
        if(instance == null)
            instance = new OI();
        return instance;
    }

    private Joystick xbox;
    private Joystick secondaryJoy;

    private OI() {
        xbox = new Joystick(0);
        secondaryJoy = new Joystick(1);


    }

    public double getLeftJoy(){

        return xbox.getRawAxis(1);
    }

    public double getRightJoy(){
        return secondaryJoy.getRawAxis(0);
    }

    public double getArmJoy(){
        return secondaryJoy.getY();
    }

    public boolean intakeButtonPressed(){
        return secondaryJoy.getRawButtonPressed(5);
    }

    public boolean outtakeButtonPressed(){
        return secondaryJoy.getRawButtonPressed(8);
    }
}
