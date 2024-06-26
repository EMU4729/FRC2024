package frc.robot.constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.utils.motorsupplier.MotorSupplier;
import frc.robot.utils.motorsupplier.VictorMotorSupplier;

public class ClimberConstants {
  // port needs to be set correctly
  public static final MotorSupplier<WPI_VictorSPX> MOTOR_1_ID = new VictorMotorSupplier(11).withBrake();

  public static final int SERVO_PORT = 2;
  public static final int CLIMBER_STOP_PORT = 8;
  public static final boolean SERVO_FLIPPED = true;
  /** Servo position when it is locking the climber motor */
  public static final double SERVO_LOCKED_POS = SERVO_FLIPPED ? 0.7 : 0.4;
  /** Servo position when it is not locking the climber motor */
  public static final double SERVO_UNLOCKED_POS = SERVO_FLIPPED ? 0.4 : 0.7;

} 
