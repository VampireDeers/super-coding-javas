package exercise.chapter_56;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIoTest {

    public static void main(String[] args){

        // 이미지 파일 경로
        String filePath = "src/exercise/chapter_56/Oak.png";

        try {
            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);

            // 이미지 회전
            BufferedImage rotatedImage = rotateImage(image, 90);

            // 변환된 이미지 저장
            String outputFilePath = "src/exercise/chapter_56/Oak2.png";
            ImageIO.write(rotatedImage, "png", new File(outputFilePath));

            System.out.println("이미지 파일이 만들어졌습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    // 미리 만들기
    private static BufferedImage rotateImage(BufferedImage image, double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));

        int width = image.getWidth();
        int height = image.getHeight();

        int newWidth = (int) Math.round(width * cos + height * sin);
        int newHeight = (int) Math.round(height * cos + width * sin);

        BufferedImage rotatedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = rotatedImage.createGraphics();

        graphics.translate((newWidth - width) / 2, (newHeight - height) / 2);
        graphics.rotate(radians, width / 2, height / 2);
        graphics.drawRenderedImage(image, null);
        graphics.dispose();

        return rotatedImage;
    }
}
