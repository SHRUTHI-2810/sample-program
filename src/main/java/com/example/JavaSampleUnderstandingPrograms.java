
public class JavaSampleUnderstandingPrograms {

	public static void main(String[] args) {
         //datatypes and variable 


	      int num=5;
	      String name="Shruthi";
	      char ch='k';
	      double f = 50.7;
	      boolean bnum = true;
	      
	      System.out.println(num +"this is my number");
	      
	      //Array 2 way 1::are formed by index
	      int[] arr=new int[5];
	      arr[0]=1;
	      
	     //2:
	      int[] arr1= {1,2,2,2,3,4,5,};
	      System.out.println(arr1[4]);
	      
	      //for loop
	      
	      for(int i=0;i<arr1.length; i++) {
	    	  System.out.println(arr1[i]);
	      }
	      
	      //enhanced for loop:
	      String[] names= {"shruthi", "Boopathi", "family"};
	      		for(String s: names) {
	      			System.out.println(s);
	      		}
	      		
	    	  
	      
	      
	      
	      
	      
	      
	}

}
