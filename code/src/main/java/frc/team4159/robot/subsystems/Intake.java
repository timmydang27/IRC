package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake  extends Subsystem{

    private static Intake instance;

    public static Intake getInstance(){
        if(instance == null)
                instance = new Intake();
            return instance;
    }

    private VictorSP rightVictor;
    private VictorSP leftVictor;

    private Intake(){
        rightVictor = new VictorSP(4);
        leftVictor = new VictorSP(5);

    }

    public void intake(){
        rightVictor.set(1);
        leftVictor.set(-1);
    }

    public void outtake(){
        rightVictor.set(-1);
        leftVictor.set(1);


    }

    public void stop(){
        rightVictor.set(0);
        leftVictor.set(0);

    }

    @Override

    protected void initDefaultCommand(){

    }
}
