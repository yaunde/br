package io.br.neko.dao;

import io.br.neko.demain.SubType;

import java.util.List;

public interface SubTypeDao {
	// 根据大类的ID获取所有小类
	public List<SubType> showAllSubTypeBySuperId(int superId);

	public List<SubType> showAllSubType();

	public String getSubNameById(int subId);
}
