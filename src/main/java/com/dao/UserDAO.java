package com.dao;

import com.firststep.model.UserDetail;

public interface UserDAO {

	public void saveOrupdate(UserDetail userdetail);
	public void createAdmin(UserDetail userdetail);
	public void createSupplier(UserDetail userDetail);
}
