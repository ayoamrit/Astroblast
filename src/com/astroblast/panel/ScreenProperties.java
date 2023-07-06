package com.astroblast.panel;

public class ScreenProperties {
    //Original sie of a tile in pixels
    final int originalTileSize = 16;

    //Scale factor for resizing the tiles
    final int scale = 3;

    //Final size of a tile after scaling
    public final int tileSize = originalTileSize * scale;

    public final int FPS = 60;

    //Maximum number of columns and rows on the screen
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    //Width and height of the screen in pixels
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;
}
