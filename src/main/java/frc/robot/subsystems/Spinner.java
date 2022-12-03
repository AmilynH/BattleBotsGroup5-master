package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Spinner extends SubsystemBase{
    private TalonSRX motor = new TalonSRX(1);

    public Spinner(){
        motor.setInverted(true);
        //Can change this depending on what way they want the spinner to spin
        //Can play with this number to see how much voltage we can spend on the spinner
    }
    public void setOn(){
        motor.set(ControlMode.PercentOutput, 1.0);
    }
    
    //Change speed in here depending on what they want
    public void setOff(){
        motor.set(ControlMode.PercentOutput, 0.0);
    }
}
