package org.GUIApp;

import java.awt.*;

public class RegularPolygon extends org.Geometry.RegularPolygon implements DrawableShape {
  public RegularPolygon(double posX, double posY, double angleZ, double radius, int sidesCount) {
    super(posX, posY, angleZ, radius, sidesCount);
  }

  @Override
  public void draw(Graphics2D graphics) {
    Polygon polygon = new Polygon();

    for (int i = 0; i < getSidesCount(); i++)
      polygon.addPoint((int) (getPosX() + getRadius() * Math.cos(i * 2 * Math.PI / getSidesCount())), (int) (getPosY() + getRadius() * Math.sin(i * 2 * Math.PI / getSidesCount())));

    graphics.drawPolygon(polygon);
  }
}
