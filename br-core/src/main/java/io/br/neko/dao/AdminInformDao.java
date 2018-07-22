package io.br.neko.dao;

import io.br.neko.demain.Inform;
import io.br.neko.demain.InformPager;

import java.util.List;

public interface AdminInformDao {

	public boolean addInform(Inform inform);

	public List getAllInform();

	public boolean deleteInform(int[] ids);

	public Inform getOneInform(int id);

	public InformPager getInformPager(int index, int pageSize);
}
