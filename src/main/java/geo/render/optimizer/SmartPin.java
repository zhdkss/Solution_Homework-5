package geo.render.optimizer;

public class SmartPin {
    private final int x;
    private final int y;
    private final String label;
    private final CorePinStyle style;
    private boolean isHighlighted;

    public SmartPin(int x, int y, String label, CorePinStyle style) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.style = style;
    }

    public void toggleHighlight() {
        this.isHighlighted = !isHighlighted;
    }

    public void draw() {
        String renderedLabel = isHighlighted ? "🌟 " + label : label;
        style.renderAt(x, y, renderedLabel);
    }
}