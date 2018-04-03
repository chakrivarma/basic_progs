package progs.basic;

public class ReverseStringRecursion {
	public static void main(String args[]) {
		String str="hello world",revStr="";
		for(int i=str.length();i>0;i--) {
			revStr+=str.charAt(i-1);
		}
		System.out.println("Reverse Without recursion");
		System.out.println(revStr);
		revStr="";
		revStr=ReverseStringRecursion.reverse(str,str.length(),revStr);
		System.out.println("Reverse With recursion-1");
		System.out.println(revStr);
		revStr="";
		revStr=ReverseStringRecursion.reverse1(str,str.length());
		System.out.println("Reverse With recursion with out third variable");
		System.out.println(revStr);
		
	}
	public static String reverse(String str,int len,String revStr) {
		if(len==0) {
			return revStr;
		}else {
			revStr+=str.charAt(len-1);
			return reverse(str,len-1,revStr);
		}
	}
	
	public static String reverse1(String str,int len) {
		if(len==0) {
			return str.substring(str.length()/2,str.length());
		}else {
			str+=str.charAt(len-1);
			return reverse1(str,len-1);
		}
	}
}
