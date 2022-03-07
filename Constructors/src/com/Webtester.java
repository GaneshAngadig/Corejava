package com;

import com.xwrokz.webseries.Webseries;

public class Webtester {

	public static void main (String []args) {
		
		 Webseries web=new Webseries("Vikings", "Ragnar Lothbrock", 6, 96, 448.8f, 8.6, "Michael hirst", "Legerth", "Ivar");
		 Webseries G=new Webseries("GOT", "Jons Snow", 8, 73, 123.233f, 9.2, "Chetan ", "Khaleesi", "Lyannistor");
		 Webseries P=new Webseries("Money Hiest", "Proffesor", 5,23, 355.56f, 8.2, "Nikunj", "Tokyo", "pradeep");
		 
		 web.vikings();
		 web.Hero();
		 web.about();
		 web.agression();
		 web.ivar();
		 
		
	}
}
