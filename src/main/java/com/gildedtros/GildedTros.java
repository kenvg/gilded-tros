package com.gildedtros;

import java.util.List;

import static com.gildedtros.ItemConstants.*;

class GildedTros {

    List<Item> items;

    public GildedTros(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals(GOOD_WINE)
//                    && !items[i].name.equals("Backstage passes for Re:Factor")
//                    && !items[i].name.equals("Backstage passes for HAXX"))
//            {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals(B_DAWG_KEYCHAIN)) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes for Re:Factor") || items[i].name.equals("Backstage passes for HAXX") ) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals(B_DAWG_KEYCHAIN)) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals(GOOD_WINE)) {
//                    if (!items[i].name.equals("Backstage passes for Re:Factor") && !items[i].name.equals("Backstage passes for HAXX")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals(B_DAWG_KEYCHAIN)) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
    }

    public void decreaseQuality(Item item) {

    }

    public void increaseQuality(Item item) {

    }
}