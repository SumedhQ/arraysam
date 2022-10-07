package asrreyclassification11;

public class Reversearray {

	public static void main(String[] args) {
		int [] a= {12,34,5,75,4,56,9};
		int l=a.length;
		System.out.println("reverse the array");
		 for (int i=l-1;i>=0;i--) { 
		 System.out.print( a[i]+ " ");
		 }
		System.out.println();
		 System.out.println("forward the array");
		 for (int i=0;i<l;i++) {
		 System.out.print(a[i]+" ");

	}
	}
}
