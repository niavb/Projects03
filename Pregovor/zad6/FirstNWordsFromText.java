package zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FirstNWordsFromText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file = new File("src//zad6//text.txt");
		Scanner sc2;
		try {
			sc2 = new Scanner(file);
			System.out.println("Enter n:");
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				System.out.print(sc2.next().toString() + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
