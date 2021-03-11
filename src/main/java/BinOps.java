public class BinOps {
  public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    int x = Integer.parseInt(a, 2);
    int y = Integer.parseInt(b, 2);
    //System.out.println("x=" + x + "; y=" + y + "; x*y=" + (x + y));
    return Integer.toBinaryString(x + y);
  }

  public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
    int x = Integer.parseInt(a, 2);
    int y = Integer.parseInt(b, 2);
    //System.out.println("x=" + x + "; y=" + y + "; x*y=" + (x * y));
    return Integer.toBinaryString(x * y);
  }
}
