package io.br.neko.dao;

import io.br.neko.demain.SubType;

import java.util.List;

public interface AdminSubTypeDao {

	public List getSubTypeBySuperTypeId(int superTypeId);
	public boolean addSubType(SubType type);
	public boolean checkSubTypeIsExist(String subTypeName);
}
