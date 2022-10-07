package asrreyclassification11;

public class CountUpperto_Lower_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String f= "ASDHKSDJK dsfsjcjk kjjfkjvhk";
System.out.println(f.toLowerCase());
String f1=f.toLowerCase();
 char [] x =f1.toCharArray();
 int l=x.length;
 for (int i=0;i<l;i++) {
	 int count=1;
	 for( int j=i+1;j<l;j++) {
		 if (x[i]==x[j] && x[i]!=' ') {
			 count++;
			 x[j]=0;	 
		 }
	 }
	 if (count>1&&x[i]!=0) {
		 System.out.println(x[i]+" : "+count);
	 }
 }
	}

}
