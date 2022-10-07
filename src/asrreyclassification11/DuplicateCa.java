package asrreyclassification11;

public class DuplicateCa {
	public static void main(String[]args) {

		String d="asdghkaj sfskjfkljl dfbsfjkdh";
		char [] m=d.toCharArray();
		int l=m.length;
		for (int i=0;i<l;i++) {
			//System.out.println(m[i]);
			int count=1;
			for (int j=i+1;j<l;j++) {//j[1]!=i[0]
				if (m[i]==m[j]&&m[i]!=' ') {
				count++;
				m[j]=0;
			}
		}
		if(count>1 && m[i]!=0) {
		System.out.println(m[i]+":"+ count);
	
	}	
		}
}
}