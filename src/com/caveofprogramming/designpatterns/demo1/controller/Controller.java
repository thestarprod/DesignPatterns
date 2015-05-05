package com.caveofprogramming.designpatterns.demo1.controller;

import com.caveofprogramming.designpatterns.demo1.model.Model;
import com.caveofprogramming.designpatterns.demo1.view.LoginListener;
import com.caveofprogramming.designpatterns.demo1.view.View;

public class Controller implements LoginListener {

	private View view;
	private Model model;
	public Controller(View view, Model model) {

		this.view = view;
		this.model = model;
	}
	@Override
	public void loginPerformed() {
		// TODO Auto-generated method stub
		
	}
	
	
}
