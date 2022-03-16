package com.xworkz.socialMedia.dto;

public class SocialMediaDTO {
	private int  id;
	private String name;
	private String size;
	private String founder;
	private double version;

	 public  SocialMediaDTO()
	 {
		 System.out.println(this.getClass().getSimpleName()+" Object is created");
		 
	 }
	public int getid() {
		 return id;
	 }
	public void setid(int i) {
		id=i;
	}
	public String getname() {
		return name;
	}
	public void setname(String na) {
		name=na;
	}
	public String getsize() {
		return size;
	}
	public void setsize(String si) {
		size=si;
	}
	public String getfounder() {
		return founder;
	}
	public void setfounder(String fun) {
		founder=fun;
	}
	public double getversion() {
		return version;
	}
	public void setversion(double ver) {
		version=ver;
	}
	@Override
	public String toString() {
		
	
	return "SocialMedia-[Id="+id+", SocialMedianame="+name+", SocialMediasize="+size+", SocialMediaFounder="+founder+", SocialMediaversion="+version+"]";
}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj){
		SocialMediaDTO dto = (SocialMediaDTO) obj;
		if(this.founder==dto.founder)
		return true;
		return false;
	
		
	}
}
