package br.com.softplan.projeto.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "tb_usuario")
public class User {
	
	@Id
	@Column(name = "codUser")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer codUser;
	
	@NotNull
	@Column(name = "username")
	private String username;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@Transient
	private String confirmPassword;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Role.class)
    @JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "USER_CODUSER") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_CODROLE") })
    private Set<Role> roles;
	

	
		
	@Override
	public String toString() {
		return "User [codUser=" + codUser + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", telefone=" + telefone + ", birthday=" + birthday
				+ ", roles=" + roles + "]";
	}

	public Integer getCodUser() {
		return codUser;
	}

	public void setCodUser(Integer codUser) {
		this.codUser = codUser;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Set<Role> getRoles(){
		return roles;
	}
	public void setRoles(Set<Role> roles){
		this.roles = roles;
	}
	
}