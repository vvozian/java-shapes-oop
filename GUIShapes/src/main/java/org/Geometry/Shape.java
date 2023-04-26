package org.Geometry;

public abstract class Shape {
  private double posX;
  private double posY;
  private double angleZ;

  public Shape(double posX, double posY, double angleZ) {
    this.posX = posX;
    this.posY = posY;
    this.angleZ = angleZ;
  }

  public Shape(double posX, double posY) {
    this.posX = posX;
    this.posY = posY;
    this.angleZ = 0;
  }

  public Shape() {
    this.posX = 0;
    this.posY = 0;
    this.angleZ = 0;
  }

  public double getPosX() {
    return posX;
  }

  public void setPosX(double posX) {
    this.posX = posX;
  }

  public double getPosY() {
    return posY;
  }

  public void setPosY(double posY) {
    this.posY = posY;
  }

  public void setPos(double posX, double posY) {
    this.posX = posX;
    this.posY = posY;
  }

  public double getAngleZ() {
    return angleZ;
  }

  public void setAngleZ(double angleZ) {
    this.angleZ = angleZ;
  }

  public String getShapeParamsInString() {
    return "xPos: " + getPosX() + ", yPos: " + getPosY() + ", angleZ: " + getAngleZ();
  }

  @Override
  public String toString() {
    return "Shape(" + getShapeParamsInString() + ")";
  }

  public abstract double getArea();

  public abstract double getPerimeter();
}
