package noudys.com.entities;

import java.util.Random;

public class Apple implements Runnable{

	String name;
	int time;
	Random rnd = new Random();
	
	public Apple(String name){
		this.name = name;
		time = rnd.nextInt(999);
	}
	
	@Override
	public void run() {
		
		try {
			System.out.printf("%s  sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch (Exception e) {
			System.out.println("");
		}
	}

}
