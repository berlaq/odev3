package intro;
import java.util.ArrayList;


public class MukemmelSayilar {
	
	static void mukemmelSayi() {
		
		int sayi = 6;
		int sum =0;
	
		for (int i=1; i< sayi; i++) {
			
			if (sayi%i==0) {
				sum=sum+i;
			}
			
		}
		
		if (sum==sayi) {
			System.out.println(sayi +" sayısı mükemmel sayıdır");
		}else {
			System.out.println(sayi +" sayısı mükemmel sayı değildir");
		}
		
	}
	
}
