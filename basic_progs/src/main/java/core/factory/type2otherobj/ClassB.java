package core.factory.type2otherobj;

public class ClassB {
	ClassB(){
		System.out.println("init of Class B ");
	}
	public static ClassA printB() {
		return new ClassA();
	}
}
