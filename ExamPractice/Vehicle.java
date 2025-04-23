public class Vehicle
{
    private int speed;
    private String model;

    public Vehicle(int speed, String model)
    {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed()
    {
        return speed;
    }

    public String getModel()
    {
        return model;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public String toString()
    {
        return "Model: "+model+", Max Speed: "+speed+" mph";
    }

    public int compareTo(Vehicle other)
    {
        if (speed>other.getSpeed())
        {
            return 1;
        }
        else if (speed==other.getSpeed())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    public boolean sameModel(Vehicle other)
    {
        return model.equals(other.getModel());
    }
}
