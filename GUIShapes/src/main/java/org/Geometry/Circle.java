package org.Geometry;

public class Circle extends Shape {
  private double radius;

  public Circle(double posX, double posY, double radius) {
    super(posX, posY);
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * radius;
  }

  @Override
  public String toString() {
    return "Circle(" + getShapeParamsInString() + ")";
  }

  @Override
  public String getShapeParamsInString() {
    return super.getShapeParamsInString() + ", radius: " + getRadius();
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}