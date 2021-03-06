package com.stone.shop.admin.service.manage.role;

import java.util.List;

import com.stone.shop.admin.exception.ServiceException;
import com.stone.shop.domain.manage.role.MenuEntity;
import com.stone.shop.domain.model.role.MenuRoleModel;
import com.stone.shop.domain.persistent.ResultList;

public interface IMenuRoleService {

	public static final String SERVICE_NAME = "com/jscn/pay/service/manage/role/IMenuRoleService";

	public ResultList<MenuEntity> queryUserMenus(String operatorId,
			String parentCode) throws ServiceException;

	public ResultList<MenuRoleModel> queryCheckMenus(String roleId,
			String parentCode) throws ServiceException;

	public void addMenuToRole(String roleCode, String[] menuIds)
			throws ServiceException;

	public List<MenuEntity> queryMenuRoles(String roleCode) throws ServiceException;

}
