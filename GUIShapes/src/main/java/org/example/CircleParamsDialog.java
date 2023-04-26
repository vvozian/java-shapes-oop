package org.example;

import javax.swing.*;

public class CircleParamsDialog extends ShapeParamsDialog{
  private JTextField radiusInput;
  private JTextField xPosInput;
  private JTextField yPosInput;

  public CircleParamsDialog(JFrame parent, String title) {
    super(parent, title);
  }

  public int getRadius() {
    return Integer.parseInt(radiusInput.getText());
  }

  public int getXPos() {
    return Integer.parseInt(xPosInput.getText());
  }

  public int getYPos() {
    return Integer.parseInt(yPosInput.getText());
  }

  @Override
  public void drawInputs() {
    add(new JLabel("Radius: "));
    radiusInput = new JTextField();
    add(radiusInput);

    add(new JLabel("X pos: "));
    xPosInput = new JTextField();
    add(xPosInput);

    add(new JLabel("Y pos: "));
    yPosInput = new JTextField();
    add(yPosInput);

  }

  @Override
  public boolean isValidInput() {
    try {
      int radius = Integer.parseInt(radiusInput.getText());
      int xPos = Integer.parseInt(xPosInput.getText());
      int yPos = Integer.parseInt(yPosInput.getText());
      if (radius >= 0 && xPos >= 0 && yPos >= 0 ) {
        return true;
      }
    } catch (NumberFormatException e) {
      // ignore
    }
    JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers >= 0");
    return false;
  }
}
