package com.gildedtros;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ItemConstants {

    static final String B_DAWG_KEYCHAIN = "B-DAWG Keychain";
    static final String GOOD_WINE = "Good Wine";
    static final String RE_FACTOR = "Backstage passes for Re:Factor";
    static final String HAXX = "Backstage passes for HAXX";
    static final String DUPLICATE_CODE = "Duplicate Code";
    static final String LONG_METHODS = "Long Methods";
    static final String UGLY_VARIABLE_NAMES = "Ugly Variable Names";

    static Set<String> legendaries = new HashSet<>(Arrays.asList(B_DAWG_KEYCHAIN));
    static Set<String> backstagePasses = new HashSet<>(Arrays.asList(RE_FACTOR, HAXX));
    static Set<String> smellyItems = new HashSet<>(Arrays.asList(DUPLICATE_CODE, LONG_METHODS, UGLY_VARIABLE_NAMES));


}
