package geo.render.optimizer;

import java.util.HashMap;
import java.util.Map;

public class PinStyleRegistry {
    private static final Map<String, CorePinStyle> cache = new HashMap<>();

    public static CorePinStyle of(String icon, String colorProfile) {
        String key = icon + ":" + colorProfile;
        if (!cache.containsKey(key)) {
            cache.put(key, new CorePinStyle(icon, colorProfile));
        }
        return cache.get(key);
    }
}