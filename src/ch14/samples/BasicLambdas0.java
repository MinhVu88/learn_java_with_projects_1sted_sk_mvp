// Figure 14.1
package ch14.samples;

@FunctionalInterface
interface FunctionalInterfaceDemo {
	void demo();

	default void showDefaultMethod0() {
		System.out.println("default method #0 in functional interface");
	}

	default void showDefaultMethod1() {
		System.out.println("default method #1 in functional interface");
	}

	static void showStaticMethod0() {
		System.out.println("static method #0 in functional interface");
	}

	static void showStaticMethod1() {
		System.out.println("static method #1 in functional interface");
	}
}

public class BasicLambdas0 {
	public static void main(String[] args) {
		FunctionalInterfaceDemo lambda0 = () -> {
			System.out.println("lambda0 calling demo, the only abstract method in FunctionalInterfaceDemo");
		};

		lambda0.demo();
		lambda0.showDefaultMethod0();
		FunctionalInterfaceDemo.showStaticMethod0();

		FunctionalInterfaceDemo lambda1 = () -> System.out.println("lambda1 calling demo, the only abstract method in FunctionalInterfaceDemo");
		
		lambda1.demo();
		lambda1.showDefaultMethod1();
		FunctionalInterfaceDemo.showStaticMethod1();
	}
}
