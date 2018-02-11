package edu.towson.cis.cosc442.project1.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String msg) {
		boolean bool = true; 
		return bool; 
	}
	
	void setName(String name) {
	}
}
