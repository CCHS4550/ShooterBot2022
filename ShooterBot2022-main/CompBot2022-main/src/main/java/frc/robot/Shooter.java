package frc.robot;

import frc.parent.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;

//Shooter code




public class Shooter {
//MOTOR TEMPLATE DO NOT DELETE: public static CCSparkMax fLeft = new CCSparkMax("Front Left", "FL", RobotMap.FORWARD_LEFT, MotorType.kBrushless, IdleMode.kBrake, RobotMap.FORWARD_LEFT_REVERSE); 
    public static CCSparkMax shooter = new CCSparkmax("Shooter", "S", RobotMap.Shooter, 
    MotorType.kBrushless, IdleMode.kBrake, RobotMap.SHOOTER_REVERSE);
    public static CCSparkMax Intake = new CCSparkmax("Intake", "In", RobotMap.INTAKE, 
        MotorType.kBrushless, IdleMode.kBrake, RobotMap.INTAKE_REVERSE);
    
    public boolean activated = true;
    

    public static void setShooterSpeed(boolean speed){
        shooter.set(speed);
    }

    public static sucky(boolean intake) {
        if(intake == true)
            Intake.set(.5);
        else if(intake == false)
            Intake.set(0);
    }
}   







