package lab7;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class telephone {

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		ArrayList <Double> list=new ArrayList<Double>();
		System.out.println("enter the bill amount for 12 months");
		
		double a[]=new double[12];
		for(int i=0;i<12;i++)
		{
			a[i]=obj.nextDouble();
			list.add(a[i]);
			
		}
		double t=0;
		for(int j=0;j<12;j++)
		{
			t=t+a[j];
		}
		double aver=t/list.size();
		System.out.println("aver"+aver);
		System.out.println("least"+Collections.min(list));
		System.out.println("maximum "+Collections.max(list));
	}

}
