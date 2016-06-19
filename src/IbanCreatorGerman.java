import Prog1Tools.IOTools; // http://www.grundkurs-java.de/software/Prog1Tools/Prog1Tools.zip

public class IbanCreatorGerman {

	/*
	 * creating validation number
	 */
	public static long validation(long blz, long ktn) {
		long var = blz % 97;
		var = var * 10000000000L;
		var += ktn;
		var = var % 97;
		var = var * 1000000;
		var += 1314 * 100;			//13 14 for germany DE (9+4/D; 9+5/E)
		var = var % 97;
		long check = 98 - var;
		return check;
	}

	public static void main(String[] args) {
		long blz;
		long check;
		long ktn;
		
		blz = IOTools.readLong("Please enter your BLZ: ");
		ktn = IOTools.readLong("Please enter your KTN: ");

		System.out.println("Your BLZ: " + blz + " and KTN: " + ktn);

		check = validation(blz, ktn);
		
		System.out.printf("Digital: DE%02d%08d%010d%n", check, blz, ktn);
		System.out.printf("Analog: DE%02d %04d %04d %04d %04d %02d%n", check, blz/10000, blz%10000, ktn/1000000, (ktn/100)%1000, ktn%100);
					
	}	

}
