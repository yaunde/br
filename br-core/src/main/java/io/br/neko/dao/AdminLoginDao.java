package io.br.neko.dao;

import io.br.neko.demain.Admin;

public interface AdminLoginDao {

	public boolean login(Admin admin);

	public boolean updatePassword(Admin admin);
}
