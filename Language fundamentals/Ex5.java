// Example on binary class


public class Ex5
{
  public static void main(String[] args)
{
  int a=123;                                    //decimal number
  int b=0b1011;                                 //binary number
  int c=00126;                                  //octal number
  int d=0x14ab;                                 //hexadecimal no

//ALL OUTPUTS ARE IN DEFAULT DECIMAL NUMBER SYSTEM

  System.out.println("Value of A  :"+a); 
  System.out.println("Value of B  :"+b); 
  System.out.println("Value of C  :"+c); 
  System.out.println("Value of D  :"+d); 

//OUTPUT IN GIVEN NUMBER SYSTEM

  System.out.println(a);
  System.out.println(Integer.toBinaryString(b));
  System.out.println(Integer.toOctalString(c));
  System.out.println(Integer.toHexString(d));
}

}  