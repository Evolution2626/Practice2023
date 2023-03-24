// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private Spark flDriveMotor;
  private Spark frDriveMotor;
  private Spark blDriveMotor;
  private Spark brDriveMotor;

  public Drivetrain() {
  
  flDriveMotor = new Spark(2);
  frDriveMotor = new Spark(0);
  blDriveMotor = new Spark(3);
  brDriveMotor = new Spark(1);
}



public void driveTank(double joystickDroit, double joystickGauche){
  flDriveMotor.set(Math.pow(joystickGauche, 3));
  frDriveMotor.set(Math.pow(joystickDroit, 3));
  blDriveMotor.set(Math.pow(joystickGauche, 3));
  brDriveMotor.set(Math.pow(joystickDroit, 3));


}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
