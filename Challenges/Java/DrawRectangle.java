final class DrawRectangle {
    
    char[][] drawRectangle(char[][] canvas, int[] rect) {
        for(int i = rect[1]; i <= rect[3]; i++) {
            for(int j = rect[0]; j <= rect[2]; j++) {
                if((i == rect[1] && j == rect[0])
                    || (i == rect[1] && j == rect[2])
                    || (i == rect[3] && j == rect[0])
                    || (i == rect[3] && j == rect[2]))
                    canvas[i][j] = '*';
                    
                if((i > rect[1] && i < rect[3])
                    && (j == rect[0] || j == rect[2]))
                    canvas[i][j] = '|';
                    
                if((j > rect[0] && j < rect[2])
                    && (i == rect[1] || i == rect[3]))
                    canvas[i][j] = '-';
            }
        }
        
        return canvas;
    }
}