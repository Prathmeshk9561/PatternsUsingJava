

public class TensRightAngle {
	static void getTensRightAngle(int n) {
		int a = 10;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(a+" ");
					a+=10;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getTensRightAngle(4);

	}

}
