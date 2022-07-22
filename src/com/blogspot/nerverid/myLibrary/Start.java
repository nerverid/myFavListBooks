package com.blogspot.nerverid.myLibrary;

import com.blogspot.nerverid.myLibrary.ui.CurrentListWin;
import com.blogspot.nerverid.myLibrary.ui.MainMenu;

import java.io.*;

public class Start {
	
	private String menuAsk;
	private CurrentLists currentList = new CurrentLists();
	
	public Start(){
		/*System.out.println("Welcome to your bookLists");
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
		} */
		if (currentList.isEmpty() == true) {
			this.display("current");
		} else {
			this.display("main");
		}
	}
	
	public void display(String command) {
		switch (command){
		case "main":
			MainMenu mainMenu = new MainMenu();
			break;
		case "current":
			CurrentListWin currList = new CurrentListWin();
			break;
		}
			
	}
}
