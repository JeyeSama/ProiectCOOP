package reviews;

public class Review {
    private String reviewer;
    private String comment;

    public Review(String reviewer, String comment) {
        this.reviewer = reviewer;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review by " + this.reviewer + ": " + this.comment;
    }
}
