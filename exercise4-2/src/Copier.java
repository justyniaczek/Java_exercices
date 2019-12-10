public class Copier extends PoweredDevice implements CanScan, CanPrint {
    public Copier(String name, double voltage, boolean state) {
        super(name, voltage, state);
    }

    @Override
    public void scan() {
        System.out.println("copier is scanning..");
    }

    @Override
    public void print() {
        System.out.println("copier is printing ");
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
        return "copier name:" + getName() + " voltage: " + getVoltage() + " state: " + getState();
    }
}
