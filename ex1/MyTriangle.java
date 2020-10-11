package task2.ex1;

public class MyTriangle {
    int ang1;
    int ang2;
    int ang3;
    int angSum;

      public MyTriangle(int ang1, int ang2) {
      this.ang1 = ang1;
      this.ang2 = ang2;
      this.ang3 = 180 - (this.ang1 + this.ang2);
      this.angSum = this.ang1 + this.ang2 + this.ang3;
    }
}
