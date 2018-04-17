package tech.tablesaw.js.plotly.components;

public interface Trace {

    /**
     * Returns a string that can be used to display the trace in a browser
     * @param i     A unique number for this trace in the enclosing figure
     * @return      A string that can be rendered in javascript
     */
    public String asJavascript(int i);

}
