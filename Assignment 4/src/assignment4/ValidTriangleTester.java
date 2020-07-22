package assignment4;

import java.util.Scanner;

public class ValidTriangleTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int side1 = -1;
		int side2 = -1;
		int side3 = -1;
		String kindofTrig = "";
		boolean isaTrig = false;
	
		System.out.println("Valid Triangle Tester");
		
		System.out.print("Please enter Side 1's length: ");
		side1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter Side 2's length: ");
		side2 = Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter Side 3's length: ");
		side3 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("The length of each side of your test shape is: ");
		System.out.println("Side 1: " + side1);
		System.out.println("Side 2: " + side2);
		System.out.println("Side 3: " + side3);

		
		if((side1 + side2 > side3) && (side3 + side2 > side1) && (side3 + side1 > side2)) {
			isaTrig = true;
			if((side1==side2) || (side2==side3) || (side1 == side3)) { //checks if triangle is an isoceles
				kindofTrig = "isoceles";
			}
			if((side1 == side2) && (side2 ==side3)) { //checks if triangle is a equilateral
				kindofTrig = "equilateral";
			}else {
				kindofTrig = "scalene"; // if neither of the conditions do not satisfy, triangle is a scalene triangle
			}
			
		}
		
		if(isaTrig == true) {
			System.out.println("This is a valid triangle!");
			System.out.print("This is a " + kindofTrig + " triangle.");

		}else {
			System.out.print("This is not a valid triangle!");
		}
		
		scanner.close();
	}
}

