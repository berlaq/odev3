package intro;

public class ArkadasSayilar {

	static void arkadasSayilar() {

		int sayi1 = 220;
		int sayi2 = 284;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0) {
				sum1 = sum1 + i;
			}
		}
		for (int j = 1; j < sayi2; j++) {
			if (sayi2%j==0) {
				sum2 = sum2 + j;
			}
		}
		if (sum2==sayi1 && sum1 == sayi2) {
			System.out.println("Arkadaş Sayıdır!!");
		}else {
			System.out.println("Arkadaş Sayı Değildir!!");
		}


	}
}

