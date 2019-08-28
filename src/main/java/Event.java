/** Task to represent an event. */
class Event extends Task {

    protected String date;

    public Event(String name, String date) {
        super(name);
        this.date = date;
    }

    @Override
    public String toString() {
        String doneStr = this.done ? "✓" : "✗";
        return String.format("[E][%s] %s (at: %s)", doneStr, this.name, this.date);
    }
}