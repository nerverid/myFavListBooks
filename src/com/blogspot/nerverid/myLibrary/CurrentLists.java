package com.blogspot.nerverid.myLibrary;

import com.blogspot.nerverid.myLibrary.helpers.HelperDownload;

public class CurrentLists {
	
	private HelperDownload helperDown = new HelperDownload();
	
	
	
	// проверяет если в temp временный список или нет
	// По всей видимости проверяет временный файл
	public Boolean isEmpty() {
		
		return true;
	}
	
	//Формирует таблицу подгружает из ресурса
	public String[][] getTableContent() {
		return helperDown.getContent();
	} 
	
	// Подгружает заголовки таблицы из ресурса
	public String[] getTableTitle() {
		return helperDown.getTitle();
	}
}
