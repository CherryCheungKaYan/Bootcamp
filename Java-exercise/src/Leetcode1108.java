public class Leetcode1108 {
  // Input: address = "1.1.1.1"
  // Output: "1[.]1[.]1[.]1"

  public String defangIPaddr(String address) {
    String defangIPaddr = address.replace(".", "[.]");
    return defangIPaddr;
  }

  public static void main(String[] args) {
   Leetcode1108 solution = new Leetcode1108();
  String address =  "1.1.1.1";
  String newIP = solution.defangIPaddr(address);
  System.out.println(newIP);
 }
}