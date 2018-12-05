package frc.team4159.robot.command;


import edu.wpi.first.wpilibj.command.Command;
import frc.team4159.robot.OI;
import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Arm;
import frc.team4159.robot.subsystems.Drivetrain;
import frc.team4159.robot.subsystems.Intake;

public class MoveIntake extends Command {

    private OI oi;
    private Intake intake;

    public MoveIntake(){
        oi = OI.getInstance();
        intake = Intake.getInstance();
        //this command is accessing the arm subsystem
        requires(intake);
    }

    @Override
    //it runs when this command starts for the first time
    public void initialize(){}

    @Override
    //50 times per second
    public void execute(){
        if(oi.intakeButtonPressed()){
            intake.intake();
            }else if (oi.outtakeButtonPressed()){
            intake.outtake();
        }else{
            intake.stop();
        }
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    //if somehow this code break, set speed to 0
    protected void end(){
        intake.stop();
    }

    //if another command tries to access subsystem
    protected void interrupted(){
        super.interrupted();
    }

}
