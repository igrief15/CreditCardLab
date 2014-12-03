import java.util.Scanner;
//commit to github, provide github url on canvas

public class CreditCard
{
  boolean valid = true;
  String verify(String num)
  {
    if (num.length() <= 13 || num.length() >= 16)
      valid = false;
    String oddsum = "";
    String evensum = "";
    String oddstr = num;
    String evenstr = num;
    for (int i = 0; i < num.length(); i++){ //flips the input, 12345 becomes 54321
      oddsum = oddsum + oddstr.substring(oddstr.length()-1,oddstr.length());
      oddstr = oddstr.substring(0,oddstr.length()-1); 
    }
    String tempstring = oddsum;
    oddsum = "";
    if (tempstring.length() % 2 == 0)
    {
      for (int j = 0; j < tempstring.length()/2; j++){ 
        oddsum = oddsum + tempstring.substring(j*2,j*2+1); 
      }
    }
    else
    {  
      for (int j = 0; j < tempstring.length()/2+1; j++){ 
        oddsum = oddsum + tempstring.substring(j*2,j*2+1); 
      }
    }
    
    for (int b = 0; b < tempstring.length()/2; b++){
      evensum = evensum + tempstring.substring(b*2+1, b*2+2);
    }
    
    int[] oddar = new int[oddsum.length()];
    int[] evenar = new int[evensum.length()];
    for (int i = 0; i < oddsum.length(); i++) {
      oddar[i] = Integer.valueOf(oddsum.substring(i, i + 1)); //found string parsing stuff online
    }
    for (int i = 0; i < evensum.length(); i++) {
      evenar[i] = Integer.valueOf(evensum.substring(i, i + 1)); //found string parsing stuff online
    }
    int oddcheck = 0;
    int evencheck = 0;
    int totalcheck = 0;
    for (int i = 0; i < oddar.length;i++)
    {
      oddcheck = oddcheck + oddar[i];
    }
    for (int i = 0; i < evenar.length;i++)
    {
      evencheck = evencheck + evenar[i];
    }
    totalcheck = (evencheck * 2) + oddcheck;
    System.out.println(totalcheck);
    if (totalcheck%10 == 0)
    {
      valid = true;
      return "true";
    }
    else 
    {
      valid = false;
      return "false";
    }
    
    
    /*
     * 
     boolean luhn = false
     
     if evensum + oddsum % 10 == 0 
     luhn = true
     
     */
    
    /*
     int number = Integer.parseInt(num); //converts string to an int somehow, looked it up online
     int[] numar;
     for (int i = 0; i<num.length();i++)
     {
     numar[i] = [
     }
     return num;
     */
  }
  int findType(String cats)
  {
    {
      if (valid == false)
      return 0;
      else if (cats.substring(0) == "4")
      return 2;
      else if (cats.substring(0,2) == "51" || cats.substring(0,2) == "52" || cats.substring(0,2) == "53" ||cats.substring(0,2) == "54" ||cats.substring(0,2) == "55")
      return 1;
      else if (cats.substring(0,4)== "6011")
      return 4;
      else if (cats.substring(0,2) == "34" || cats.substring(0,2) == "37")
      return 3;
      else if (cats.substring(0,2) == "36" || cats.substring(0,2) == "38")
      return 5;
      else if (cats.substring(0,3) == "300" || cats.substring(0,3) == "301" || cats.substring(0,3) == "302" 
                 || cats.substring(0,3) == "303" || cats.substring(0,3) == "304" || cats.substring(0,3) == "305")
      return 5;
      else 
      return 0;
    }
    
  }
  
}




/*
 * 
 LUHN CHECK
 right to left
 all the even places, 
 -multiply them by 2 
 --if the product is 2 digits, add the digits together
 --take the sum
 then
 all the odd places,
 -add them together
 then
 add both sums together
 if the sum % 10 == 0, it is a valid number
 */
