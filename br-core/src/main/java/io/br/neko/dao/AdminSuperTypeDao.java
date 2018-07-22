package io.br.neko.dao;

import io.br.neko.demain.SuperType;

import java.util.List;


public interface AdminSuperTypeDao {

	public boolean addSuperType(SuperType type);
	public List getSuperType();
	public boolean checkSuperTypeIsExist(String superTypeName);
}
