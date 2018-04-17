package tech.tablesaw.js.plotly.components;

public class LayoutBuilder {

    /**
     * The global font
     */
    Font font = new Font();

    /*
     * The plot title
     */
    String title = "";

    /**
     * Sets the title font
     */
    Font titleFont = font;

    /**
     * Determines whether or not a layout width or height that has been left undefined by the user
     * is initialized on each relayout. Note that, regardless of this attribute, an undefined layout width or height
     * is always initialized on the first call to plot.
     */
    boolean autoSize = false;

    /**
     * The width of the plot in pixels
     */
    int width = 700;

    /**
     * The height of the plot in pixels
     */
    int height = 450;

    /**
     * Sets the margins around the plot
     */
    Margin margin;

    /**
     * Sets the color of paper where the graph is drawn.
     */
    String paperBgColor = "#fff";

    /**
     * Sets the color of plotting area in-between x and y axes.
     */
    String plotBgColor = "#fff";

    /**
     * Sets the decimal. For example, "." puts a '.' before decimals
     */
    String decimalSeparator = ".";

    /**
     * Sets the separator. For example, a " " puts a space between thousands.
     */
    String thousandsSeparator = ",";

    /**
     * Determines whether or not a legend is drawn.
     */
    boolean showLegend = false;

    /**
     * Determines the mode of hover interactions.
     */
    Layout.HoverMode hoverMode = Layout.HoverMode.FALSE;

    /**
     * Determines the mode of drag interactions. "select" and "lasso" apply only to scatter traces with markers or text.
     * "orbit" and "turntable" apply only to 3D scenes.
     */
    Layout.DragMode dragMode = Layout.DragMode.ZOOM;

    /**
     * Sets the default distance (in pixels) to look for data to add hover labels
     * (-1 means no cutoff, 0 means no looking for data). This is only a real distance
     * for hovering on point-like objects, like scatter points. For area-like objects (bars, scatter fills, etc)
     * hovering is on inside the area and off outside, but these objects will not supersede hover on point-like
     * objects in case of conflict.
     */
    int hoverDistance = 20; // greater than or equal to -1


    public Layout build() {
        return new Layout(this);
    }

    public LayoutBuilder title(String title) {
        this.title = title;
        return this;
    }

    public LayoutBuilder height(int height) {
        this.height = height;
        return this;
    }
    public LayoutBuilder width(int width) {
        this.width = width;
        return this;
    }

}
