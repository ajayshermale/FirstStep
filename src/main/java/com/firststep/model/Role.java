package com.firststep.model;
import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Role  implements Serializable {
	@Id
	private int roleId;
	private String rolename;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
