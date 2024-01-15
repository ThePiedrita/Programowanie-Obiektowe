class PressureSensor implements Sensor {
    private double pressure;
    private String status;

    public PressureSensor(double pressure, String status) {
        this.pressure = pressure;
        this.status = status;
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano sensor.");
    }
}
