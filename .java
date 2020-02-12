import java.util.*;
import java.lang.*;
import java.io.*;

class Rohan
{
	public static void main (String[] args) {
		//code
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String s=sc.nextLine();
		    s=s.replaceAll(" ","");
		  
		      String a[]=s.split("[a-zA-Z]+");
		      long max=-1;
		      String r="";
		      long l=0;
		   for(int i=0;i<a.length;i++)
		   {
		       String str=a[i];
		       if(str.matches("[0-8]+")==true)
		       {
		            l=Long.parseLong(str);
		           if(l>max)
		          {
		            max=l;
		            r=str;

		          }
		       }
		      
		   }
		   
		   if(max==-1)
		        System.out.println("-1");
		       else
		        System.out.println(r);
		}

		
	}
}
