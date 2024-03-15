package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) throws IOException {
		File f1=new File("user.txt");
		Scanner sc1= new Scanner(f1);
		String s1="";
		String s2="";
		String[] arr1=new String[4];
		String msg1=" Dear ";
		String msg2=" You have been alloted ";
		String msg3=" Your bus will arrive at ";
		String msg4=" near ";
		for(int i=0;i<8;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			s2=msg1+arr1[0]+msg2+arr1[1]+msg3+arr1[2]+msg4+arr1[3];
			System.out.println(s2);
		}				      
	}

}
