package snippet;

import java.util.Scanner;

public class Snippet {
	static int B, H;
	static boolean flag = true;
	static{
	    Scanner sc = new Scanner(System.in);
	    
	    B = sc.nextInt();
	    H = sc.nextInt();
	    try{
	        if((B < 0 || H < 0) ){
	            flag = false;
	            throw new java.lang.Exception("Breadth and height must be positive");
	        }    
	    }
	    catch (Exception e){
	        System.out.println(e);
	    }
	    sc.close();
	  
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

