package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    private CANSparkMax leftMotor = new CANSparkMax(Constants.DriveTrain.CANIDS.L_MOTOR,MotorType.kBrushless);
    private CANSparkMax rightMotor = new CANSparkMax(Constants.DriveTrain.CANIDS.R_MOTOR,MotorType.kBrushless);
    private DifferentialDrive dDrive;


    public DriveTrain(){
        rightMotor.setInverted(true);
        rightMotor.getEncoder().setPositionConversionFactor(Constants.DriveTrain.Encoders.ENCODER_TO_INCHES);
        leftMotor.getEncoder().setPositionConversionFactor(Constants.DriveTrain.Encoders.ENCODER_TO_INCHES);
        dDrive = new DifferentialDrive(leftMotor, rightMotor);
        dDrive.setMaxOutput(.8);
    }
    public void tankDrive(double leftSpeed, double rightSpeed) {
        dDrive.tankDrive(leftSpeed, rightSpeed);
    }

} 