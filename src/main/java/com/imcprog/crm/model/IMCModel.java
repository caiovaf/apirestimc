package com.imcprog.crm.model;

import java.text.DecimalFormat;

public class IMCModel {
	private float altura;
	private float peso;
	private float CalculadoraIMC;
	private String resultado;
	
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getCalculadoraIMC() {
		return CalculadoraIMC;
	}
	public void setCalculadoraIMC(float calculadoraIMC) {
		this.CalculadoraIMC = calculadoraIMC;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public IMCModel (float peso, float altura) {
		setPeso(peso);
		setAltura(altura);
	}
	
	public void CalcularIMC() {
		this.CalculadoraIMC = this.getPeso()/(this.getAltura()*this.getAltura());
	}
	
	public String respota() {
		CalcularIMC();
		DecimalFormat df = new DecimalFormat("#.##");
		
		if(CalculadoraIMC < 18.5){
			setResultado("O seu IMC é : " + df.format(CalculadoraIMC) + ". A sua classificação é Abaixo do Peso " + "e seu risco é Elevado");
		}
		else if(CalculadoraIMC >= 18.6 && CalculadoraIMC <= 24.9){
			setResultado("IMC: " + df.format(CalculadoraIMC) + ". A sua classificação é Peso Ideal, " + "e seu risco é Inexistente");
		}
		else if(CalculadoraIMC >= 25 && CalculadoraIMC <= 29.9){
			setResultado("O seu IMC é : " + df.format(CalculadoraIMC) + ". A sua classificação é Acima do Peso, " + "e seu risco é Elevado");
		}
		else if(CalculadoraIMC >= 30 && CalculadoraIMC <= 34.9){
			setResultado("O seu IMC é : " + df.format(CalculadoraIMC) + ". A sua classificação é Obesidade Grau 1, " + "e seu risco é Muito Elevado");
		}
		else if(CalculadoraIMC >= 35 && CalculadoraIMC <= 40){
			setResultado("O seu IMC é : " + df.format(CalculadoraIMC) + ". A sua classificação é Obesidade Grau 2, " + "e seu risco é Muitíssimo Elevado");
		}
		else {
			setResultado("O seu IMC é : " + df.format(CalculadoraIMC) + ". A sua classificação é Obesidade Grau 3, " + "e seu risco é Obesidade Mórbida");
		}
		return resultado;
		
	}
}