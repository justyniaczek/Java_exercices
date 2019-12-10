public abstract class PoweredDevice {

    private String name;
    private double voltage;
    private boolean state = false;

    public PoweredDevice(String name, double voltage, boolean state) {
        super();
        this.name = name;
        this.voltage = voltage;
        this.state = state;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVoltage() {
        return this.voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }

    public abstract void switchOn();

    public abstract void switchOff();

    @Override
    public String toString() {
        return " name: " + name + "  voltage: " + voltage;
    }

}
