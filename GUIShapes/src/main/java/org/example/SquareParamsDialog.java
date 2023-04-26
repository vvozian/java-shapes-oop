package org.example;

import javax.swing.*;

public class SquareParamsDialog extends ShapeParamsDialog{
  private JTextField sideLengthInput;
  private JTextField xPosInput;
  private JTextField yPosInput;

  public SquareParamsDialog(JFrame parent, String title) {
    super(parent, title);
  }

  public int getSideLength() {
    return Integer.parseInt(sideLengthInput.getText());
  }

  public int getXPos() {
    return Integer.parseInt(xPosInput.getText());
  }

  public int getYPos() {
    return Integer.parseInt(yPosInput.getText());
  }

  @Override
  public void drawInputs() {
    add(new JLabel("Side length: "));
    sideLengthInput = new JTextField();
    add(sideLengthInput);

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
      int sideLength = Integer.parseInt(sideLengthInput.getText());
      int xPos = Integer.parseInt(xPosInput.getText());
      int yPos = Integer.parseInt(yPosInput.getText());
      if (sideLength >= 0 && xPos >= 0 && yPos >= 0 ) {
        return true;
      }
    } catch (NumberFormatException e) {
      // ignore
    }
    JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers >= 0");
    return false;
  }
}
