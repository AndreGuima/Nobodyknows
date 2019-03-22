package com.adpguima.nobodyknows.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Document
public class Usuario {

	@Id
	private String id;
	private String nome;
	@DBRef
	private List<Perfil> perfis;
	private int idade;
	private String email;
	private String password;

	public Usuario() {
	}

	public Usuario(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.perfis = usuario.getPerfis();
		this.password = usuario.getPassword();
	}

	public Usuario(String nome, List<Perfil> perfisUsuario, String email, String password) {
		this.nome = nome;
		this.perfis = perfisUsuario;
		this.email = email;		
		this.password = password;	
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
