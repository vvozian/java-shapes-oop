package org.GUIApp;

import java.awt.*;

public class Circle extends org.Geometry.Circle implements DrawableShape {
  public Circle(double posX, double posY, double radius) {
    super(posX, posY, radius);
  }

  @Override
  public void draw(Graphics2D graphics) {
    graphics.drawOval((int) getPosX(), (int) getPosY(), 2 * (int) getRadius(), 2 * (int) getRadius());
  }
}
