public class Calculator{

  public Calculator(){

  }
//Adding
  public double add(double a,double b){
    return a + b;
  }
//Subtracting
  public double subtract(double a,double b){
    return a - b;
  }
//Multipling
  public double multiply(double a,double b){
    return a * b;
  }
//Dividing
  public double divide(double a,double b){
    return a / b;
  }
//Modulo
  public double modulo(double a,double b){
    return a % b;
  }
//other
  public String thing(){
    return "Nothing";
  }
//Main
  public static void main(String[] args) {
    Calculator mC = new Calculator();
    System.out.println(mC.thing());
  }
}
