package frc.robot.auto;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Subsystems;
import frc.robot.commands.DriveForDistanceCommand;

/**
 * Naive Auto - Literally justs drives out of the starting zone to get mobility
 * points.
 */
public class tmpAuto extends SequentialCommandGroup {
  public tmpAuto() {
    addCommands(
        // Start driving the robot forwards
        new DriveForDistanceCommand(0,-0.1,0.5));
  }
}
