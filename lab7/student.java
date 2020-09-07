package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		std s[]=new std[20];
		ArrayList <std> list3=new ArrayList<>();
		for(int i=0;i<5;i++) 
		{
			s[i]=new std();
			s[i].getdata();
			System.out.println(s[i]);
			
		}
		for(int j=0;j<5;j++)
		{
			list3.add(s[j]);
		}
		System.out.println("info of 30 students");
		System.out.println(list3);
		System.out.println("sorted names");
		Collections.sort(list3,new namesort());
		System.out.println(list3);		

	}

}
class std
{
	String name;
	int roll;
	double cgpa;
	Scanner obj=new Scanner(System.in);
	void getdata()
	{
		System.out.println("enter names");
		name=obj.next();
		System.out.println("enter roll");
		roll=obj.nextInt();
		System.out.println("enter cgpa");
		cgpa=obj.nextDouble();
		
	}
	
	public String toString()
	{
		return ("\n name:"+name+"\t roll:"+roll+"\t cgpa:"+cgpa);
		
	}
	
}
class namesort implements Comparator <std>
{
public int compare(std s,std s1)	
{
	return s.name.compareTo(s1.name);
}
}