package practice;

public class Pattern {

	public static void main(String[] args) {

		pattern7(5);
	}

	public static void patternOne(int n) {

//			*****
//		    *****
//		    *****
//		    *****
//		    *****
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void patternTwo(int n) {

//			*
//		    **
//		    ***
//		    ****
//		    *****
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {

//		*****
//	    ****
//	    ***
//	    **
//	    *
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {

//		*
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int nn = n - 1;
		for (int i = 0; i < nn; i++) {
			for (int j = 0; j < nn - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {

//	      	 *
//	        **
//	       ***
//	      ****
//	     *****
		for (int i = 0; i < n; i++) {

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("-");
			}
			// stars
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {

//		 *****
//	      ****
//	       ***
//	        **
//	         *
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			// *
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {

//			*
//	       ***
//	      *****
//	     *******
//	    *********

		for (int i = 0; i < n; i++) {
			// first spaces
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			// stars
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			// last spaces
			for (int l = 0; l < n - i - 1; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
