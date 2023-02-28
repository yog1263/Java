/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class BoxDriver {
	float length, width, height;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box Box1 = new Box(5,6,7);
		/*Box1.length = 5;
		Box1.width = 6;
		Box1.height = 7;*/
		
		
		Box Box2 = new Box(10);
		/*Box2.length = 10;
		Box2.width = 10;
		Box2.height = 10;*/
		
		
		System.out.println("Box 1 lenght is " + Box1.getLength());
		System.out.println("Box 1 width is " + Box1.getWidth());
		System.out.println("Box 1 height is " + Box1.getHeight());
		
		System.out.println("Box 2 lenght is " + Box2.getLength());
		System.out.println("Box 2 width is " + Box2.getWidth());
		System.out.println("Box 3 height is " + Box2.getHeight());
		
		Box1.setLength(3);
		Box1.setWidth(4);
		Box1.setHeight(5);
		
		System.out.println("Box 1 lenght is " + Box1.getLength() + " , Box 1 width is " 
		+ Box1.getWidth() + " , Box 1 height is " + Box1.getHeight());
		System.out.println("Volume of Box 1 is " + Box1.getVolume());
		System.out.println("Surface area of Box 1 is " + Box1.getSurfaceArea());
		Box1.printBox();
		
		Box1.setLength(0);
		Box1.setWidth(0);
		Box1.setHeight(0);
		Box1.printBox();
	
		

	}

}
