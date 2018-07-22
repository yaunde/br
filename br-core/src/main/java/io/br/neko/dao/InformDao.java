package io.br.neko.dao;

import io.br.neko.demain.Inform;

import java.util.List;


public interface InformDao {

	// 根据时间来显示相应的公告
	public List showInformByInTime();

	// 根据公告的ID得到该公告信息
	public Inform getInformById(int infromId);

}
