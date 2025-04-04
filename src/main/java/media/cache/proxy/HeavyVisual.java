package media.cache.proxy;

public class HeavyVisual implements VisualAsset {
    private final String assetId;

    public HeavyVisual(String assetId) {
        this.assetId = assetId;
        initialize();
    }

    private void initialize() {
        System.out.println("[Heavy] Loading to VRAM: " + assetId);
    }

    public void showPreview() {
        System.out.println("[Heavy] Showing compressed: " + assetId);
    }

    public void loadFull() {
        System.out.println("[Heavy] Rendering 8K HDR: " + assetId);
    }
}