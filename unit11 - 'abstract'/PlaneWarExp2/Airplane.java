//In 'PlaneWarExp2' this expanded unit, we reconstruct the constructors
//we generate it in the super class - FlyingObject
//we update the package, randomly add different planes (Airplane,Bigplane,Bee)
//with different ratios starting at the the top of screen 

package PlaneWarExp2;

import java.util.Random;

import javax.swing.ImageIcon;

public class Airplane extends Plane {
	
	//constructor reload
	//this constructor is set for randomly occurring a plane on the top 
	public Airplane() {
		//update
		super(Images.airplane[0], Images.airplane, Images.bom);
		step = Math.random()*5+1;//1 ~ 6 random speed
	}
	
	//this constructor is used for setting a specific location
	public Airplane(double x, double y, double step) {
		super(x,y,Images.airplane[0], Images.airplane, Images.bom);
		this.step = step;
	}
	

}