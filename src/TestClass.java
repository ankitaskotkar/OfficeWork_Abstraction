
public class TestClass extends AbsClass {
	public static void main(String[] args) {
		
		AbsClass obj= new TestClass();
		obj.run();
		obj.show();
		eat();
		obj.play();
	}

	@Override
	public	void show() {
		System.out.println("In child abstract Show overriden");	
	}
	
	/*These methods can not be overriden as it is final and static
	void eat() {
		
	}
	void play() {
		
	}*/

}
