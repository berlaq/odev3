package intro;
import java.util.Collection;

public class KalinSesliHarf {
	
	static void kalinSesli() {
		
		char[] harfler = {'A','I','O','U'};
		
		char harf = 'e';
		int i = 0;
		
		for(char arananHarf : harfler) {
			if (arananHarf == harf) {
				System.out.println("Kalın Sesli Harftir");
				i = 1;
			}
			
		}
		
		if (i== 0) {
			System.out.println("Kalın sesli harf değildir");
		}
		
	}
	
}
