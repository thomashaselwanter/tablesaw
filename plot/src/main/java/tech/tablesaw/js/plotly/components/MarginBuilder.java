package tech.tablesaw.js.plotly.components;

public class MarginBuilder {
    /**
     * The left margin, in px
     */
    int left = 80;

    /**
     * The right margin, in px
     */
    int right = 80;

    /**
     * The top margin, in px
     */
    int top = 100;

    /**
     * The bottom margin, in px
     */
    int bottom = 80;

    /**
     * The amount of padding between the plotting area and the axis lines, in px
     */
    int pad = 0;

    boolean autoExpand = true;

    MarginBuilder() {}

    public MarginBuilder top(int top) {
        this.top = top;
        return this;
    }

    public MarginBuilder bottom(int bottom) {
        this.bottom = bottom;
        return this;
    }

    public MarginBuilder left(int left) {
        this.left = left;
        return this;
    }

    public MarginBuilder right(int right) {
        this.right = right;
        return this;
    }

    public MarginBuilder padding(int padding) {
        this.pad = padding;
        return this;
    }

    public MarginBuilder autoExpand(boolean autoExpand) {
        this.autoExpand = autoExpand;
        return this;
    }

    public Margin build() {
        return new Margin(this);
    }
}
