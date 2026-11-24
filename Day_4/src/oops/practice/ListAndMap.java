package oops.practice;

import java.util.ArrayList;
import java.util.List;

public class ListAndMap {
	public static void main(String[] args) {

	        List<String> testCases = new ArrayList<>();

	        testCases.add("Valid Login");
	        testCases.add("Invalid Login");
	        testCases.add("Empty Username");
	        testCases.add("Empty Password");

	        System.out.println("All Test Cases:");

	        for (String test : testCases) {

	            System.out.println(test);
	        }

	        testCases.remove("Empty Password");

	        System.out.println("After Removing:");

	        System.out.println(testCases);

	        System.out.println("Total: " + testCases.size());
	}
}
	


