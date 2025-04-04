package media.cache.proxy;

public class AssetPlaceholder implements VisualAsset {
    private final String previewId;
    private final String fullId;
    private HeavyVisual realAsset;

    public AssetPlaceholder(String previewId, String fullId) {
        this.previewId = previewId;
        this.fullId = fullId;
    }

    public void showPreview() {
        System.out.println("[Placeholder] Loading preview: " + previewId);
    }

    public void loadFull() {
        if (realAsset == null) {
            realAsset = new HeavyVisual(fullId);
        }
        realAsset.loadFull();
    }
}