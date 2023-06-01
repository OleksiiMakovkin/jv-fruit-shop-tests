package core.basesyntax.service.impl;

import core.basesyntax.service.Report;
import java.util.Map;

public class ReportImpl implements Report {

    private static final String TITLE = "fruit,quantity";

    @Override
    public String createReport(Map<String, Integer> fruits) {
        StringBuilder stringBuilder = new StringBuilder(TITLE);
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            stringBuilder
                    .append(System.lineSeparator())
                    .append(entry.getKey())
                    .append(",")
                    .append(entry.getValue());
        }
        return stringBuilder.toString();
    }
}
