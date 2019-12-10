public class Scanner extends PoweredDevice implements CanScan {
    public Scanner(String name, double voltage, boolean state) {
        super(name, voltage, state);
    }

    @Override
    public void scan() {
        System.out.println("scanning..");
    }

    @Override
    public void switchOn() {
        System.out.println("scanner is strting ");
        setState(true);
    }

    @Override
    public void switchOff() {
        System.out.println("scanner is shouting down ");
        setState(false);
    }

    @Override
    public String toString() {
        return "Scanner [name = " + getName() + " voltage: " + getVoltage()
                + " state= " + getState();
    }
}
