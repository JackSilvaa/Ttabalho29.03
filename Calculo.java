public class Calculo { 

	 private int 	horas;
	 private double salhora;
	 private int 	dep;
	 private double salariobruto;
	 private double inss;
	 private double go;
	 public Calculo(int horas, double salhora, int dep) {
			this.horas = horas;
			this.salhora = salhora;
			this.dep = dep;
		}
	
		 
	public double calculoSalarioBruto() {
		return salariobruto = horas * salhora + (50 * dep);
	}
	public double calculoDescontoInss() {
		if(salariobruto > 1000 ) {
			return inss = salariobruto * 9/100;
		}
		else {
			return inss = salariobruto * 8.5/100;
		}
	}
	public double calculoImpostoRenda() {
		if(salariobruto <= 500 ) { 
			return go = 0;
		}
		else if(salariobruto > 1000) {
			return go = salariobruto * 7/100;
		}
		
		else {
			return go = salariobruto * 5/100;
		}
	}
	public double calculoSalarioLiquido() {
		return salariobruto - inss - go;
	}
}


