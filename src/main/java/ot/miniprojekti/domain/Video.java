package ot.miniprojekti.domain;

public class Video {

    private int id;
    private String title;
    private String comment;
    private String url;

    public Video(int id, String title, String url, String comment) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.comment = comment;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getComment() {
        return this.comment;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public String toString() {
        String s = title + "\nurl: " + url + "\nkommentti: " + comment + "\nid: " + id;
        return s;
    }
}
