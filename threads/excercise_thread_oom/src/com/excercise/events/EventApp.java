package com.excercise.events;

import java.awt.*;
import java.awt.event.*;

public class EventApp extends Frame implements ActionListener {

	TextField text;

	EventApp() {

		text = new TextField();
		text.setBounds(60, 50, 170, 20);
		Button button = new Button("click me");
		button.setBounds(100, 120, 80, 30);

		
		button.addActionListener(this);
		button.addActionListener(new MyEventListener());
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymous Actionlistener called");
				
			}
		});

		add(button);
		add(text);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		text.setText("Welcome");
	}

	public static void main(String args[]) {
		new EventApp();
	}
	
	private class MyEventListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Event ouccured");
			
		}
		
	}
}
