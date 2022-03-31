package homework_9.task_6;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class SecretFile{
public static BufferedImage ImageDownloader(String urlString){
        BufferedImage image = null;
        try {
        URL url = new URL(urlString.replace("https://i.ytimg.com/vi/Dp0S05PkswU/maxresdefault.jpg ","%20"));
        image = ImageIO.read(url);
        } catch (IOException e) {
        e.printStackTrace();
        }
        return image;
        }

}