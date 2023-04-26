package org.Geometry;

public class Square extends RegularPolygon {

  public Square(double posX, double posY, double angleZ, double sideLength) {
    super(posX, posY, angleZ, sideLength / Math.sqrt(2), 4);
  }

  public void setSideLength(double sideLength) {
    setRadius(sideLength / Math.sqrt(2));
  }

  public double getSideLength() {
    return getRadius()*Math.sqrt(2);
  }


}
