package io.br.neko.demain;

import java.io.Serializable;

public class Admin implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(  )
	 */
	private static final long serialVersionUID = 1L;

	private String Name;

	private String Password;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
