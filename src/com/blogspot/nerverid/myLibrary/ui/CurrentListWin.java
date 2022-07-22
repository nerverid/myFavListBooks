package com.blogspot.nerverid.myLibrary.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.blogspot.nerverid.myLibrary.*;
/**
 * 
 * @author Krivko Konstantin
 * @version 0.0.1
 */

public class CurrentListWin {
	
	private JPanel panel;
	private JLabel label;
	private JFrame frame;
	private JTable table;
	private JButton newBook;
	
	public CurrentListWin () {
		frame = new JFrame();
		frame.setTitle("Current List");
		
		// getting current list
		CurrentLists curList = new CurrentLists();
		String [][] data = curList.getTableContent();
		String [] columnNames = curList.getTableTitle();
		table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		
		newBook = new JButton("Add Book");
		
		JScrollPane sp = new JScrollPane(table);
		
		panel.add(sp);
		panel.add(newBook);
		
		frame.add(sp);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}
	
	/*public CurrentListWin (CurrentLists list){
		
	}*/

}
