package br.com.alura.loja;
import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		System.out.println(calculadora.calcular(primeiro));
		
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		System.out.println(calculadora.calcular(segundo));
	}
}
