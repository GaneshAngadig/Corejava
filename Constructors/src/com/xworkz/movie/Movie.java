package com.xworkz.movie;

public class Movie {
	
	public String name;
	public String hero;
	public String heroien;
	public String director;
	public double collection;
	public String music;
	public String cameraman;
	public double duration;
	public boolean herodied;
	public boolean english;
	public String language;
	
	public Movie(String na, String he,String her,String dir,double coll, String mu, String cam, double dur, boolean die, boolean eng, String lan) {
		name=na;
		hero=he;
		heroien=her;
		director=dir;
		collection=coll;
		music=mu;
		cameraman=cam;
		duration=dur;
		herodied=die;
		english=eng;
		language=lan;
		
		System.out.println(name+"\t" + hero+"\t"+heroien+"\t"+director+"\t"+collection+"\t"+music+"\t"+cameraman+"\t"+duration+"\t"+herodied+"\t"+english+"\t"+language);
	}
	public void KGF () {
		System.out.println("One of the best movie from kannada industory");
	}
	public void gross() {
		System.out.println("top movie from kannada in collections ");
	}
	public void vill() {
		System.out.println("Ajaydevagn as a Adheera");
	}
	public void producer() {
		System.out.println("Kiragundur vijay");
	}
	public void production() {
		System.out.println("Hombale");
	}
}
