public class Article {
    private String link, headline, category, date, author, description;

    public Article(String link, String headline, String category, String date, String author, String description) {
        this.link = link;
        this.headline = headline;
        this.category = category;
        this.date = date;
        this.author = author;
        this.description = description;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Link: " + link + "\nHeadline: " + headline + "\nDescription: " + description;
    }
    public static void main(String[] args) {
        Article article = new Article("http://example.com", "Sample Headline", "News", "2024-06-01", "John Doe", "This is a sample description.");
        System.out.println(article.toString());
    }
}
