package loops;

import java.util.Scanner;

import com.sun.jdi.Value;

public class Patterns {

	public static void main(String[] args) {
	
		Scanner sc   = new Scanner(System.in);
		System.out.println("Enter the terms ");
		int n = sc.nextInt();
		
//	---------------PATTERN 1------------------
//		for(int i = 0; i < n; i++) {
//			for(int j = 1;  j < n; j++)
//				System.out.print("* ");
//					System.out.println("* ");}
		
//----------------PATTERN 2-------------------
		
//		for(int j = 1; j <= n; j++) {
//			for(int i = 1; i <= j; i++) {
//				System.out.print("* ");}
//					System.out.println();}
		
//-----------------PATTERN 3-------------------
				
//	for(int j = 1; j <= n; j++) {	
//		for(int i = 0; i <= n-j ; i++) {
//			System.out.print("* ");}
//				System.out.println();}
		
//-----------------PATTERN 4-------------------
		
//		for(int i = 0; i < n; i++) {
//		  for(int j = 0; j < i; j++) 
//			System.out.print("  ");
//			 for(int k = 0; k < n-i; k++){
//				System.out.print("* ");}
//					System.out.println();}
//		
//-------------------PATTERN 5------------------	
		
//		for (int i = 0; i < n; i++) {
//			for(int j = 0; j < n-i; j++) 
//				System.out.print("  ");
//					for(int k = 0; k <= i; k++) 
//				System.out.print("* ");
//			System.out.println();}
		
//--------------------PATTERN 6------------------
		
//	for(int i = 0; i <= n; i++) {	
//	  for(int k = 1; k <= i; k++)
//		System.out.print(" * ");
//		  System.out.println();
//	   for(int j = 1; j <= n-i; j++)  
//	System.out.print("  ");}
	
//	------------------PATTERN 7-------------------
	
//	 	 int x = 1;
//			for(int i = 0; i <= n; i++) {
//				for(int k = 1; k <= i; k++)
//					System.out.print(" " + x++ + " ");
//		 		System.out.println();
//	        for(int j = 0; j <= n-i; j++) 
//		System.out.print(" ");}
		
//  --------------------PATTERN 8--------------------	
	
	
//	  for(int i = 1; i <= n; i++) {
//		  System.out.println();
//		     for(int j = 1; j <= i; j++)
//			     System.out.print("* ");}
//	  		 for(int i = 0; i < n; i++) {
//		  System.out.println();
//	  for(int j = 1; j < n-i; j++ )
//		  System.out.print("* ");}
	  
//  --------------------PATTERN 9--------------------
 
//	    	System.out.println("*");
//		for (int i = 2; i < n; i++){
//			System.out.print("*");
//				for(int j = 1; j < i ; j++)     
////					                         **WORKING BUT NOT PERFECTLY**
//					System.out.print("  ");
//				System.out.println("* ");}
//			for(int j = 1; j <= n; j++) {
//		System.out.print("* ");}
//___________________________________________________
//		
//  		System.out.println("*");
//	if(n > 1) {	
//			for(int i = 2; i <= n-1; i++) {
//				System.out.print("* ");	
//					for(int j = 1; j <= i-2; j++) {
//						System.out.print("  ");}
//					System.out.print("*");
//				System.out.println();}
//			for(int i = 0; i < n; i++) 
//		System.out.print("* ");}
//		
//  -------------------PATTERN 10--------------------

//		for(int i = 0; i <= n; i++) {
//			for(int j = 0; j <= i-1; j++) {
//				System.out.print("  ");}	
//					for(int j = 1; j <= n-i; j++)
//				System.out.print("* ");
//			System.out.println();}
		
//  --------------------PATTERN 11--------------------

//		for(int i = 0; i <= n; i++) {
//			for(int j = 0; j <= 4*i; j++) {
//				System.out.print(" ");}
//					for(int j = 1; j < (n-i+1); j++) {
//				System.out.print("* ");}
//			System.out.println();}
		
//  --------------------PATTERN 12--------------------
		
//	int rows = 2*n-1;
//		for(int i = 0; i <= rows; i++) {
//	if(i < n) {
//			for(int j = 1; j < n-i; j++) {
//				System.out.print("  ");}
//					for(int k = 0; k <= i; k++) {
//						System.out.print("* ");}
//							System.out.println();}
//  else {		
//							for(int k = 0; k <= i- n; k++) {
//						System.out.print("  ");}
//					for(int j = 1; j <= rows-i; j++) {
//				System.out.print("* ");}
//			System.out.println();}
//		}
		
//  --------------------PATTERN 13--------------------
			
//	int rows = 2*n+1;
//	
//		for(int i = 0; i <= rows; i++)
//		{
//			if(i < n) {
//				for(int j = 1; j <= n-i; j++) {
//					System.out.print("* ");}
//						for(int k = 0; k <= 2*i+1; k++) {
//							System.out.print("  ");}
//								for(int j = 1; j <= n-i; j++)
//									System.out.print(" *");
//										System.out.println();}
//			else { 
//										for(int j = 1; j <= i-n-1; j++){
//									System.out.print("* ");}
//								for (int k = 2; k <= rows - 2*(i-5); k++) {
//							System.out.print("  ");}
//						for(int j = 1; j <= i-n-1; j++) {
//					System.out.print(" *");}
//				System.out.println();}
//			} 
//	
////		ONLY WORKED FOR 3 :/
////		WILL CHECK
		
//  --------------------PATTERN 14--------------------

//		for(int i = 0; i <= n; i++) {
//			for(int j = 0; j <= n-i; j++) {
//				System.out.print("  ");}
//					for(int j = 1; j <= 2*i-1; j++) {
//						System.out.print(j +" ");}
//							System.out.println();}
//		
//  --------------------PATTERN 15--------------------
		
//		for(int i = 0; i <= n; i++) {
//			System.out.print("  ");}
//				System.out.print("1");
//					System.out.println();
//						for(int i = 1; i < n; i++) {
//							for (int j = 0; j <= n-i; j++) {
//								System.out.print("  ");	}
//							System.out.print(i+1 + " ");
//						for(int j = 1; j <= 2*i-1; j++) {
//					System.out.print("0 ");}
//				int x = 1;
//			for(int k = 1; k <= x; k++) {
//		System.out.print(i+1);}
//	System.out.println();}
		    
//  --------------------PATTERN 16--------------------
		
//		for(int i = 0; i <= n; i++) {
//			for(int j = 0; j <= n-i; j++) {
//			System.out.print("  ");}
//			for(int j = n; j >= i; j--) {
//				
//				System.out.print(j);
//			}
//			
//		System.out.println();}
//			
//			
//		
//		
//		
//		
//	}
//	
//}				
//	
	
	
//-----------------------------------------
//	for(int i = 0; i <= 3; i++) {
//		System.out.print("* ");}
//		for(int j = 0; j <= 4; j++) {
//			System.out.println("* ");}
//	for(int i = 0; i <= 4; i++) {
//		System.out.print("* ");}
//}}

//		-----------------------------------
		
//		for (int i = 0; i < 5; i++)
//		{
//		    for (int j = 0; j < 5 - i; j++)
//		        System.out.print(" ");
//		    for (int j = 0; j <= i; j++)
//		    {
//		        System.out.print("* ");
//		    }
//		    System.out.println(" ");
//		}
//
//		for (int i = 0; i <= 4; i++)
//		{
//		    System.out.println("    | |");}
//		}
//		}

//		------------------------------------------
		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("% ");}
//		System.out.println();
//		for(int i = 0; i < 4; i++) {
//			System.out.print("# ");}
//		System.out.println();
//		for(int i = 0; i < 3; i++) {
//			System.out.print("% ");}
//		System.out.println();
//		for(int i = 0; i < 2; i++) {
//			System.out.print("# ");}
//		System.out.println();
//			System.out.print("% ");
		
	
//	for(int i = 0; i <= n; i++) {
//		for(int j = 0; j <= n-i; j++) {
//			System.out.print("* ");}
//				System.out.println();
//			} 
//		
//		for(int i = 0; i <= n; i++) {
//			for(int j = 1; j < ; j++) {
//				System.out.print(" ");
//			}			
//			System.out.println();
//			for(int j = 0; j <= n-i; j++) {
//				System.out.print("* ");
//			}
//		}
		
//		for(int i= 1; i <= n; i++) {
//			for(int j = 1; j <= n; j++) {
//				System.out.print("* ");}
//				System.out.println();
//			}
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 2; j <= i; j++) {
//				System.out.print("  ");
//			}
//			for(int j = 1; j <= n+1-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i <= n; i++) {
//		for(int j = 1; j <= 2*(n-i); j++) {
//			System.out.print(" ");
//		}
//		for(int j = 1; j <= i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//		}
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("  ");}
//			for(int j = 1; j <= i; j++) {
//			System.out.print(" * ");
//			System.out.print(" ");
//		}System.out.println();
//		}
//		int a = 1;
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("  ");}
//			for(int j = 1; j <= i; j++) {
//			System.out.print(" "+a++ + " ");
//			System.out.print(" ");
//		}System.out.println();
//		}
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//			System.out.print("* ");}
//			System.out.println();
//		}
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n-i; j++) {
//			System.out.print("* ");}
//			System.out.println();
//		}
		
//		if(n == 1)
//			System.out.println("*");
//		else {
//		System.out.println("*");
//			for(int i = 2; i <= n-1; i++) {
//				System.out.print("*");
//				for(int j = 1; j<= i-2; j++) {
//					System.out.print("  ");}
//				System.out.print(" *");
//				System.out.println();}
//			for(int i = 1; i <= n; i++) {
//			System.out.print("* ");
//				}
//			}
		
//		for(int i = 0; i <= n; i++) {
//			for(int j = 1; j <= 4*i; j++) {
//				System.out.print(" ");}
//			for(int j = 0; j <= n-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i <= n; i++) {
//			for(int j = 0; j <=n-i; j++) {
//				System.out.print("  ");
//				}
//			for(int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i = 1; i <= n; i++) {
//				for(int k = 1; k <= i+1; k++) {
//				System.out.print("  ");
//			}
//			for(int j = 1; j <= n-i;j++) {
//				System.out.print("* ");
//				}System.out.println();
//		}
//		
//		
		
//		for(int i = 0; i <= n; i++) {
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("* ");
//			}
//			for(int s = 0; s <= 2*i+1; s++) {
//				System.out.print("  ");
//			}
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("* ");
//			}
//		
//			System.out.println();
//			}
//		for(int i = 0; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			for(int s = 0; s <= 2*(n-i)+1; s++) {
//				System.out.print("  ");
//				}
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		for(int i = 0; i <= n; i ++) {
//			for(int j = 0; j <= 2*n-i; j++) {
//				System.out.print("  ");}
//			
//				for(int c = 1; c <= 2*i-1; c++) {
//			System.out.print(c + " ");}
//				System.out.println();
//				}
//		
		
		
//		for(int i = 1; i <= n; i ++) {
//			for(int j = 0; j <= 2*n-i; j++) {
//				System.out.print("  ");}
////			for(int j = 1; j <= 1; j++) {
////				System.out.print(i+" " );
////			}
//			for(int c = 1; c <= 2*i-3; c++) {
//			System.out.print(0 + " ");}
////			for(int j = 0; j < 1; j++) {
////				System.out.print(i);
////			}
//				System.out.println();
//				}
		
			}
	}