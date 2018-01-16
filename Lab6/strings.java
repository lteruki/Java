package Lab6;

public class strings {
	public static String compare(String s4, String s5){
		 String s1="A";
		 String s2="B";
		 String s3="C";	 
		 String s6="";
		 if (s4.equals(s5)){
		 s6="Ñòðîêè 1 è 2 \""+s1+"\" è \""+s2+"\" ";
		 } else {
		 s6="Ñòðîêè 1 è 3 \""+s1+"\" è \""+s3+"\" ";
		 }
		 return s6;
		 }
		 public static String add(String s1, String s2){
		 System.out.print("\nÐåçóëüòàò ñëîæåíèÿ ñòðîê \""+s1+"\" è"+"\""+s2+"\": ");
		 s1+=" "+s2;
		 return s1;
		 }
		 public static void main(String[] args) {
		 System.out.println(compare("QWER","QWE"));
		 System.out.print(compare("ASD","ASD"));
		 
		 }
}
