public class SolidRhombus {
	static void getSolidRhombus(int n) {
		System.out.println("Solid Rhombus - ");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void getHollowRhombus(int n) {
		System.out.println("Hollow Rhombus - ");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				if(i ==1 || j == 1 || i == n || j == n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSolidRhombus(5);
		getHollowRhombus(5);
	}
}