package assignmentprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class StringFunShow {

	public static void main(String[] args) {
		String str1="this is fun show";
		String str2="fun tv show"; //o/p= this is tv
	/*	String st1=str1.split("fun show")[0].trim();
		String st2=str2.split(" ")[1].trim();
		System.out.println(st1+" "+st2);*/
		String[] arr1 = str1.split(" ");
		String[] arr2 = str2.split(" ");
		ArrayList<String> list= new ArrayList<String>();
		for(String s:arr1) {
			list.add(s);
		}
		for(String s2:arr2) {
			list.add(s2);
		}
		if(list.contains("fun")||list.contains("show")) {
		System.out.println();
		}
	}

}
