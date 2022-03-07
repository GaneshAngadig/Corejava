package com;
import com.xworkz.college.College;

public class Collegetester {
	public static void main(String []args) {
		 College shettar=new College("Shettar college","guledagudda",587203,"Manoj Bhat",20,505,25,false,false, "Holbasu",92.5);
		 College bvvs=new College("BVVS college","bagalkot",587201,"kanadagall",25,5000,80,true,true, "charantimath",89.2);
		 College xt=new College("xt x xavier","guledagudda",587203,"josheph",21,700,25,false,false, "yesu",52.22);
		 
		 shettar.quality();
		 shettar.old();
		 shettar.spcl();
		 shettar.disad();
		 shettar.food();
	}	

}
