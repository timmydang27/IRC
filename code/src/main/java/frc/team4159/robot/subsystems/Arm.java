package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4159.robot.command.Drive;
import frc.team4159.robot.command.MoveArm;

public class Arm extends Subsystem {
    private static Arm instance;

    public static Arm getInstance() {

        if(instance == null)
            instance = new Arm();
        return instance;
    }

    //motor controller
    private VictorSP ArmVictor;



    private Arm(){

        ArmVictor = new VictorSP(3);
    }

    //set speed
    public void move(double speed){
        ArmVictor.set(speed);
    }

    @Override
    //abstract class
    protected void initDefaultCommand(){
        new MoveArm();
    }
}

