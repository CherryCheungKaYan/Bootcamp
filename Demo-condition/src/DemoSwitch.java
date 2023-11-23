public class DemoSwitch {
  public static void main(String[] args) {
    // if, else-if -> comparision and logical comparison

    // switch: single value comparison (==)
    char vipGrade = 'G'; // G / S / N
    double discount = 0.0d; // Silver(S) -> 10%, Gold(G) -> 20%
    // switch(vipGrade) {
    // case 'G':
    // discount += 0.2d; //discount = discount + 0.2d
    // case 'S':
    // discount += 0.1d; //discount = discount + 0.1d
    // case 'N':
    // discount += 0.0d; //discount = discount + 0.0d

    // System.out.println("discout is=" + discount);

    // }

    // with break


    switch (vipGrade) {
    case 'G':
    discount += 0.2d;
    break;// discount = discount + 0.2d
    case 'S':
    discount += 0.1d; // discount = discount + 0.1d
    break;
    case 'N':
    default: // other characters

    }
    // System.out.println("discout is=" + discount);

  }
}
