Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Concept: Arrays

Question:
Given an array of integers nums and a target,
return indices of the two numbers such that they add up to target.

Code (Java):

public class Main {
	public static void main(String[] args) {
	int a[]={2,7,11,15};
	int target=9;
	int i=0,j=0;
	boolean flag=false;
	for(;i<a.length;i++){
	    for(j=i+1;j<a.length;j++){
	        if(a[i]+a[j]==target){
	            flag=true;
	            break;
	        }
	    }
	    break;
	}
	if(flag==true){
	    System.out.println("Output ["+i+","+j+"]");
	}
	else{
	    System.out.println("No such Number exist");
	}
	}
}
