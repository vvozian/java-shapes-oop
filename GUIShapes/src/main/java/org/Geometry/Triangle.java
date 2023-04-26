package org.Geometry;

public class Triangle extends Shape {
  private int sideA;
  private int sideB;
  private double angleAB;

  public Triangle(int posX, int posY, int sideA, int sideB, double angleAB) {
    super(posX, posY);
    this.sideA = sideA;
    this.sideB = sideB;
    this.angleAB = angleAB;
  }

  @Override
  public double getArea() {
    return sideA * sideB * 0.5 * Math.sin(angleAB);
  }

  @Override
  public double getPerimeter() {
    return sideA + sideB + Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(angleAB));
  }
}
