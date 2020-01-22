package kata3_20191023_0830;

public class Kata3_20191023_0830 {

    public static void main(String[] args) {
        Histogram<Integer> histogram = new Histogram<>();
        histogram.increment(34);
        histogram.increment(67);
        histogram.increment(34);
        histogram.increment(90);
        histogram.increment(34);
        histogram.increment(90);
        
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
    }
    
}
