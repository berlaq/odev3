package intro;

public class SayiVarMi {

	static void sayiVarMi() {
		
		int[] sayilar = {1,2,3,4,5,6,7,8,9,10};
		int sayi = 5;
		int check = 0;
		
		
		for (int aranan : sayilar) {
			if (sayi==aranan) {
				System.out.println("Sayı dizi içerisinde vardır!!");
				check = 1;
				break;
			}
		}
		
		if (check == 0) {
			System.out.println("Sayı dizi içerisinde yoktur!");
		}
	}
	
}
