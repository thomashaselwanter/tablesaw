package tech.tablesaw.js.plotly.components;

public abstract class TraceBuilder {

    AbstractTrace.Visibility visible = AbstractTrace.Visibility.TRUE;

    /**
     * Determines whether or not an item corresponding to this trace is shown in the legend.
     */
    boolean showLegend;

    /**
     * Sets the legend group for this trace. Traces part of the same legend group hide/show at the same time
     * when toggling legend items.
     */
    String legendGroup;

    /**
     * Sets the opacity of the trace.
     */
    double opacity; // number between or equal to 0 and 1


    /**
     * Sets the trace name. The trace name appear as the legend item and on hover.
     */
    String name;

    /**
     * Assigns id labels to each datum. These ids for object constancy of data points during animation.
     * Should be an array of strings, not numbers or any other type.
     */
    String[] ids;

    HoverLabel hoverLabel;

    double[] x;

    double[] y;

    public TraceBuilder() {}

    protected abstract String getType();

}
