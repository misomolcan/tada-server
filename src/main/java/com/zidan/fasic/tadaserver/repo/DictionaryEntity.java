package com.zidan.fasic.tadaserver.repo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dictionary", schema = "tada", catalog = "")
public class DictionaryEntity {
    private int id;
    private String abbreviation;
    private String explanation;
    private String notes;
    private String status;
    private Timestamp inserted;
    private long hitcount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Basic
    @Column(name = "explanation")
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "inserted")
    public Timestamp getInserted() {
        return inserted;
    }

    public void setInserted(Timestamp inserted) {
        this.inserted = inserted;
    }

    @Basic
    @Column(name = "hitcount")
    public long getHitcount() {
        return hitcount;
    }

    public void setHitcount(long hitcount) {
        this.hitcount = hitcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryEntity that = (DictionaryEntity) o;
        return id == that.id &&
                hitcount == that.hitcount &&
                Objects.equals(abbreviation, that.abbreviation) &&
                Objects.equals(explanation, that.explanation) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(status, that.status) &&
                Objects.equals(inserted, that.inserted);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, abbreviation, explanation, notes, status, inserted, hitcount);
    }
}
