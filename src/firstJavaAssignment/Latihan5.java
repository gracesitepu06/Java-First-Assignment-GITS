package firstJavaAssignment;

public class Latihan5 {
	public static void main(String[] args) {
		int y1 = 5, y2 = 4;
		
//		A
		int X1 = (y1 + y2) * (y1+y2);
		int X2 = (y1 % 4) * y2;
		
//		B
		int decX2 = ++X2;
		
		boolean nilai1 = X1 >= X2;
		boolean nilai2 = X2 >= X1;
		boolean nilai3 = (X1 % 4) == (++decX2 % 5);
		
		System.out.println("Nilai dari X1 >= X2 adalah " + nilai1);
		System.out.println("Nilai dari X2 >= X1 adalah " + nilai2);
		System.out.println("Nilai dari (X1 % 4) == (decX2 % 5) adalah " + nilai3);
	}
}
