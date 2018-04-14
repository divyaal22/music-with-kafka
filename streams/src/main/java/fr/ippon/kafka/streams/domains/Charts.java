package fr.ippon.kafka.streams.domains;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Charts implements Iterable<Chart> {

    private final TreeSet<Chart> chartset = new TreeSet<>();

    public Charts(List<Chart> charts) {
        chartset.addAll(charts);
    }

    public void add(Chart chart) {
        chartset.add(chart);
    }

    public void remove(Chart chart) {
        chartset.remove(chart);
    }

    @Override
    public Spliterator<Chart> spliterator() {
        return chartset.spliterator();
    }

    @Override
    public Iterator<Chart> iterator() {
        return chartset.iterator();
    }

    public Iterator<Chart> getChartset() {
        return chartset.iterator();
    }

    public Stream<Chart> toStream() {
        return chartset.stream();
    }

}
