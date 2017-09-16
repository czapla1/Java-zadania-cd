package leetcode;

/*A left rotation operation on an array of size shifts each of the array's elements unit to the left.
 *  For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become[3,4,5,1,2].
 *  

Given an array of n integers and a number,k, perform k-left rotations on the array. Then print the updated array as a single line of space-separated integers.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	

	    public int[] arrayLeftRotation(int[] a, int n, int k) {
	        int licznik=0;
	        
	      while(licznik<k){
	         int pierwszy= a[0];
	          for(int i=0; i<n-1;i++){
	              a[i]=a[i+1];
	          }
	          a[n-1]=pierwszy;
	          licznik++;
	      }
	        return a;
	    }
	    
	    public static void main(String[] args) {
	    	Array ar= new Array();
	    	int[]a={1,2,3,4,5};
	    	System.out.println(Arrays.toString(ar.arrayLeftRotation(a, 5, 4)));
	      
	    
	}
}

