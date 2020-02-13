package lk.cmb.ucsc.drivingschool.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {
    @Id
    private ObjectId _id;
    private String name;
    private String competence;
    private String attendence;
    private String comment;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getAttendence() {
        return attendence;
    }

    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
