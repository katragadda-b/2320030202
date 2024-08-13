public class Car implements Vehicle 
{
    public void requestRide()
    {
        System.out.println("Car ride requested");
    }
    public Vehicle createVehicle()
    {
        return new Car();
    }
}
