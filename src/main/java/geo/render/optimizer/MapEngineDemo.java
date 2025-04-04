package geo.render.optimizer;

public class MapEngineDemo {
    public static void main(String[] args) {
        CorePinStyle hospitalStyle = PinStyleRegistry.of("HOSP", "RED");
        CorePinStyle cafeStyle = PinStyleRegistry.of("CAFE", "BLUE");

        SmartPin pin1 = new SmartPin(10, 20, "Hospital", hospitalStyle);
        SmartPin pin2 = new SmartPin(30, 40, "Cafe", cafeStyle);

        pin1.draw();
        pin2.toggleHighlight();
        pin2.draw();
    }
}