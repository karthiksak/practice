package com.twelveDec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//1. paranheat to Celsius 
		float	 temperatue=100;
	
		 temperatue = ((temperatue - 32)*5)/9;
		 System.out.println("Temperatue in Celsius = " + temperatue);
		 
		 
		 //2. swap 2 nums without 3rd variable
		 int x= 10;
		 int y=30;
		 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println(x +" "+y);
		 
		 //3.find largest number in a list of integers
		 
		 int[] intList = {3,4,5,6,7,8,9,23,32,11};
		 int largeNum=0;
		 for (int i : intList) {
			if(i>largeNum)
			{
				largeNum=i;
			}
		}

		 System.out.println(largeNum);
		 
		 
		 //4.sort list of integers
		 
		 List<Integer> listInt = Arrays.asList(4,2,3,5,7,8,1);
		 listInt.sort(null);
		 System.out.println(listInt);
		 
		 
		 //5.sort list of integers without sort keyword
		 
		 List<Integer> intlist=Arrays.asList(2,1,7,5,6,3,4,89);
		 List<Integer> sortedInt=new ArrayList<Integer>();
		 int t=0;
		for (int i = 0; i < intList.length; i++) {
			int j = intList[i];
			for (int j2 = 0; j2 < intList.length; j2++) {
				int i2 = intList[j2];
				if(j<i2)
				{
					sortedInt.add(j);
					break;
				}/*
				 * else sortedInt.add(i2);
				 */
			}
			
		}
		
		System.out.println(sortedInt);
		
		//6.sort String 
		
		List<String> stringList = Arrays.asList("asd","fsf","fsrwr");
		stringList.sort(null);
		System.out.println(stringList);
	}

}
