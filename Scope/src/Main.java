
public class Main {

	public static void main(String[] args) {
		String var4 = "thisis private to main()";
		
		ScopeCheck scopeInstance = new ScopeCheck();
		scopeInstance.useInner();
		
		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		System.out.println("var3 is not accessible here"+ innerClass.var3);
//		
//		System.out.println("scopeInstance privateVar is" + scopeInstance.getvar1()); // a variable from ScopeCheck
//		System.out.println(var4);//will print local variable.
//	
//		scopeInstance.timesTwo();
//		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass(); 
//		innerClass.timesTwo();
	}

}
