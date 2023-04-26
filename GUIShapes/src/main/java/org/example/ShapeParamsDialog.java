package org.example;

import javax.swing.*;
import java.awt.*;

public abstract class ShapeParamsDialog extends JDialog {
  private boolean validInput = false;

  public ShapeParamsDialog(JFrame parent, String title) {
    super(parent, title, true);
    setLayout(new GridLayout(3, 2));
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    drawInputs();

    // add OK and Cancel buttons
    JButton okButton = new JButton("OK");
    okButton.addActionListener(e -> {
      if (isValidInput()) {
        validInput = true;
        dispose();
      }
    });
    add(okButton);

    JButton cancelButton = new JButton("Cancel");
    cancelButton.addActionListener(e -> {
      dispose();
    });
    add(cancelButton);

    pack();
    setVisible(true);
  }

  public boolean getIsValidInput() {
    return validInput;
  }

  public abstract void drawInputs();
  public abstract boolean isValidInput();
}
