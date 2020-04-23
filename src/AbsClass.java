
 public abstract class AbsClass {
	 
	 public AbsClass() {
		System.out.println("Abstract Class Constructor");
	}

	void run() {
		System.out.println("non abstract run method");
	}
	
	abstract void  show();
	
	
	
	public static void eat() {
		System.out.println("non abstract static eat method ");
	}
		
	final void play() {
		System.out.println("non abstract final method");
	}
	// at a time method can not be final and abstract as it contradicts as final can not be overriden and abstract needs to be overriden
}
