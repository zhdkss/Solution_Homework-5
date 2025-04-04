package media.cache.proxy;

public class AssetLoaderDemo {
    public static void main(String[] args) {
        VisualAsset asset = new AssetPlaceholder("thumb.webp", "full.heif");
        asset.showPreview();
        System.out.println("-- User clicked 'Zoom' --");
        asset.loadFull();
    }
}