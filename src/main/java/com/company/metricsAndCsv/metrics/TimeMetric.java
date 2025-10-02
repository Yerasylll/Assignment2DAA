package com.company.metricsAndCsv.metrics;

public class TimeMetric {
    private long startTime;
    private long elapsedTime;

    public void start() {startTime = System.currentTimeMillis();}

    public void stop() {elapsedTime = System.currentTimeMillis() - startTime;}

    public void reset() {elapsedTime = 0;}

    public long getElapsedTime() {return elapsedTime;}
}
