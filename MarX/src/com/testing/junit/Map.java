package com.testing.junit;

public class Map {
	// used to define the map size
	int x;
	int y;
	
	// show player on the map
	int currentx;
	int currenty;
	
	// map method to allow me to create the map size
	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(String direction) {
		if (direction.equals("N")) {
			if (this.currenty == this.y) {
				this.currenty = 0;
			} else {
				this.currenty = this.currenty + 1;
			}
		} else if (direction.equals("S")) {
			if (this.currenty <= 0) {
				this.currenty = this.y;
			} else {
				this.currenty = this.currenty - 1;
			}
		}// end of Y axis if statement
		
		if (direction.equals("E")) {
			if (this.currentx == this.x) {
				this.currentx = 0;
			} else {
				this.currentx = this.currentx + 1;
			}
		} else if (direction.equals("W")) {
			if (this.currentx <= 0) {
				this.currentx = this.x;
			} else {
				this.currentx = this.currentx - 1;
			}
		}// end of X axis if statement
	}// end of move method
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public int getCurrentx() {
		return currentx;
	}

	public void setCurrentx(int currentx) {
		this.currentx = currentx;
	}

	public int getCurrenty() {
		return currenty;
	}

	public void setCurrenty(int currenty) {
		this.currenty = currenty;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
