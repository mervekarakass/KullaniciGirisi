package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName , password, sifirlama, newPassword;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici Adi: ");
		userName = input.nextLine();
		
		System.out.print("Sifreniz: ");
		password = input.nextLine();
		
		if ( userName.equals("Merve") && password.equals("bella123")){
			System.out.println("Giris basarili");
		}else {
			System.out.println("Girilen bilgiler yanlis");
			System.out.println("Sifrenizi sifirlamak istermisiniz");
			sifirlama = input.nextLine();
			if (sifirlama.equals("evet")) {
				System.out.println("yeni sifrenizi giriniz");
			}
			newPassword = input.nextLine();
			
			if (newPassword.equals("bella123")) {
				System.out.println("yeni sifre eskisiyle ayni olamaz");
			}else {
				System.out.println("Yeni sifre olusturuldu");
			}
		}

	}

}
