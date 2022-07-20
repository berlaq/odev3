package intro;

public class AsalSayı {
	public static void asalSayı() {
		for (int i=1; i<1000;i++) {
			
			int x = 1;
			int deger = 0;
			
			while (x<= i) {
				if (i%x==0) {
					deger++;
				}
				x++;
			}
			
			if (deger ==2) {
				System.out.println(i);
			}
		}
}
}