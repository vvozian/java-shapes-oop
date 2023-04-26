package org.Geometry;

public class RegularPolygon extends Shape {
  private double radius;
  private int sidesCount;

  public RegularPolygon(double posX, double posY, double angleZ, double radius, int sidesCount) {
    super(posX, posY, angleZ);
    this.radius = radius;
    this.sidesCount = sidesCount;
  }

  @Override
  public double getArea() {
    return 0.5 * getPerimeter() * radius * Math.cos(Math.PI / sidesCount);
  }

  @Override
  public double getPerimeter() {
    return 2 * radius * Math.sin(Math.PI / sidesCount) * sidesCount;
  }

  @Override
  public String getShapeParamsInString() {
    return super.getShapeParamsInString() + ", radius: " + getRadius() + ", sides: " + getSidesCount();
  }

  @Override
  public String toString() {
    return "RegularPolygon(" + getShapeParamsInString() + ")";
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public int getSidesCount() {
    return sidesCount;
  }

  public void setSidesCount(int sidesCount) {
    this.sidesCount = sidesCount;
  }

}
