package frc.team4159.robot.command;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.team4159.robot.subsystems.Drivetrain;

public class Auto extends CommandGroup{
    public Auto(){
        addSequential(new AutoDrive(0.5));
    }

    /*private Timer timer = new Timer();
    private Drivetrain drivetrain = Drivetrain.getInstance();

    public Auto(){
        requires(Drivetrain.getInstance());
    }

    protected void initialize(){
        timer.start();
    }

    protected void execute(){

        drivetrain.setSpeed(-0.5, -0.5);
    }

    protected boolean isFinished(){
        if(timer.get() == 5){
            return true;
        }else{
            return false;
        }
    }

    protected void end(){

    }

    protected void interrupted(){

    }
*/

}
