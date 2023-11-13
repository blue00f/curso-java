package ejercicio_04;

public class Vector3D {
	private double x;
	private double y;
	private double z;
	
	public Vector3D(double x, double y, double z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	public double getNorma() {
		return Math.sqrt((Math.pow(getX(), 2)) + (Math.pow(getY(), 2)) + (Math.pow(getZ(), 2)));
	}
}
