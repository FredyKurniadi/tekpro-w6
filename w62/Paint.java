public class Paint {
  private double coverage;

  public Paint(double c) {
    coverage = c;
  }

  // dengan polimorphism, tipe dari parameternya dibuah menjadi Shape sehingga
  // dalam dijalankan untuk semua class yang meng-extend class Shape
  public double amount(Shape s) {
    System.out.println("Computing amount for " + s);
    return s.area() / coverage;
  }
}