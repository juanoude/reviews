package br.com.alura.javaIeII;

public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("inicio man");
		try {
			m1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pobr�ma");
		}
		
		System.out.println("fim main");
	}


	private static void m1() {
		System.out.println("inicio m1");
		m2();
		System.out.println("fim m1");
	}

	private static void m2() {
		System.out.println("inicio m2");

		int[] nums = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		System.out.println("fim m2");
	}
}

//similar a effect bubble a bolha sobe at� a superficie e estoura, parando qualquer execu��o posterior
//a camada em que a exce��o for tratada, ser� a que a execu��o prosseguir�
