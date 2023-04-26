package org.GUIApp;

import java.awt.*;

public class Square extends org.Geometry.Square implements DrawableShape {
  public Square(double posX, double posY, double angleZ, double sideLength) {
    super(posX, posY, angleZ, sideLength);
  }

  @Override
  public void draw(Graphics2D graphics) {
    graphics.drawRect((int) getPosX(), (int) getPosY(), (int) getSideLength(), (int) getSideLength());
  }
}
