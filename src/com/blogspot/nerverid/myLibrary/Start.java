package com.blogspot.nerverid.myLibrary;

import com.blogspot.nerverid.myLibrary.ui.CurrentListWin;
import java.io.*;

public class Start {
	
	private String menuAsk;
	
	public Start(){
		System.out.println("Welcome to your bookLists");
		System.out.println("Menu: current - download current lists");
		System.out.println("curo - current task list");
		System.out.println("myl - my lybrary");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			menuAsk = reader.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		switch(menuAsk) {
		 	case ("current") :
		 		break;
		 	case ("curo"):
		 		break;
		 	case ("myl"): 
		 		break;
		}
		this.display();
	}
	
	public void display() {
		CurrentListWin currList = new CurrentListWin();	
	}
}
