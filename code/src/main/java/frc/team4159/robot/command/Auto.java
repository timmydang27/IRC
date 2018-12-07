package frc.team4159.robot.command;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.team4159.robot.subsystems.Drivetrain;

public class Auto extends TimedCommand {

    private Drivetrain drivetrain;

    public Auto(){
        super(5);
        drivetrain = Drivetrain.getInstance();
        requires(Drivetrain.getInstance());
    }


    protected void execute(){

        drivetrain.setSpeed(0.5, 0.5);
    }

    protected boolean isFinished(){
        return isTimedOut();
    }

    protected void end(){
        drivetrain.setSpeed(0,0);
    }

    protected void interrupted(){
        super.end();
    }


}
