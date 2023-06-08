package niteshSoniJAVA;

public class VariablesAndConstantExample {

	

	//type of data type :- (1)static :- it will call by using class Name 
	
    //							(a)local static variable 
	//                          (b)global static variable
	
	//                     (2)non-static :- it will call by object
	
	//                            (a)local non-static variable
	//                            (b)global non-static variable
	
	//non-static data type
	//global
	int a = 10;
	
	//non-static data type
	//local
	
	void display() {
		int a = 10;
		System.out.println(a);
	}

	//static data type
	//global
	static int x = 20;
	
	//static data type
	//local
	
	static void dis() {
		int x = 20;
		
		System.out.println(x);
	}
	
	
	public static void main(String args[]) {
		
		//variable :- It is special identifier, whose value can be changed at compile
		//            time or run time,
		//            it is container, which is used to store value.
		
//		int a = 10;
//		System.out.println(a);
//		
//		a = 20;
//		
//		System.out.println(a);
		
//		float a = 20.3f;
//		System.out.println(a);
//		a = 34.45f;
//		System.out.println(a);

		//========================================
		
		
		
//		VariablesAndConstantExample obj = new VariablesAndConstantExample();
//		
//		System.out.println(obj.a);
//		
//		System.out.println(VariablesAndConstantExample.x);
		
//============================================
		
		//local non-static :-
//		VariablesAndConstantExample obj = new VariablesAndConstantExample();
//		obj.display();
		
		//local static :- 
//		VariablesAndConstantExample.dis();
		
		//==================================================
		
		//HW :- add,sub,multi,div,SI (static and non-static , global and local)
	}
}
