package firstJavaAssignment;

public class Latihan3 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 9;
		int d = 9;
		
		System.out.println("Print ke 1");
		System.out.println("A = " + a++);
		System.out.println("B = " + ++b);
		System.out.println("C = " + c--);
		System.out.println("A = " + --d);
		
		System.out.println("Print ke 2");
		System.out.println("A = " + a);
		System.out.println("B = " + ++b);
		System.out.println("C = " + c);
		System.out.println("A = " + --d);
		
		System.out.println("Print ke 3");
		System.out.println("A = " + ++a);
		System.out.println("B = " + ++b);
		System.out.println("C = " + --c);
		System.out.println("A = " + --d);
		
		System.out.println("Print ke 4");
		System.out.println("A = " + ++a);
		System.out.println("B = " + ++b);
		System.out.println("C = " + --c);
		System.out.println("A = " + --d);
	}

}
