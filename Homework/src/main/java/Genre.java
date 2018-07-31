public enum Genre {
    HORROR("A misshaped book who learns to become braver over time."),
    FANTASY("A sassy book from the fantasy section."),
    ADVENTURE("A book who is also an adventurous, daring pirate.");

    private final String description;

    Genre(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
