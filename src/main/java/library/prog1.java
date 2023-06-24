package library;

import java.util.Arrays;



public class prog1 {
	
		public static void main(String[] args) {
			prog1 v = new prog1();
			v.m1();
			v.m2();
		}
		
		
		
		public void m1() {
			
			int a[] = {1,2,3,4,5,6};
			int b[] = {1,2,3,4,5,6};
			
			if(a.equals(b)) {
			System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
		}
		
		public void m2() {
			
			
			int a[] = {1,2,3,4,5,6,7};
			int b[] = {1,2,3,4,5,4,7};
			
			boolean val = Arrays.equals(a, b);
			if (val==true) {
				
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			
			
			
		}

	}



