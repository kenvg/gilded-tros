package com.gildedtros;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gildedtros.ItemConstants.*;

class GildedTrosTest {

    @Test
    void givenItemGoodWine_whenUpdateQuality_thenIncreaseQuality() {
        int quality = 20;
        int sellIn = 5;

        Item goodWine = new Item(GOOD_WINE, sellIn, quality);
        Item[] items = {goodWine};

        GildedTros app = new GildedTros(items);
        app.updateQuality();

        assertEquals(quality + 1, app.items[0].quality);
    }

    @Nested
    @DisplayName("given legendary item")
    class LegendaryItems {
        @Test
        @DisplayName("then quality should remain the same")
        void givenItemBdawgKeyChain_whenUpdateQuality_thenSameQuality() {
            int quality = 80;
            int sellIn = 50;

            Item bDawgkeyChain = new Item(B_DAWG_KEYCHAIN, sellIn, quality);
            Item[] items = {bDawgkeyChain};

            GildedTros app = new GildedTros(items);
            app.updateQuality();

            assertEquals(quality, app.items[0].quality);
        }
    }

    @Nested
    @DisplayName("given backstage pass")
    class BackStagePasses {
        @Nested
        @DisplayName("then increase quality")
        class IncreaseQuality {
            @Test
            @Order(1)
            @DisplayName("once when sellIn higher than 10")
            void givenItemBackStagePasses_whenUpdateQuality_thenIncreaseQuality() {
                int quality = 45;
                int sellIn = 20;

                Item haxxBackStagePass = new Item(HAXX, sellIn, quality);
                Item[] items = {haxxBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 1, app.items[0].quality);
            }

            @Test
            @Order(2)
            @DisplayName("twice when sellIn 10 or less")
            void givenItemBackStagePasses_whenUpdateQualityForSellIn10orLess_thenIncreaseQualityTwice() {
                int quality = 35;
                int sellIn = 10;

                Item reFactorBackStagePass = new Item(RE_FACTOR, sellIn, quality);
                Item[] items = {reFactorBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 2, app.items[0].quality);
            }

            @Test
            @Order(3)
            @DisplayName("thrice when sellIn 5 or less")
            void givenItemBackStagePasses_whenUpdateQualityForSellIn5orLess_thenIncreaseQualityThrice() {
                int quality = 5;
                int sellIn = 5;

                Item haxxBackStagePass = new Item(HAXX, sellIn, quality);
                Item[] items = {haxxBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 3, app.items[0].quality);
            }
        }
    }

}
