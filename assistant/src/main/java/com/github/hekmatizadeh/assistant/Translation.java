package com.github.hekmatizadeh.assistant;

import java.util.Date;

/**
 * @author bahman
 */
public class Translation {
    private String sentence;
    private String sentenceTranslation;
    private Date timestamp;
    private String username;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentenceTranslation() {
        return sentenceTranslation;
    }

    public void setSentenceTranslation(String sentenceTranslation) {
        this.sentenceTranslation = sentenceTranslation;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
