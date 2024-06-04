package uk.co.flaminscotsman.kolmafiamicrobenchmark;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public final class ItemsLoader {
    public static final List<String> Names;

    static {
        try (InputStream stream = ItemsLoader.class.getResourceAsStream("/items.txt")) {
            if (stream == null) {
                throw new RuntimeException("Could not open items.txt");
            }
            Names = Item.Factory
                    .readAll(stream)
                    .stream()
                    .map(Item::getName)
                    .filter(Objects::nonNull)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
