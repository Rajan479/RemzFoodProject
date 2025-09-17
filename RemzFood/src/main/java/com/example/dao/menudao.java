package com.example.dao;

import java.util.List;

import com.example.model.menu;

public interface menudao {
	void addMenu(menu m);
	menu getMenu(int menuId);
	void updateMenu(menu u);
	void deleteMenu(int menuId);
	List<menu> getAllMenu();
}
