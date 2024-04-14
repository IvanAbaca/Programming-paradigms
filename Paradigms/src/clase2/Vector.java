package clase2;

import java.util.Objects;

public class Vector {
	//Atributes
	private double x = 0;
	private double y = 0;
	private double z = 0;
	
	//Constructor
	public Vector(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//methods
	public Vector suma(Vector vec)
	{
		return new Vector(this.x + vec.x, this.y + vec.y, this.z + vec.z);
	}
	
	public Vector resta(Vector vec)
	{
		return this.suma(vec.opuesto());
	}
	
	public Vector producto(double num)
	{
		return new Vector(this.x*num, this.y*num, this.z*num);
	}
	
	public Vector opuesto()
	{
		return new Vector(-this.x, -this.y, -this.z);
	}
	
	@Override
    public String toString() 
	{
        return "("+(int)x+", "+(int)y+", "+(int)z+")";
    }

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y)
				&& Double.doubleToLongBits(z) == Double.doubleToLongBits(other.z);
	}
}
