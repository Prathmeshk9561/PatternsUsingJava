public class HollowSquare {
	static void getHollowSquare(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == 1 || j == 1 || i == n || j == n) {
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
		getHollowSquare(4);

	}

}
