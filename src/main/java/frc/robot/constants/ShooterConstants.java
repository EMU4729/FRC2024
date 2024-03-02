package frc.robot.constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.utils.EncoderSupplier;
import frc.robot.utils.motorsupplier.MotorSupplier;
import frc.robot.utils.motorsupplier.VictorMotorSupplier;

public class ShooterConstants {
  public static final MotorSupplier<WPI_VictorSPX> UPPER_MOTOR_ID = new VictorMotorSupplier(11).withInvert();
  public static final MotorSupplier<WPI_VictorSPX> LOWER_MOTOR_ID = new VictorMotorSupplier(12).withInvert();

  public static final EncoderSupplier ENCODER_ID = new EncoderSupplier(new int[] { 9, 10 }, 1);

  /** Shooter wheel radius in meters */
  public static final double WHEEL_RADIUS = 0.2;

  /**
   * The robot will consider the shooter at the target tangential wheel speed
   * within this tolerance
   */
  public static final double SPEED_TOLERANCE = 0.5;
}
