public class Printer extends PoweredDevice implements CanPrint {
    public Printer(String name, double voltage, boolean state) {
        super(name, voltage, state);
    }

    @Override
    public void print() {
        System.out.println("printing..");
    }

    @Override
    public void switchOn() {
        setState(true);
    }

    @Override
    public void switchOff() {
        setState(false);
    }

    @Override
    public String toString() {
        return "Printer name: " + getName() + " voltage: " + getVoltage() + " state: " + getState();
    }

}
