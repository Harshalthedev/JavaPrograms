import java.util.ArrayList;
import java.util.List;

class leetArr163 {
    private List<String> history = new ArrayList<>(); 
    private int ptr = -1;
    public leetArr163(String homepage) {
        // history = new ArrayList<>();
        // ptr = 0;
        history.add(homepage);
        ptr++;
    }
    
    public void visit(String url) {
        if (history.size()-1 == ptr) {
            history.add(url);
        }
        else {
            history = history.subList(0, ptr+1);
            history.add(url);
        }
        ptr++;
    }
    
    public String back(int steps) {
        if (ptr < steps) {
            ptr = 0;
            return history.get(ptr);
        }
        ptr = ptr - steps;
        return history.get(ptr);
    }
    
    public String forward(int steps) {
        if (ptr + steps > history.size()-1) {
            ptr = history.size()-1;
            return history.get(ptr);
        }
        ptr = ptr + steps;
        return history.get(ptr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */