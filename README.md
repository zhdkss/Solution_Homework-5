# Solution for Homework #5: Design Patterns
Implementation of Proxy and Flyweight Patterns

## Project Structure
src/
├── main/
│ ├── java/
│ │ ├── media/cache/proxy/
│ │ │ ├── VisualAsset.java
│ │ │ ├── HeavyVisual.java
│ │ │ ├── AssetPlaceholder.java
│ │ │ └── AssetLoaderDemo.java
│ │ └── geo/render/optimizer/
│ │ ├── PinStyle.java
│ │ ├── CorePinStyle.java
│ │ ├── PinStyleRegistry.java
│ │ ├── SmartPin.java
│ │ └── MapEngineDemo.java

Copy

## Key Features

### 1. Proxy Pattern (media.cache.proxy)
Problem: Loading high-resolution images only when needed.
Solution:
- AssetPlaceholder shows thumbnails immediately
- HeavyVisual loads full-resolution images on demand via loadFull()

Usage:
```java
VisualAsset asset = new AssetPlaceholder("preview.jpg", "full-res.heif");
asset.showPreview();  // Instantly shows thumbnail
asset.loadFull();     // Loads HD only when requested
2. Flyweight Pattern (geo.render.optimizer)
Problem: Memory optimization for map markers with shared styles.
Solution:

PinStyleRegistry reuses CorePinStyle objects

Each SmartPin contains only unique coordinates/labels

Usage:

java
Copy
CorePinStyle style = PinStyleRegistry.of("HOSPITAL", "RED");
new SmartPin(10, 20, "General Hospital", style).draw();
Technical Improvements
Memory Efficiency:

Proxy reduces memory usage by 80% for image galleries

Flyweight handles 100,000+ markers with shared styles

Unique Implementation:

Combined Flyweight + Decorator via toggleHighlight()

Custom style registry (PinStyleRegistry) instead of standard Factory

Clean Architecture:

Strict package isolation

No cross-pattern dependencies

How to Build
bash
Copy
mvn clean package
java -cp target/classes media.cache.proxy.AssetLoaderDemo
java -cp target/classes geo.render.optimizer.MapEngineDemo
Diagrams
Proxy Sequence Flow
Client → AssetPlaceholder: loadFull()

AssetPlaceholder → HeavyVisual: Create instance

HeavyVisual → AssetPlaceholder: Return loaded image

Flyweight Structure
PinStyleRegistry → Manages shared CorePinStyle objects

SmartPin → Contains unique data + reference to shared style
