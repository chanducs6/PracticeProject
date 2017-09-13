
  interface AbstractClassConstructor1 {

	void AbstractClas();
}
 
 public class AbstractClassConstructor implements AbstractClassConstructor1
 {
	public static void main(String[] args) {
		
		 AbstractClassConstructor ab = new AbstractClassConstructor();
		 ab.method();	 
	}
	  
	void method() {
		System.out.println("its method one ");
	}
	@Override
	public void AbstractClas() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 }
