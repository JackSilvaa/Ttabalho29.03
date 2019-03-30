public class Teste {
	public static void main(String[] args) {
		Calculo calculosalario = new Calculo (40, 150.0, 3);
		System.out.println("Salario Bruto: " +
				calculosalario.calculoSalarioBruto());
		
		
		
		System.out.println("Desconto INSS: " +
				calculosalario.calculoDescontoInss());
		
		
		System.out.println("Imposto de Renda: " +
				calculosalario.calculoImpostoRenda());
		
		
		System.out.println("Salario Líquido: " +
				calculosalario.calculoSalarioLiquido());
	}
}
