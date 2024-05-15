package poly.car1;

public class Model3Car  implements Car{

    @Override
    public void statEngine() {
        System.out.println("Model3Car.startEngine.");

    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.accelerator");
    }
}
