package kata5;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class SwingHistogramViewer<T> extends HistogramViewer<T> {

    public SwingHistogramViewer(Histogram<T> histogram) {
        super(histogram);
    }

    @Override
    public void show() {
        ApplicationFrame frame = new ApplicationFrame("Histogram");
        frame.add(createChartPanel());
        frame.pack();
        frame.setVisible(true);
    }

    private ChartPanel createChartPanel() {
        ChartPanel panel = new ChartPanel(createChart());
        return panel;
    }

    private JFreeChart createChart() {
        JFreeChart chart = ChartFactory.createBarChart("Histogram", "Domains", "Count", createDataset());
        return chart;
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (T item : histogram.keySet())
            dataSet.addValue(histogram.get(item), "emails", (String)item);
        return dataSet;
    }

}
