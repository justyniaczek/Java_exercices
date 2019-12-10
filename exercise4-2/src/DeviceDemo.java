public class DeviceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Justyna's scanner", 200, false);
        Copier copier = new Copier("Justyna's copier", 120, true);
        Printer printer = new Printer("Justyna's printer", 160, false);


        scanner.switchOn();
        scanner.scan();
        scanner.setVoltage(165);
        System.out.println(scanner.toString());

        copier.setState(false);
        copier.scan();
        copier.print();
        copier.setName("Krzysiek's scanner");
        System.out.println(copier.toString());

        printer.print();
        printer.switchOff();
        System.out.println(printer.toString());

    }
}
