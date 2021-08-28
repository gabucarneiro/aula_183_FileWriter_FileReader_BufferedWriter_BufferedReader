package applications;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Initial message:");
		String inc = sc.nextLine();
		System.out.print("Number of lines:");
		int n= sc.nextInt();
		int n1 = n+2;
		String[] line = new String[n1];
		line[0] = inc;
		for(int i=1; i<n1; i++) {
			String inc2 = sc.nextLine();
			line[i] = inc2;
		}
		
		String path = "C:\\Users\\Gabriel\\Desktop\\out.txt";
		sc.close();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String lines: line) {
				bw.write(lines);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Process not concluded. Revise your files.");
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while(linha!= null) {
				System.out.println(linha);
				linha = br.readLine();
			}			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Process not concluded. Revise your files.");
		}
	}
}