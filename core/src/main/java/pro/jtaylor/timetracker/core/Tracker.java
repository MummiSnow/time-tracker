package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    
    public final void add(TimeEntry entry) {
        entries.add(entry);
    }

    public final void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public final int size() {
        return entries.size();
    }

    public final TimeEntry get(int index) {
        return entries.get(index);
    }
}

