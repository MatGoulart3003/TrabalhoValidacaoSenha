package br.edu.univas.vo;

public class View {

	public void printStart() {
		System.out.println("Gerador de senha\n");

	}

	public void printInformeTamanhoMinimo() {
		System.out.println("Informe o tamanho mínimo de caracteres que deseja para a senha: ");

	}

	public void printInformeTamanhoMaximo() {
		System.out.println("Informe o tamanho máximo de caracteres que deseja para a senha: ");

	}

	public void printInformeLetraMaiuscula() {
		System.out.println("Informe se a senha terá letras maiúsculas: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void printInformeLetraMinuscula() {
		System.out.println("Informe se a senha terá letras minúscula: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void printInformeNumero() {
		System.out.println("Informe se a senha terá números: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void printInformeCaracteresEspeciais() {
		System.out.println("Informe se a senha terá caracteres especiais: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}
}