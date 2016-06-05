import Prog1Tools.IOTools; // http://www.grundkurs-java.de/software/Prog1Tools/Prog1Tools.zip

public class PascalsTriangle {

	public static void main(String[] args) {
		int i;
		int j;
		int a;
		a = IOTools.readInt("Please enter, how much rows you need: ");
		int[][] rec = new int[a][];

		// 2. Array
		for (i = 0; i < rec.length; i++) {
			rec[i] = new int[i + 1];
			rec[i][0] = 1; 		// 1.value in a row
			rec[i][i] = 1; 		// 2.value in a row

			// values within a row
			for (j = 1; j < i; j++) {
				rec[i][j] = rec[i - 1][j - 1] + rec[i - 1][j];
			}

		}

		// output, not a real triangle
		System.out.println(rec[0][0] + " ");
		for (i = 1; i < rec.length; i++) {
			System.out.print(rec[i][0] + " ");
			for (j = 1; j < i; j++) {
				System.out.print(rec[i][j] + " ");

			}
			System.out.println(rec[i][i]);
		}

	}

}
