package com.gildedtros;

import java.util.List;

import static com.gildedtros.ItemConstants.*;
import static com.gildedtros.ItemConstants.GOOD_WINE;
import static com.gildedtros.QualityConstants.*;

class GildedTros {

    List<Item> items;

    public GildedTros(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            String quality = determineQuality(item);

            if (quality.equals(LEGENDARY)) {
                return;
            }

            if (quality.equals(POOR)) {
                if (item.sellIn <= 0) {
                    decreaseQuality(item, 4);
                    return;
                }
                decreaseQuality(item, 2);
                return;
            }

            if (quality.equals(BACKSTAGE_PASS)) {
                if (item.sellIn <= 0) {
                    decreaseQuality(item, item.quality);
                    return;
                }

                if (item.sellIn <= 5) {
                    increaseQuality(item, 3);
                    return;
                }

                if (item.sellIn <= 10) {
                    increaseQuality(item, 2);
                    return;
                }
                increaseQuality(item, 1);
                return;
            }

            if (quality.equals(WINE)) {
                increaseQuality(item, 1);
                return;
            }

            if (quality.equals(COMMON)) {
                if (item.sellIn <= 0) {
                    decreaseQuality(item, 2);
                    return;
                }
                decreaseQuality(item, 1);
            }
        }
    }

    public String determineQuality(Item item) {
        if (legendaries.contains(item.name)) {
            return LEGENDARY;
        }

        if (smellyItems.contains(item.name)) {
            return POOR;
        }

        if (backstagePasses.contains(item.name)) {
            return BACKSTAGE_PASS;
        }

        if (GOOD_WINE.equals(item.name)) {
            return WINE;
        }

        return COMMON;
    }

    public void decreaseQuality(Item item, int amount) {
        item.quality = Math.max(item.quality - amount, 0);
        item.sellIn -= 1;
    }

    public void increaseQuality(Item item, int amount) {
        item.quality = Math.min(item.quality + amount, 50);
        item.sellIn -= 1;
    }
}