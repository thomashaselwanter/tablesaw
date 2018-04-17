package tech.tablesaw.js.plotly.components;

public class Layout {

    /**
     * Determines the mode of hover interactions.
     */
    public enum HoverMode {
        X,
        Y,
        CLOSEST,
        FALSE;
    }

    /**
     * Determines the mode of drag interactions.
     * "select" and "lasso" apply only to scatter traces with markers or text.
     * "orbit" and "turntable" apply only to 3D scenes.
     */
    public enum DragMode {
        ZOOM,
        PAN,
        SELECT,
        LASSO,
        ORBIT,
        TURNTABLE;
    }


    /**
     * The global font
     */
    private Font font = new Font();

    /*
     * The plot title
     */
    private String title = "";

    /**
     * Sets the title font
     */
    private Font titleFont = font;

    /**
     * Determines whether or not a layout width or height that has been left undefined by the user
     * is initialized on each relayout. Note that, regardless of this attribute, an undefined layout width or height
     * is always initialized on the first call to plot.
     */
    private boolean autoSize = false;

    /**
     * The width of the plot in pixels
     */
    private int width = 700;

    /**
     * The height of the plot in pixels
     */
    private int height = 450;

    /**
     * Sets the margins around the plot
     */
    private Margin margin;

    /**
     * Sets the color of paper where the graph is drawn.
     */
    private String paperBgColor = "#fff";

    /**
     * Sets the color of plotting area in-between x and y axes.
     */
    private String plotBgColor = "#fff";

    /**
     * Sets the decimal. For example, "." puts a '.' before decimals
     */
    private String decimalSeparator = ".";

    /**
     * Sets the separator. For example, a " " puts a space between thousands.
     */
    private String thousandsSeparator = ",";

    /**
     * Determines whether or not a legend is drawn.
     */
    private boolean showLegend = false;

    /**
     * Determines the mode of hover interactions.
     */
    private HoverMode hoverMode = HoverMode.FALSE;

    /**
     * Determines the mode of drag interactions. "select" and "lasso" apply only to scatter traces with markers or text.
     * "orbit" and "turntable" apply only to 3D scenes.
     */
    private DragMode dragMode = DragMode.ZOOM;

    /**
     * Sets the default distance (in pixels) to look for data to add hover labels
     * (-1 means no cutoff, 0 means no looking for data). This is only a real distance
     * for hovering on point-like objects, like scatter points. For area-like objects (bars, scatter fills, etc)
     * hovering is on inside the area and off outside, but these objects will not supersede hover on point-like
     * objects in case of conflict.
     */
    private int hoverDistance = 20; // greater than or equal to -1


}
