package tech.tablesaw.js.plotly.components;

public class Font {

    /**
     * HTML font family - the typeface that will be applied by the web browser.
     * The web browser will only be able to apply a font if it is available on the system which it operates.
     * Provide multiple font families, separated by commas, to indicate the preference in which to apply fonts
     * if they aren't available on the system. The plotly service (at https://plot.ly or on-premise) generates
     * images on a server, where only a select number of fonts are installed and supported.
     * These include "Arial", "Balto", "Courier New", "Droid Sans",, "Droid Serif", "Droid Sans Mono", "Gravitas One",
     * "Old Standard TT", "Open Sans", "Overpass", "PT Sans Narrow", "Raleway", "Times New Roman".
     */
    public enum Family {
        OPEN_SANS,
        VERDANA,
        ARIAL,
        SANS_SERIF;
    }

    private Family fontFamily = Family.OPEN_SANS;

    private int size = 12; // number greater than or equal to 1

    private String color = "#444";


}
