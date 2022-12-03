package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.DoubleSupplier;
import frc.robot.subsystems.DriveTrain;

/**
 * A command to drive the robot with joystick input (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes - actual code should inline a command this simple with {@link
 * edu.wpi.first.wpilibj2.command.RunCommand}.
 */
public class Drive extends CommandBase {
 private DriveTrain driveTrain;
 private DoubleSupplier lSpeed;
 private DoubleSupplier rSpeed;

  /**
   * Creates a new Drive.
   *
   */
  public Drive(DriveTrain driveTrain, DoubleSupplier lSpeed, DoubleSupplier rSpeed) {
    this.driveTrain = driveTrain;
    this.lSpeed = lSpeed;
    this.rSpeed = rSpeed;
    addRequirements(driveTrain);
  }

  @Override
  public void execute() {
    driveTrain.tankDrive(lSpeed.getAsDouble(), rSpeed.getAsDouble());
  }
}
