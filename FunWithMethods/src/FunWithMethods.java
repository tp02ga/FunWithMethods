
public class FunWithMethods {

	public static void main(String[] args) {
		// this is a comment, that's why it's green in color
		
		//   start ; end ; itr
		for (int i = 0; i<2; i++)
		{
			sayHello();
		}
		
		
		// way of outputting a value #1
		int result = addTwoInts(20,55);
		System.out.println(result);
		
		// way of outputting a value #2
		System.out.println(addTwoInts(20,55));
		
	}
	
	// [return type] [method name] (a list of arguments / parameters)
	static void sayHello () {
		System.out.println("Hello World");
	}
	
	static int addTwoInts (int x, int y) {
		return x + y;
	}
	
}
