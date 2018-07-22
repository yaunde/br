package io.br.neko.dao;

import io.br.neko.demain.UserPager;

import java.util.Map;

public interface AdminUserDao {

	public Map getAllUsers();   //��ʾ�û�
	public boolean deleteUserById(int id);   //ɾ���û�
	public boolean deleteUsers(int[] ids);
	public UserPager getUserPager(int index, int pageSize);
}
