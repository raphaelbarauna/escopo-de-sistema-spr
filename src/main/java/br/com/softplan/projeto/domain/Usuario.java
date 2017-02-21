package br.com.softplan.projeto.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.*;


@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@Column(name = "codUsuario")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer codUsuario;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "aniversario")
	private Date aniversario;

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", telefone=" + telefone + ", aniversario=" + aniversario + "]";
	}

	public Integer getCodUsuario() {
		return codUsuario;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	
	

	
}