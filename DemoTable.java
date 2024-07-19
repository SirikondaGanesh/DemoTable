//printing a table
package apjfsa;
import java.util.*;
public class DemoTable {
    
	public static void main(String[] args) {
	//instance-variable	
	int a, i;
	//taking number from console
	System.out.println("Enter a number :");
	Scanner s=new Scanner(System.in);
	 a=s.nextInt();
	 //itarate for 10 times
	for(i=1;i<=10;i++)
	//print table	
	System.out.println(a+"*"+i+"="+a*i);
	
	}
	

}
