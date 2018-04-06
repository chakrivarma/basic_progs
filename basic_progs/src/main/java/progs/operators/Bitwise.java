package progs.operators;

public class Bitwise {
	/**
	 * 
	 */
	static int a=1001,b=43,c=1,d=6__4;
	int x,y,z=10;
	public Bitwise(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public static void main(String args[]) {		
		System.out.println("(a&b)="+(a&b)+",(a&~b)="+(a&~b)+",(a|b)="+(a|b)+",(a^b)="+(a^b)+",(c<<3)="+(c<<3)+",(d>>2)="+(d>>3));
	}
	public int getAndOperation(int a,int b) {
		return a&b;
	}
	public int getOrOperation(int a,int b) {
		return a|b;
	}
	public int getAndNotOperation(int a,int b) {
		return a&~b;
	}
	public int getExOrOperation(int a,int b) {
		return a^b;
	}
	public int getRShiftOperation(int a) {
		return a>>2;
	}
	public int getLShiftOperation(int a) {
		return a<<2;
	}
	
}
