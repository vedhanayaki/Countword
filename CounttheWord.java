package player;
import java.util.Scanner;
public class CounttheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String :");
Scanner s=new Scanner(System.in);
int count=1;
String s1=s.nextLine();
for(int i=0;i<s1.length()-1;i++){
	if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')){
		count++;
	}
}
System.out.println("The Count is:"+count);
	}

}
