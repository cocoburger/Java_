package com.kh.practice.point.model.vo;

public class Point {

		private int x;
		private int y;
		
		public Point() {
			// TODO Auto-generated constructor stub
		}

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		public int getX() {
			return x;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getY() {
			return y;
		}
		
		public String toString() {
			return getX()+" "+getY();
		}
		
}