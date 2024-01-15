class TemperatureSensor implements Sensor {
    private double temperature;
    private String status;

    public TemperatureSensor(double temperature, String status) {
        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {

        System.out.println("Zresetowano sensor");
    }
}
