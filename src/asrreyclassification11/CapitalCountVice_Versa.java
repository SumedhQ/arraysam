package asrreyclassification11;

public class CapitalCountVice_Versa {

	public static void main(String []args) {
		// TODO Auto-generated method stub
 String s= "JASDJfdfsklfjjJLODD";
 int lowercase=0;
 int uppercase=0;
 for (int i=0;i<s.length();i++) {
	 if (s.charAt(i)>='a' && s.charAt(i)<='z') {
		 lowercase++;}
	 
		 else { uppercase++;
	 }
		 
	 }
 System.out.println("no. of lowercase:"+ lowercase );
 System.out.println("no. of uppercase:"+ uppercase );
 
 }
 
	}


