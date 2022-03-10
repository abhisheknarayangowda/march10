package day4pgm4;
class Car
{
	public int gear,speed;
	boolean clutch,brake,acceleration;
	public void start()
	{
	}
	public void stop()
	{
	}
	public void setSpeed(int i)
	{
		speed = i;
	}
	public int getSpeed()
	{
		return speed;
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Car c1,c2;
		   	c1 = new Car();
			//	c2 = new Car();
		c1.speed=100;      
		c2.speed=200;
		      //  c1.setSpeed=100;
		      //  c2.speed=200;
		        //c2.setSpeed(200);
		        //System.out.println(c1.getSpeed());
		System.out.println(Car.speed);      //cannot make a static reference to non static field
			}

	}


