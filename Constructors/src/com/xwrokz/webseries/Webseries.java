package com.xwrokz.webseries;

public class Webseries {

	public String name ;
	public String hero;
	public int noOfseason;
	public int noOfepisodes;
	public float collection;
	public double iMDB;
	public String director;
	public String heroin;
	public String villains;
	
	public Webseries(String nam, String he, int sea, int epi, float coll, double IMDB, String dir, String heroi, String vill) {
		name = nam;
		hero = he;
		noOfseason = sea;
		noOfepisodes = epi;
		collection = coll;
		iMDB = IMDB;
		director = dir;
		heroin = heroi;
		villains = vill;
		System.out.println(name + "\t" +hero +"\t" +noOfseason +"\t" +noOfepisodes +"\t"  +collection +"\t" +iMDB +"\t" +director +"\t" +heroin +"\t" +villains);
	}
	
	public  void vikings() {
		System.out.println("Top 10 web series in world");
	}
	public void Hero() {
		System.out.println("Most dangerous man in the world");
	}
	public void about() {
		System.out.println("Real incedent ");
	}
	public void agression() {
		System.out.println("Attacking on British peoples");
	}
	public void ivar() {
		System.out.println("ivar the boneless son of ragnar");
	}
}
