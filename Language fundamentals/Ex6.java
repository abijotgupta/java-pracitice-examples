// program on java operators

public class Ex6
{
 public static void main(String[] args)
{
 int x,y;
 x=100;
 y=35;

 System.out.println("Sum is: " +(x+y));
 System.out.println("Sub is: " +(x-y));
 System.out.println("Product is: " +(x*y));
 System.out.println("Divison is: " +(x/y));
 System.out.println("Modulus is: " +(x%y));

 System.out.println("X>Y IS: " +(x>y));
 System.out.println(y>=0 && y<=100);

 System.out.println("y++ is: "+ y++);
 System.out.println("++y is: "+ ++y);

 System.out.println(x&y);
 System.out.println(x|y);
 System.out.println(x>>2);
 System.out.println(x<<4);

}
}