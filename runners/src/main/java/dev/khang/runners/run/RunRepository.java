package dev.khang.runners.run;

import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    public List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Monday Run", LocalDateTime.now(), LocalDateTime.now().plus(30, ChronoUnit.MINUTES), 3, Location.OUTDOOR));
        runs.add(new Run(2, "Wednesday Afternoon Run", LocalDateTime.now(), LocalDateTime.now().plus(60, ChronoUnit.MINUTES), 6, Location.INDOOR));
    }

}
