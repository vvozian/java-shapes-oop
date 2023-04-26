package org.GUIApp;

import org.Geometry.Shape;

import java.awt.*;

public interface DrawableShape {
  void draw(Graphics2D graphics);
  double getArea();
  double getPerimeter();
}
