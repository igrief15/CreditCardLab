import java.util.Scanner;
//commit to github, provide github url on canvas

public class CreditCard
{
  String verify(String num)
  {
    int a = num.length();
    int[] numar = new int[a];
    for (int i = 0; i < num.length(); i++) {
      numar[i] = Integer.valueOf(num.substring(i, i + 1)); //found string parsing stuff online
    }
    int oddsum = 0;
    int evensum = 0;
    for (int i = 0; i < numar.length;i++)
    {
      oddsum =+ numar[numar.length - (i + i*2)];
    }
    
    System.out.println(oddsum);
    return "cat";
   
    
    
    /*
     for loop, int i  ; i < cats.length ; i++
     oddsum =+ cats[cats.length - (i + i*2)] 
     
     something like that
     
     
     int digits
     for loop
     digits = (cats[cats.length - (i*2)])*2
     if digits > 9 
     input into array again and add the values, digits takes that value
     evensum =+ digits
     else 
     evensum =+ digits
     
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
  {/*
   {
   if (cats.substring(0) == 4)
   return 2;
   else if (cats.substring(0,2) == 51 || cats.substring(0,2) == 52 || cats.substring(0,2) == 53 ||cats.substring(0,2) == 54 ||cats.substring(0,2) == 55)
   return 1;
   else if (cats.substring(0,4)== 6011)
   return 4;
   else if (cats.substring(0,2) == 34 || cats.substring(0,2) == 37)
   return 3;
   else if (cats.substring(0,2) == 36 || cats.substring(0,2) ==38)
   return 5;
   else if (cats.substring(0,3) == 300 || cats.substring(0,3) == 301 || cats.substring(0,3) == 302 
   || cats.substring(0,3) == 303 || cats.substring(0,3) == 304 || cats.substring(0,3) == 305)
   return 5;
   }
   */
    return 420;
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
