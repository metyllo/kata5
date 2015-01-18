package kata5;

public abstract class HistogramViewer<T> {
    
    protected Histogram<T> histogram;

    public HistogramViewer(Histogram<T> histogram) {
        this.histogram = histogram;
    }
    
    public abstract void show();
    
}
