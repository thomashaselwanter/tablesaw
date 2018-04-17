package tech.tablesaw.js.plotly.components;

public class HoverLabel {

    /**
     * Sets the background color of all hover labels on graph
     */
    private String bgColor = "";

    /**
     * Sets the border color of all hover labels on graph.
     */
    private String borderColor = "";

    /**
     * Sets the default hover label font used by all traces on the graph.
     */
    private Font font;

    /**
     * Sets the default length (in number of characters) of the trace name in the hover labels for all traces.
     * -1 shows the whole name regardless of length. 0-3 shows the first 0-3 characters,
     * and an integer >3 will show the whole name if it is less than that many characters,
     * but if it is longer, will truncate to `namelength - 3` characters and add an ellipsis.
     */
    private int nameLength = 15;
}
