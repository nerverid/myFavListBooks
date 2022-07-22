package com.blogspot.nerverid.myLibrary.helpers;

public class HelperDownload {
	
		
	public HelperDownload(){
		
	}
	
	public HelperDownload(Downloaded downloadSorce){
		
	}
	
	public String[][] getContent() {
		String [][] data = {
				{"Aspring Robert Lynn", "Another Fine Myth", "4"},
				{"HeadFirst", "Java", "400"},
				{"Frank Gerbert", "Dune", "700"}
		};
		return data;
	}
	
	public String[] getTitle() {
		String [] columnNames = {"Author", "Title", "bookmark"};
		return columnNames;
	}
	
}
