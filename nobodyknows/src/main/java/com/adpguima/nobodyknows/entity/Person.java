package com.adpguima.nobodyknows.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author André Guimarães
 *
 */
@Document
public class Person {

	@Id
	private String id;
	private String nome;
	private String email;
	private String telefone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

}
