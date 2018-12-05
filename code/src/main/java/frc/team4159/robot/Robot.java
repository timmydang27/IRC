package frc.team4159.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team4159.robot.subsystems.Arm;
import frc.team4159.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {

    private Drivetrain drivetrain;
    private OI oi;
    private static Arm arm;

    @Override

    // run when robot turns on; treat as constructor
    public void robotInit(){
        drivetrain = Drivetrain.getInstance();
        arm = Arm.getInstance();
        oi = OI.getInstance();
    }

    @Override
    //run when the robot is in disable mode
    // robot is on but robot does not work
    public void disabledInit(){

    }

    @Override
    //loop that runs when robot is disable
    public void disabledPeriodic(){

    }

    @Override
    //run when the robot starts auto
    public void autonomousInit(){

    }
    @Override
    //loops this while you're in auto mode
    public void autonomousPeriodic(){
        Scheduler.getInstance().run();
    }
    @Override
    //when you start teleop, after auto when you start driving
    public void teleopInit(){

    }
    @Override
    //loops during teleop
    public void teleopPeriodic(){
        Scheduler.getInstance().run();
    }


    public Drivetrain getDrivetrain(){
        return drivetrain;
    }

    public static Arm getArm(){
        return arm;
    }
}
