import java.util.Scanner;

public class Library_Fine {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int libFine() {
		
		int ceza = 0;
		
		int teslimEdilenGun = scanner.nextInt();
		int teslimEdilenAy = scanner.nextInt();
		int teslimEdilenYil = scanner.nextInt();
		
		int gorevGunu = scanner.nextInt();
		int gorevAyi = scanner.nextInt();
		int gorevYili = scanner.nextInt();
			
			if (gorevYili < teslimEdilenYil) {
				ceza = 10000;
			}
			else if(gorevYili == teslimEdilenYil){
				if (gorevAyi < teslimEdilenAy) {
					ceza = 500 * (teslimEdilenAy - gorevAyi);
				}
				else if(gorevAyi == teslimEdilenAy){
					if (gorevGunu < teslimEdilenGun) {
						ceza = 15 * (teslimEdilenGun - gorevGunu);
					}
				}
			}
			
		return ceza;
	}
	
	public static void main(String[] args) {
		
		System.out.println(libFine());
	}

}
