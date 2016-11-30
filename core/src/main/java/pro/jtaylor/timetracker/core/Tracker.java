package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    
    /**
     * Add Method
     * @param TimeEntry to add to entries
     * /
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove Method
     * @param TimeEntry to remove from entries
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Size Method Method
     * @param int size for entries
     * /
    public int size() {
        return entries.size();
    }

    /**
     * Get Method
     * @param index for retrieving
     * /
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

