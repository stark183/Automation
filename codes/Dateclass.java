package testpackage;
import java.util.Date;
import java.util.Scanner;
import io.ous.jtoml.ParseException;
import java.text.SimpleDateFormat;
public class Dateclass {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        System.out.print("Enter the date");
        String[] d = new String[sc.nextInt()];
        String[] da = new String[d.length];
        sc.nextLine();
        for(int i = 0; i<d.length; i++) {
        	d[i] = sc.nextLine();
        	da[i] = sc.nextLine();
        }
        for(int i = 0; i<d.length; i++) {
        	try {
        		 Date jdate = dateformat.parse(da[i]);
        		 Date cdate = dateformat.parse("20-02-2021");
				 System.out.println("The date is valid"+da[i]);
				 if(jdate.compareTo(cdate) < 0) {
					 System.out.println("Eligible");
				 }
				 else if(jdate.compareTo(cdate) > 0) {
					 System.out.println("Not Eligible");
				 }
				 else if(jdate.compareTo(cdate) == 0) {
					 System.out.println("Eligible");
				 }
        	}
        	catch(ParseException | java.text.ParseException e) {
        		System.out.println("The date is not valid"+da[i]); 
        	}
        }
        for(String str:da) {
         System.out.print(str+"\n"); 
        }
	}
}
