package geo.render.optimizer;

public class CorePinStyle implements PinStyle {
    private final String icon;
    private final String colorProfile;

    public CorePinStyle(String icon, String colorProfile) {
        this.icon = icon;
        this.colorProfile = colorProfile;
    }

    public void renderAt(int x, int y, String label) {
        System.out.printf("PIN [%s|%s] @(%d,%d): %s\n",
                icon, colorProfile, x, y, label);
    }
}