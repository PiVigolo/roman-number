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
    int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder strS=new StringBuilder();//stringa dove salvo i simboli
    for(int i=0; i<val.length; i++){//parto dal più grande e lo sottrago se < number
        while(number >= val[i]) {
        number -= val[i];
        strS.append(symbols[i]);
      }
    }
    return strS.toString();
  }
}
