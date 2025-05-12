public class Runner {
    public static void main(String[] args) {
        
        Convert obj;
        obj = new L_to_G();
        System.out.println("Liters to Gallons");
        obj.read();
        obj.compute();
        obj.write();

        obj = new F_to_C();
        System.out.println(" Fahrenheit to Celsius: ");
        obj.read();
        obj.compute();
        obj.write();

        obj = new F_to_M();
        System.out.println(" Feet to Meters");
        obj.read();
        obj.compute();
        obj.write();
    }
}
