package asrreyclassification11;

public class TestingArray {

	public static void main(String[] args) {
		int temp=0;
		int []a= {6,7,4,3,2,9,0};
		int l=a.length;
		for (int i=0;i<l;i++) {
			for (int j=0;j<l;j++) {
				if( a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
		}
		for (int k=0;k<l;k++) {
System.out.print(a[k]+",");}
System.out.println();
System.out.println("index value");
System.out.print(a[l-1]);
	}
}