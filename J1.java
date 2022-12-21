package jjjjjj1;
import java.util.Scanner;

public class jjj01 {

	public static void main(String[] args) {
		outsideloop:for(int j=1 ;j<=3;j++) { 
		insideloop:for(int i=1;i<=3;i++) {

		System.out.print("密碼輸入測試\n"+"請輸入密碼:");
		Scanner wrt = new Scanner(System.in);
		int setpass1=wrt.nextInt();

		System.out.print("請再輸入一次密碼:");
		Scanner wrti = new Scanner(System.in);
		int setpass2=wrti.nextInt();


		if (i==3) {
		System.out.println("EROR");
		break outsideloop;
		}

		if ( setpass1 < 0 || setpass1 > 9999 ){
		System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
		}
		if ( setpass2 < 0 || setpass2 > 9999 ){
		System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
		}


		else if (setpass1==setpass2){
		System.out.print("密碼正確");
		break outsideloop;
		} 
		else if (setpass1 !=setpass2){
		System.out.print("與第一次輸入的不同\n");


		if (j==3) {
		System.out.println("EROR");
		break outsideloop;
		}
		}
		}
		}

		}

	}


