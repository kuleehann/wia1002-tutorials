package tuto1.q4;

abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        while(currentSpeed!=maxSpeed){
            accelerate();
        }
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("hi");
        //Vehicle v = new Vehicle(100); cannot create an instance weeeee
    }
}
