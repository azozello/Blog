package classes;

public class Article {

    private int ID;
    private String title;
    private String text;

    public Article(int id, String title, String text) {
        this.ID = id;
        this.title = title;
        this.text = text;
    }
    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }
    public Article(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        return title != null ? title.equals(article.title) : article.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @Override
    public String toString() {
        return title+" "+text;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }

    public int getID() {
        return ID;
    }
}

