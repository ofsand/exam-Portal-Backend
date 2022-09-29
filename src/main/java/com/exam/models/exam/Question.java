package com.exam.models.exam;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ques_id", nullable = false)
    private Long quesId;
    private String content;
    private String image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }
}
