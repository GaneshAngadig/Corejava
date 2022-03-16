package com.xworkz.danceclass.dto;

public class Danceclass {
	private String masterName;
	private byte noOfstuents;
	private String className;
	
	public Danceclass() {
		System.out.println(this.getClass().getSimpleName()+ "Object is created");
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public byte getNoOfstuents() {
		return noOfstuents;
	}

	public void setNoOfstuents(byte noOfstuents) {
		this.noOfstuents = noOfstuents;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
		@Override
		public String toString() {
			return "Danceclass-[mastername="+masterName+" , noofstuddents="+noOfstuents+" , classname="+className+"]";
		}
}
