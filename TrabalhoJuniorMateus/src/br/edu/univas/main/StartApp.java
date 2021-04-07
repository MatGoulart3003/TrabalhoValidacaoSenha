package br.edu.univas.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import br.edu.univas.vo.View;
import java.util.Random;


public class StartApp {

	private static Scanner scanner = new Scanner(System.in);
	private static View view = new View();

	public static void main(String[] args) {

		String caracteresMinusculos = "abcdefghijklmnopqrstuvywxz";
		String caracteresMaiuculos = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
		String numeros = "0123456789";
		String caracteresEspeciais = "@#$%&*_+^><|";
		String pass = "";
		String valida = "^";
		String password = "";
		boolean isTrue = false;
		
		int choice = 0;

		view.printStart();

		view.printInformeTamanhoMinimo();
		int tamanhoMin = readInt();

		view.printInformeTamanhoMaximo();
		int tamanhoMax = readInt();

		view.printInformeLetraMaiuscula();
		choice = readInt();

		if (choice == 1) {
			pass = caracteresMaiuculos;
			valida = valida + "(?=.*[A-Z])";
		}
		
		
		view.printInformeLetraMinuscula();
		choice = readInt();

		if (choice == 1) {
			pass = pass + caracteresMinusculos;
			valida = valida + "(?=.*[a-z])";
		}

		view.printInformeNumero();
		choice = readInt();

		if (choice == 1) {
			pass = pass + numeros;
			valida = valida + "(?=.*\\d)";
		}

		view.printInformeCaracteresEspeciais();
		choice = readInt();

		if (choice == 1) {
			pass = pass + caracteresEspeciais;
			valida = valida + "(?=.*[@#$%&*_+^><|])";
		}
		
			valida = valida + ".{" + tamanhoMin + "," + tamanhoMax + "}$";
			
		do {
			
			password = createPassword(pass, tamanhoMin, tamanhoMax);
			isTrue = isValidPassword(password,valida);
			
		}while (isTrue == false);
		
		System.out.println("Sua senha é: \n" + password);
		
	}

	public static String createPassword(String pass, int tamanhoMin, int tamanhoMax) {
		char[] ch = new char[pass.length()];
		for (int i = 0; i < pass.length(); i++) {
		ch[i] = pass.charAt(i);

		}
		
		StringBuilder builder = new StringBuilder();
		Random random = new Random();

		int idx = random.nextInt((tamanhoMax - tamanhoMin) + 1) + tamanhoMin;

		for (int i = 0; i < idx; i++) {
			int posicao = (int) (Math.random() * ch.length);
			builder.append(ch[posicao]);

		}
		
		String password = builder.toString();
		return password;
			
	
	}

	public static int readInt() {
		int value = scanner.nextInt();
		scanner.nextLine();

		return value;
	}

	
	public static boolean isValidPassword(String password, String validate)
    {
        Pattern pattern = Pattern.compile(validate);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
