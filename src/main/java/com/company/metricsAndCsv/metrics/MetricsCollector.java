package com.company.metricsAndCsv.metrics;

public class MetricsCollector {
    private final TimeMetric time = new TimeMetric();
    private final ComparisonMetric comparisons = new ComparisonMetric();
    private final SwapMetric swaps = new SwapMetric();
    private final AccessMetric accesses = new AccessMetric();

    public void reset() {
        time.reset();
        comparisons.reset();
        swaps.reset();
        accesses.reset();
    }

    public TimeMetric time() {return time;}
    public ComparisonMetric comparisons() {return comparisons;}
    public SwapMetric swaps() {return swaps;}
    public AccessMetric accesses() {return accesses;}
}
