package Clases;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;

public class Lector {
	public Lector() {
	}

	public void leerTxT(String file) {
		try {
			File myObj = new File(file);
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
