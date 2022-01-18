package PlaneWar;

public abstract class Plane extends FlyingObject{
	public void move() {
		y += step;
	}

}
