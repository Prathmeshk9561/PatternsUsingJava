public class RightAngle {
	static void getRightAngle(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
					System.out.print("* ");				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRightAngle(4);
	}
}
