public class SensorTest {
    public static void main(String[] args) {

        TemperatureSensor temperatureSensor = new TemperatureSensor(25.5, "Normalna");
        System.out.println("Temperatura: " + temperatureSensor.readValue());
        System.out.println("Status: " + temperatureSensor.getStatus());
        temperatureSensor.reset();

        System.out.println();


        PressureSensor pressureSensor1 = new PressureSensor(1013.25, "W normie");
        System.out.println("Ciśnienie: " + pressureSensor1.readValue());
        System.out.println("Status: " + pressureSensor1.getStatus());
        pressureSensor1.reset();

        PressureSensor pressureSensor2 = new PressureSensor(1213.25, "Podwyższone");
        System.out.println("Ciśnienie: " + pressureSensor2.readValue());
        System.out.println("Status: " + pressureSensor2.getStatus());
        pressureSensor2.reset();
    }
}