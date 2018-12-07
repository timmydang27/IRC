public class AutoDrive extends TimedCommand{
    private Drivetrain drivetrain;
    public AutoDrive(double time){
        super(time);
       requires(Robot.drivetrain);
       drivetrain = Robot.getDrivetrain();
    }
    protected void execute(){
        drivetrain.setSpeed(-0.5, -0.5);
    }

    protected boolean isFinished(){
        return isTimedOut();
    }

    protected void end(){
        drivetrain.setSpeed(0, 0);
    }

    protected void interrupted(){
        super.interrupted();
    }

}