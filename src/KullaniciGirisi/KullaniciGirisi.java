package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName , password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici Adi: ");
		userName = input.nextLine();
		
		System.out.print("Sifreniz: ");
		password = input.nextLine();
		
		if ( userName.equals("Merve") && password.equals("bella123")){
			System.out.println("Giris basarili");
		}else {
			System.out.println("Girilen bilgiler eslesmemektedir");
		}

	}

}
