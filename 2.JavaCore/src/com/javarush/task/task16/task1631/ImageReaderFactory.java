package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageFormat) {
        if (imageFormat == null) throw new IllegalArgumentException("Неизвестный тип картинки");

        if (imageFormat.equals(ImageTypes.JPG)) {
            return new JpgReader();
        } else if (imageFormat.equals(ImageTypes.PNG)) {
            return new PngReader();
        } else if (imageFormat.equals(ImageTypes.BMP)) {
            return new BmpReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
