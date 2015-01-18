package kata5;

/**
 *
 * @author Krystian Kurzawa
 */

public class Kata5 {

    public static void main(String[] args) {
        MockMailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(loader.load());
        Histogram<String> histogram = builder.build(new AttributeExtractor<Mail,String>() {

            @Override
            public String extract(Mail mail) {
                return mail.getDomain();
            }
        });
        HistogramViewer<String> viewer = new SwingHistogramViewer<>(histogram);
        viewer.show();
    }
}
