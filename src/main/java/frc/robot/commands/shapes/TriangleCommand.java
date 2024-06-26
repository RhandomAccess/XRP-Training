package frc.robot.commands.shapes;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.XRPDrivetrain;

//TODO: This command should have the drivetrain move in a triangle fashion
public class TriangleCommand extends Command {
  private final XRPDrivetrain m_drivetrain;

  // use this boolean to tell the command when it should finish
  private boolean isFinished = false;

  public TriangleCommand(XRPDrivetrain drivetrain) {
    m_drivetrain = drivetrain;
    // each subsystem used by the command must be passed into the
    // addRequirements() method (which takes a vararg of Subsystem)
    addRequirements(m_drivetrain);
  }

  @Override
  public void execute() {
    // Repeat the same motions 3 times (for a triangle)
    for (int i = 0; i < /* insert something here */; i++) {
      // Drive then turn
    }

    // Stop command
    isFinished = true;
  }

  @Override
  public boolean isFinished() {
    return isFinished;
  }

  @Override
  public void end(boolean interrupted) {
    m_drivetrain.arcadeDrive(0, 0);
  }
}
