public class Cylinder extends Shape {
  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    super("Cylinder");
    this.height = height;
  }

  @Override
  public double area() {
    return 2 * 4 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * this.radius * height;
  }

  @Override
  public String toString() {
    return super.toString() + "\nradius: " + radius + "\nheight: " + height + "\narea: " + area();
  }
}
