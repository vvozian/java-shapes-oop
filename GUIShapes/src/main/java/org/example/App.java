package org.example;

import org.GUIApp.Circle;
import org.GUIApp.Drawable;
import org.GUIApp.RegularPolygon;
import org.GUIApp.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
  private JPanel canvas;
  private JButton[] shapeButtons;

  private enum ShapesType {SQUARE, REGULAR_POLYGON, CIRCLE, TRIANGLE}

  private ArrayList<Drawable> shapes = new ArrayList<Drawable>();

  public App() throws HeadlessException {
    super("Drawer app");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // create canvas panel
    canvas = new JPanel();
    canvas.setBackground(Color.WHITE);
    add(canvas, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(ShapesType.values().length, 1));
    shapeButtons = new JButton[ShapesType.values().length];
    for (int i = 0; i < ShapesType.values().length; i++) {
      shapeButtons[i] = new JButton(ShapesType.values()[i].toString());
      shapeButtons[i].addActionListener(this);
      buttonPanel.add(shapeButtons[i]);
    }
    add(buttonPanel, BorderLayout.WEST);

    // set window size and show
    setSize(500, 500);
    setVisible(true);
    setResizable(false);
  }

  public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < ShapesType.values().length; i++) {
      if (e.getSource() == shapeButtons[i]) {
        Drawable newShape = null;
        switch (ShapesType.values()[i]) {
          case CIRCLE: {
            CircleParamsDialog dialog = new CircleParamsDialog(this, "Enter position for " + "Shape");
            if (dialog.getIsValidInput()) {
              newShape = new Circle(dialog.getXPos(), dialog.getYPos(), dialog.getRadius());
            }
            break;
          }
          case SQUARE: {
            SquareParamsDialog dialog = new SquareParamsDialog(this, "Enter position for " + "Shape");
            if (dialog.getIsValidInput()) {
              newShape = new Square(dialog.getXPos(), dialog.getYPos(), 0, dialog.getSideLength());
            }
            break;
          }
          case REGULAR_POLYGON: {
            RegularPolygonParamsDialog dialog = new RegularPolygonParamsDialog(this, "Enter position for " + "Shape");
            if (dialog.getIsValidInput()) {
              newShape = new RegularPolygon(dialog.getXPos(), dialog.getYPos(), 0, dialog.getRadius(), dialog.getSidesNumber());
            }
            break;
          }
        }
        if (newShape != null) {
          newShape.draw((Graphics2D) canvas.getGraphics());
          shapes.add(newShape);
          System.out.println("Recently added shape: "+newShape);
        }
        break;
      }
    }
  }
}
