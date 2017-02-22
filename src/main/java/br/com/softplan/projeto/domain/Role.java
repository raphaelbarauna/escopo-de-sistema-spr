package br.com.softplan.projeto.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class Role {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long codRole;
	 
	@NotNull 
	private String name;
	
	
	@Override
	public String toString() {
		return "Role [codRole=" + codRole + ", name=" + name + "]";
	}
	
	public Long getCodRole() {
		return codRole;
	}
	public void setCodRole(Long codRole) {
		this.codRole = codRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
