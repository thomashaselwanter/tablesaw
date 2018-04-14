package tech.tablesaw.js.display;
import java.awt.Desktop;
import java.net.URI;

public class Plot {

    public static void main(String[] args) throws Exception {


        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI("http://www.example.com"));
        }

    }
}
