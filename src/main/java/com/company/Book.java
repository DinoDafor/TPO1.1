package com.company;

public class Book {

    private String name, author, style;
    private int badWords;

    public Book(String name, String author, String style, int badWords) {
        this.name = name;
        this.author = author;
        this.style = style;
        this.badWords = badWords;
    }

    public String rateHighStyle() {
        if (badWords < 0) {
            throw new ArithmeticException();
        }
        if (this.badWords > 5 && this.badWords <= 10) {
            this.setStyle("Medium level");
            return this.getStyle();
        } else if (this.badWords > 10) {
            this.setStyle("Low level");
            return this.getStyle();
        } else {
            this.setStyle("High level");
            return this.getStyle();
        }
    }

    public int upMood(Human human) {
        if (this.getStyle().equals("Low level") ||
                this.getStyle().equals("Medium level")) {
            human.setMood(human.getMood()+1);
        }
        return human.getMood();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getBadWords() {
        return badWords;
    }

    public void setBadWords(int badWords) {
        this.badWords = badWords;
    }
}
