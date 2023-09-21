package com.gildedtros;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gildedtros.ItemConstants.*;

@DisplayName("update quality item tests")
class GildedTrosTest {


    @Nested
    @DisplayName("given good wine")
    class GoodWine {

        @Nested
        @DisplayName("then increase quality")
        class IncreaseQuality {
            @Test
            @DisplayName("when sellIn decreases and quality < 50")
            void givenItemGoodWine_whenUpdateQuality_thenIncreaseQuality() {
                int quality = 20;
                int sellIn = 5;

                Item goodWine = new Item(GOOD_WINE, sellIn, quality);
                Item[] items = {goodWine};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 1, app.items[0].quality);
            }
        }

        @Nested
        @DisplayName("then same quality")
        class SameQuality {
            @Test
            @DisplayName("when sellIn decreases and quality = 50")
            void givenItemGoodWine_whenUpdateQuality_thenSameQuality() {
                int quality = 50;
                int sellIn = 5;

                Item goodWine = new Item(GOOD_WINE, sellIn, quality);
                Item[] items = {goodWine};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality, app.items[0].quality);
            }

        }
    }

    @Nested
    @DisplayName("given legendary item")
    class LegendaryItem {
        @Test
        @DisplayName("then quality and sellIn remain the same")
        void givenItemBdawgKeyChain_whenUpdateQuality_thenSameQuality() {
            int quality = 80;
            int sellIn = 50;

            Item bDawgkeyChain = new Item(B_DAWG_KEYCHAIN, sellIn, quality);
            Item[] items = {bDawgkeyChain};

            GildedTros app = new GildedTros(items);
            app.updateQuality();

            assertEquals(quality, app.items[0].quality);
            assertEquals(sellIn, app.items[0].sellIn);
        }
    }

    @Nested
    @DisplayName("given normal item")
    class NormalItem {
        @Nested
        @DisplayName("then decrease quality")
        class DecreaseQuality {

            @Test
            @DisplayName("once when sellIn > 0")
            void givenNormalItem_whenUpdateQuality_thenDecreaseQuality() {
                int quality = 50;
                int sellIn = 1;

                Item normalItem = new Item("Normal Item", sellIn, quality);
                Item[] items = {normalItem};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality -1, app.items[0].quality);
            }

            @Test
            @DisplayName("twice when sellIn <= 0")
            void givenNormalItem_whenUpdateQuality_thenDecreaseQualityTwice() {
                int quality = 50;
                int sellIn = 0;

                Item normalItem = new Item("Normal Item", sellIn, quality);
                Item[] items = {normalItem};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality -2, app.items[0].quality);
            }
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
            @DisplayName("once when sellIn > 10 and quality <= 49")
            void givenItemBackStagePasses_whenUpdateQuality_thenIncreaseQuality() {
                int quality = 49;
                int sellIn = 20;

                Item haxxBackStagePass = new Item(HAXX, sellIn, quality);
                Item[] items = {haxxBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 1, app.items[0].quality);
            }

            @Test
            @Order(2)
            @DisplayName("twice when sellIn =< 10 and quality <= 48")
            void givenItemBackStagePasses_whenUpdateQualityForSellIn10orLess_thenIncreaseQualityTwice() {
                int quality = 48;
                int sellIn = 10;

                Item reFactorBackStagePass = new Item(RE_FACTOR, sellIn, quality);
                Item[] items = {reFactorBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 2, app.items[0].quality);
            }

            @Test
            @Order(3)
            @DisplayName("thrice when sellIn <= 5 and quality <= 47")
            void givenItemBackStagePasses_whenUpdateQualityForSellIn5orLess_thenIncreaseQualityThrice() {
                int quality = 47;
                int sellIn = 5;

                Item haxxBackStagePass = new Item(HAXX, sellIn, quality);
                Item[] items = {haxxBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality + 3, app.items[0].quality);
            }
        }

        @Nested
        @DisplayName("then same quality")
        class SameQuality {

            @Test
            @DisplayName("when quality = 50")
            void givenItemBackStagePasses_whenUpdateQualityForQuality50_thenSameQuality() {
                int quality = 50;
                int sellIn = 20;

                Item haxxBackStagePass = new Item(HAXX, sellIn, quality);
                Item[] items = {haxxBackStagePass};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality, app.items[0].quality);
            }

        }
    }

    @Nested
    @DisplayName("given smelly item")
    class SmellyItems {

        @Nested
        @DisplayName("then decrease quality")
        class DecreaseQuality {

            @Test
            @DisplayName("once when sellIn decreases and quality = 1")
            void givenItemLongMethods_whenUpdateQuality_thenDecreaseQuality() {
                int quality = 1;
                int sellIn = 20;

                Item longMethods = new Item(LONG_METHODS, sellIn, quality);
                Item[] items = {longMethods};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality - 1, app.items[0].quality);
            }

            @Test
            @DisplayName("twice when sellIn decreases and quality >= 2")
            void givenItemDuplicateCode_whenUpdateQuality_thenDecreaseQuality() {
                int quality = 2;
                int sellIn = 20;

                Item duplicateCode = new Item(DUPLICATE_CODE, sellIn, quality);
                Item[] items = {duplicateCode};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality - 2, app.items[0].quality);
            }

        }

        @Nested
        @DisplayName("then same quality")
        class SameQuality {
            @Test
            @DisplayName("when quality = 0")
            void givenItemUglyVariableNames_whenUpdateQuality_thenSameQuality() {
                int quality = 0;
                int sellIn = 20;

                Item uglyVariableNames = new Item(UGLY_VARIABLE_NAMES, sellIn, quality);
                Item[] items = {uglyVariableNames};

                GildedTros app = new GildedTros(items);
                app.updateQuality();

                assertEquals(quality - 1, app.items[0].quality);
            }

        }
    }
}

