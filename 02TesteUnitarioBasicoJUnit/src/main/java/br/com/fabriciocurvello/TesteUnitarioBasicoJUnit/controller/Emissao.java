package br.com.fabriciocurvello.TesteUnitarioBasicoJUnit.controller;

import br.com.fabriciocurvello.TesteUnitarioBasicoJUnit.model.Contracheque;

public class Emissao {

	public static void main(String[] args) {
		Contracheque contracheque = Contracheque.questionario();
		contracheque.relatorio();

	}

}





