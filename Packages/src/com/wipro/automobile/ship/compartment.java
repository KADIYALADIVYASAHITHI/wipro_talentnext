package com.wipro.automobile.ship;

public class compartment {
     double length,width,height;
     compartment(double length,double width,double height){
    	 this.length=length;
    	 this.width=width;
    	 this.height=height;
     }
     public void display() {
    	 System.out.println("Length :"+length);
    	 System.out.println("width :"+width);
    	 System.out.println("height :"+height);
     }
     public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		compartment c=new compartment(10.2,22.2,45.3);
 		c.display();

 	}

}
