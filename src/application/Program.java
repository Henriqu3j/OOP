package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.println("How many items to this order? ");
		int N = sc.nextInt();
		for (int i=1; i<N; i++) {
			System.out.println("Enter #1" + i + " item data: ");
		}
		
		sc.close();
	
		
		Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(cli);
		
		sc.close();
	}
}
