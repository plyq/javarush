package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;


/**
 * Created by Mashkovsky on 11.08.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes i){
        if (i instanceof ImageTypes)
        {
            if (i==(ImageTypes.BMP)) return new BmpReader();
            if (i==(ImageTypes.JPG)) return new JpgReader();
            if (i==(ImageTypes.PNG)) return new PngReader();
            return null;
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
