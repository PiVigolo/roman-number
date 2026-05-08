/////////////////////////////////
// Andrea Pettinà 2148010
// Pietro Vigolo 2137984
/////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number){
    if (number < 1 || number > 1000) {
        throw new IllegalArgumentException("Numero fuori range");
    }
    String result = "";
    if(number>=50){
      result+="L";
      number-=50;
    }
    if(number>=10){
      result+="X";
      number-=10;
    }
    if (number >= 5) {
        result += "V";
        number -= 5;
    }
    if (number == 4) {
        result += "IV";
        number -= 4;
    }
    while (number >= 1) {
        result += "I";
        number -= 1;
    }
    return result;
  }
}
