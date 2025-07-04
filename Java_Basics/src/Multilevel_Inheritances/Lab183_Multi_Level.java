package Multilevel_Inheritances;

public class Lab183_Multi_Level {

	public static void main(String[] args) {
		
		Son s1 = new Son();
//		Son s2 = new Father();
//		Son s2 = new GrandFather();
		
		GrandFather g1 = new Son();
        g1.gf();
        g1.home();
		
	}
}
