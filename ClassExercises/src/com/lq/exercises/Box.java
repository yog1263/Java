package com.lq.exercises;

public class Box {		
		
		private double length;
		private double width;
		private double height;
		
		public Box(double length, double width, double height) {
			super();
			this.length = length;
			this.width = width;
			this.height = height;
		}
		
		Box(double side)
		{
			this(side,side,side);
		}
		
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			if(length <= 0)
			{
				System.out.println("length should greater than zero");
			}
			else
			{
				this.length = length;
			}
			
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			if(width <= 0)
			{
				System.out.println("width should greater than zero");
			}
			else
			{
				this.width = width;
			}
	
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			
			if(height <= 0)
			{
				System.out.println("height should greater than zero");
			}
			else
			{
				this.height = height;
			}
		}
		
		/**
		 * 
		 * @return
		 */
		
		
		public double getVolume() {
			
			return (length * width * height);
			
		}
		
		public double getSurfaceArea() {
			
			return ((length * width + width * height + length * height)* 2);
			
		}
		
		public void printBox() {
			if(length <= 0 || width <= 0 || height <= 0)
			{
				System.out.println("Box contain invalid attributes");
			}
			else
			{
				System.out.println("length = " + length);
				System.out.println("width = " + width);
				System.out.println("height = " + height);
				System.out.println("Surface area = " + getSurfaceArea());
				System.out.println("volume = " + getVolume());
			}
		}


}
