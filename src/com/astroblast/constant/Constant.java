package com.astroblast.constant;

public class Constant {

    public static class Panel{
        final int originalTileSize = 16;  // 16x16 tile
        final int scale = 3;
        final int tileSize = originalTileSize * scale;

        final int maxScreenCol = 16;
        final int maxScreenRow = 12;
        public final int screenWidth = tileSize * maxScreenCol;  //768 pixels
        public final int screenHeight = tileSize * maxScreenRow;  //576 pixels
    }
}
