package aulaPooReCode;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	
	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ",\n lado2=" + lado2 + ",\n lado3=" + lado3 + ",\n calculo do Perimetro ="
				+ calcPerimetro() 
				+ ",\n calculo da Area =" 
				+ calcArea() + ",\n Tipo do triangulo " 
				+ tipoTriangulo() + ", Triangulo maior " 
				+ maiorTriangulo() + "]";
	
	}


	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double maiorTriangulo() {
		double a1 = 0;
		double a2 = 0;
		double maior = 0;
		
		if(a1 > a2) {
			maior = a1; 
		}else {
			maior = a2;
		}
		return maior;
		
	}
	

	public double calcPerimetro() {
		return (lado1 + lado2 + lado3) / 2;
	}

	public double calcArea() {
		double p = calcPerimetro();
		return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
	}

	public String tipoTriangulo() {
		
		String tipo = " ";
		if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
			tipo = "Escaleno";
		}
		else if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
			tipo = "Equilatero";
		} else {
			tipo = "Isosceles";
		}
		return tipo;
	}


}
