package com.example.demo.model;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");

	//Attributes
	private int cod;
	private String nome;
	
	//Constructor
	TipoCliente(Integer id, String nome){
		this.cod = id;
		this.nome = nome;
	}
	
	//Getters
	public int getCod() {
		return cod;
	}
	public String getNome() {
		return nome;
	}
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoCliente nomeEnum : TipoCliente.values()) {
			if (cod.equals(nomeEnum.getCod())) {
				return nomeEnum;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);	
	}
	
	
}
