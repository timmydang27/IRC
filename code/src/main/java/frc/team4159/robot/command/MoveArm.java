package frc.team4159.robot.command;

        import edu.wpi.first.wpilibj.command.Command;
        import frc.team4159.robot.OI;
        import frc.team4159.robot.Robot;
        import frc.team4159.robot.subsystems.Arm;
        import frc.team4159.robot.subsystems.Drivetrain;

public class MoveArm extends Command {

    private OI oi;
    private Arm arm;

    public MoveArm(){
        oi = OI.getInstance();
        arm = Robot.getArm();
        //this command is accessing the arm subsystem
        requires(arm);
    }

    @Override
    //it runs when this command starts for the first time
    public void initialize(){}

    @Override
    //50 times per second
    public void execute(){
        arm.move(oi.getArmJoy());
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    //if somehow this code break, set speed to 0
    protected void end(){
        arm.move(0);
    }

    //if another command tries to access subsystem
    protected void interrupted(){
        super.interrupted();
    }

}
