package com.baylrock;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public enum Colors {
    AliceBlue( "AliceBlue", 0xF0, 0xF8, 0xFF ),
    AntiqueWhite( "AntiqueWhite", 0xFA, 0xEB, 0xD7 ),
    Aqua( "Aqua", 0x00, 0xFF, 0xFF ),
    Aquamarine( "Aquamarine", 0x7F, 0xFF, 0xD4 ),
    Azure( "Azure", 0xF0, 0xFF, 0xFF ),
    Beige( "Beige", 0xF5, 0xF5, 0xDC ),
    Bisque( "Bisque", 0xFF, 0xE4, 0xC4 ),
    Black( "Black", 0x00, 0x00, 0x00 ),
    BlanchedAlmond( "BlanchedAlmond", 0xFF, 0xEB, 0xCD ),
    Blue( "Blue", 0x00, 0x00, 0xFF ),
    BlueViolet( "BlueViolet", 0x8A, 0x2B, 0xE2 ),
    Brown( "Brown", 0xA5, 0x2A, 0x2A ),
    BurlyWood( "BurlyWood", 0xDE, 0xB8, 0x87 ),
    CadetBlue( "CadetBlue", 0x5F, 0x9E, 0xA0 ),
    Chartreuse( "Chartreuse", 0x7F, 0xFF, 0x00 ),
    Chocolate( "Chocolate", 0xD2, 0x69, 0x1E ),
    Coral( "Coral", 0xFF, 0x7F, 0x50 ),
    CornflowerBlue( "CornflowerBlue", 0x64, 0x95, 0xED ),
    Cornsilk( "Cornsilk", 0xFF, 0xF8, 0xDC ),
    Crimson( "Crimson", 0xDC, 0x14, 0x3C ),
    DarkBlue( "DarkBlue", 0x00, 0x00, 0x8B ),
    DarkCyan( "DarkCyan", 0x00, 0x8B, 0x8B ),
    DarkGoldenRod( "DarkGoldenRod", 0xB8, 0x86, 0x0B ),
    DarkGray( "DarkGray", 0xA9, 0xA9, 0xA9 ),
    DarkGreen( "DarkGreen", 0x00, 0x64, 0x00 ),
    DarkKhaki( "DarkKhaki", 0xBD, 0xB7, 0x6B ),
    DarkMagenta( "DarkMagenta", 0x8B, 0x00, 0x8B ),
    DarkOliveGreen( "DarkOliveGreen", 0x55, 0x6B, 0x2F ),
    DarkOrange( "DarkOrange", 0xFF, 0x8C, 0x00 ),
    DarkOrchid( "DarkOrchid", 0x99, 0x32, 0xCC ),
    DarkRed( "DarkRed", 0x8B, 0x00, 0x00 ),
    DarkSalmon( "DarkSalmon", 0xE9, 0x96, 0x7A ),
    DarkSeaGreen( "DarkSeaGreen", 0x8F, 0xBC, 0x8F ),
    DarkSlateBlue( "DarkSlateBlue", 0x48, 0x3D, 0x8B ),
    DarkSlateGray( "DarkSlateGray", 0x2F, 0x4F, 0x4F ),
    DarkTurquoise( "DarkTurquoise", 0x00, 0xCE, 0xD1 ),
    DarkViolet( "DarkViolet", 0x94, 0x00, 0xD3 ),
    DeepPink( "DeepPink", 0xFF, 0x14, 0x93 ),
    DeepSkyBlue( "DeepSkyBlue", 0x00, 0xBF, 0xFF ),
    DimGray( "DimGray", 0x69, 0x69, 0x69 ),
    DodgerBlue( "DodgerBlue", 0x1E, 0x90, 0xFF ),
    FireBrick( "FireBrick", 0xB2, 0x22, 0x22 ),
    FloralWhite( "FloralWhite", 0xFF, 0xFA, 0xF0 ),
    ForestGreen( "ForestGreen", 0x22, 0x8B, 0x22 ),
    Gainsboro( "Gainsboro", 0xDC, 0xDC, 0xDC ),
    GhostWhite( "GhostWhite", 0xF8, 0xF8, 0xFF ),
    Gold( "Gold", 0xFF, 0xD7, 0x00 ),
    GoldenRod( "GoldenRod", 0xDA, 0xA5, 0x20 ),
    Gray( "Gray", 0x80, 0x80, 0x80 ),
    Green( "Green", 0x00, 0x80, 0x00 ),
    GreenYellow( "GreenYellow", 0xAD, 0xFF, 0x2F ),
    HoneyDew( "HoneyDew", 0xF0, 0xFF, 0xF0 ),
    HotPink( "HotPink", 0xFF, 0x69, 0xB4 ),
    IndianRed( "IndianRed", 0xCD, 0x5C, 0x5C ),
    Indigo( "Indigo", 0x4B, 0x00, 0x82 ),
    Ivory( "Ivory", 0xFF, 0xFF, 0xF0 ),
    Khaki( "Khaki", 0xF0, 0xE6, 0x8C ),
    Lavender( "Lavender", 0xE6, 0xE6, 0xFA ),
    LavenderBlush( "LavenderBlush", 0xFF, 0xF0, 0xF5 ),
    LawnGreen( "LawnGreen", 0x7C, 0xFC, 0x00 ),
    LemonChiffon( "LemonChiffon", 0xFF, 0xFA, 0xCD ),
    LightBlue( "LightBlue", 0xAD, 0xD8, 0xE6 ),
    LightCoral( "LightCoral", 0xF0, 0x80, 0x80 ),
    LightCyan( "LightCyan", 0xE0, 0xFF, 0xFF ),
    LightGoldenRodYellow( "LightGoldenRodYellow", 0xFA, 0xFA, 0xD2 ),
    LightGray( "LightGray", 0xD3, 0xD3, 0xD3 ),
    LightGreen( "LightGreen", 0x90, 0xEE, 0x90 ),
    LightPink( "LightPink", 0xFF, 0xB6, 0xC1 ),
    LightSalmon( "LightSalmon", 0xFF, 0xA0, 0x7A ),
    LightSeaGreen( "LightSeaGreen", 0x20, 0xB2, 0xAA ),
    LightSkyBlue( "LightSkyBlue", 0x87, 0xCE, 0xFA ),
    LightSlateGray( "LightSlateGray", 0x77, 0x88, 0x99 ),
    LightSteelBlue( "LightSteelBlue", 0xB0, 0xC4, 0xDE ),
    LightYellow( "LightYellow", 0xFF, 0xFF, 0xE0 ),
    Lime( "Lime", 0x00, 0xFF, 0x00 ),
    LimeGreen( "LimeGreen", 0x32, 0xCD, 0x32 ),
    Linen( "Linen", 0xFA, 0xF0, 0xE6 ),
    Magenta( "Magenta", 0xFF, 0x00, 0xFF ),
    Maroon( "Maroon", 0x80, 0x00, 0x00 ),
    MediumAquaMarine( "MediumAquaMarine", 0x66, 0xCD, 0xAA ),
    MediumBlue( "MediumBlue", 0x00, 0x00, 0xCD ),
    MediumOrchid( "MediumOrchid", 0xBA, 0x55, 0xD3 ),
    MediumPurple( "MediumPurple", 0x93, 0x70, 0xDB ),
    MediumSeaGreen( "MediumSeaGreen", 0x3C, 0xB3, 0x71 ),
    MediumSlateBlue( "MediumSlateBlue", 0x7B, 0x68, 0xEE ),
    MediumSpringGreen( "MediumSpringGreen", 0x00, 0xFA, 0x9A ),
    MediumTurquoise( "MediumTurquoise", 0x48, 0xD1, 0xCC ),
    MediumVioletRed( "MediumVioletRed", 0xC7, 0x15, 0x85 ),
    MidnightBlue( "MidnightBlue", 0x19, 0x19, 0x70 ),
    MintCream( "MintCream", 0xF5, 0xFF, 0xFA ),
    MistyRose( "MistyRose", 0xFF, 0xE4, 0xE1 ),
    Moccasin( "Moccasin", 0xFF, 0xE4, 0xB5 ),
    NavajoWhite( "NavajoWhite", 0xFF, 0xDE, 0xAD ),
    Navy( "Navy", 0x00, 0x00, 0x80 ),
    OldLace( "OldLace", 0xFD, 0xF5, 0xE6 ),
    Olive( "Olive", 0x80, 0x80, 0x00 ),
    OliveDrab( "OliveDrab", 0x6B, 0x8E, 0x23 ),
    Orange( "Orange", 0xFF, 0xA5, 0x00 ),
    OrangeRed( "OrangeRed", 0xFF, 0x45, 0x00 ),
    Orchid( "Orchid", 0xDA, 0x70, 0xD6 ),
    PaleGoldenRod( "PaleGoldenRod", 0xEE, 0xE8, 0xAA ),
    PaleGreen( "PaleGreen", 0x98, 0xFB, 0x98 ),
    PaleTurquoise( "PaleTurquoise", 0xAF, 0xEE, 0xEE ),
    PaleVioletRed( "PaleVioletRed", 0xDB, 0x70, 0x93 ),
    PapayaWhip( "PapayaWhip", 0xFF, 0xEF, 0xD5 ),
    PeachPuff( "PeachPuff", 0xFF, 0xDA, 0xB9 ),
    Peru( "Peru", 0xCD, 0x85, 0x3F ),
    Pink( "Pink", 0xFF, 0xC0, 0xCB ),
    Plum( "Plum", 0xDD, 0xA0, 0xDD ),
    PowderBlue( "PowderBlue", 0xB0, 0xE0, 0xE6 ),
    Purple( "Purple", 0x80, 0x00, 0x80 ),
    Red( "Red", 0xFF, 0x00, 0x00 ),
    RosyBrown( "RosyBrown", 0xBC, 0x8F, 0x8F ),
    RoyalBlue( "RoyalBlue", 0x41, 0x69, 0xE1 ),
    SaddleBrown( "SaddleBrown", 0x8B, 0x45, 0x13 ),
    Salmon( "Salmon", 0xFA, 0x80, 0x72 ),
    SandyBrown( "SandyBrown", 0xF4, 0xA4, 0x60 ),
    SeaGreen( "SeaGreen", 0x2E, 0x8B, 0x57 ),
    SeaShell( "SeaShell", 0xFF, 0xF5, 0xEE ),
    Sienna( "Sienna", 0xA0, 0x52, 0x2D ),
    Silver( "Silver", 0xC0, 0xC0, 0xC0 ),
    SkyBlue( "SkyBlue", 0x87, 0xCE, 0xEB ),
    SlateBlue( "SlateBlue", 0x6A, 0x5A, 0xCD ),
    SlateGray( "SlateGray", 0x70, 0x80, 0x90 ),
    Snow( "Snow", 0xFF, 0xFA, 0xFA ),
    SpringGreen( "SpringGreen", 0x00, 0xFF, 0x7F ),
    SteelBlue( "SteelBlue", 0x46, 0x82, 0xB4 ),
    Tan( "Tan", 0xD2, 0xB4, 0x8C ),
    Teal( "Teal", 0x00, 0x80, 0x80 ),
    Thistle( "Thistle", 0xD8, 0xBF, 0xD8 ),
    Tomato( "Tomato", 0xFF, 0x63, 0x47 ),
    Turquoise( "Turquoise", 0x40, 0xE0, 0xD0 ),
    Violet( "Violet", 0xEE, 0x82, 0xEE ),
    Wheat( "Wheat", 0xF5, 0xDE, 0xB3 ),
    White( "White", 0xFF, 0xFF, 0xFF ),
    WhiteSmoke( "WhiteSmoke", 0xF5, 0xF5, 0xF5 ),
    Yellow( "Yellow", 0xFF, 0xFF, 0x00 ),
    YellowGreen( "YellowGreen", 0x9A, 0xCD, 0x32 ),;

    private static Map<Color, Colors> cache;
    private final String name;
    private final Color color;

    Colors( String name, int r, int g, int b ) {
        this.name = name;
        color = new Color( r, g, b );

    }

    public static void doCacheFullMap() {
        Map colorsMap = new HashMap( 256 * 256 * 256 );
        for (int r = 0; r < 255; r += 3) {
            for (int g = 0; g < 255; g += 3) {
                for (int b = 0; b < 255; b += 3) {
                    Color key = new Color( r, g, b );
                    colorsMap.put( "#" + Integer.toHexString( key.getRGB() ).substring( 2 ), getColors( key ).name() );
                }
            }
        }
        Gson gson = new GsonBuilder().create();
        String cache = gson.toJson( colorsMap );
        try {
            File yourFile = new File( "cache.json" );
            yourFile.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream( yourFile, false );
            fileOutputStream.write( cache.getBytes() );
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static Colors getColors( int r, int g, int b ) {
        return getColors( new Color( r, g, b ) );
    }

    public static Colors getColorsFromCache( int r, int g, int b ) {
        if ( cache == null ) doCacheFullMap();
        return getColors( new Color( r, g, b ) );
    }


    public static Colors getColors( Color undifined ) {
        double distance = Double.MAX_VALUE;
        double buffDistance;
        Colors buf = null;
        for (Colors color : values()) {
            buffDistance = color.distanceTo( undifined );
            if ( buffDistance < distance ) {
                distance = buffDistance;
                buf = color;
            }
        }
        return buf;
    }

    public Color getColor() {
        return color;
    }

    // root of sums of pows of difs of coords
    private double distanceTo( Color undefined ) {
        return Math.sqrt(
                Math.pow( color.getRed() - undefined.getRed(), 2 ) +
                        Math.pow( color.getGreen() - undefined.getGreen(), 2 ) +
                        Math.pow( color.getBlue() - undefined.getBlue(), 2 )
        );
    }
}
