package com.blogspot.nerverid.myLibrary;

import com.blogspot.nerverid.myLibrary.helpers.HelperDownload;

public class CurrentLists {
	
	private HelperDownload helperDown = new HelperDownload();
	
	
	
	// ��������� ���� � temp ��������� ������ ��� ���
	// �� ���� ��������� ��������� ��������� ����
	public Boolean isEmpty() {
		
		return true;
	}
	
	//��������� ������� ���������� �� �������
	public String[][] getTableContent() {
		return helperDown.getContent();
	} 
	
	// ���������� ��������� ������� �� �������
	public String[] getTableTitle() {
		return helperDown.getTitle();
	}
}
