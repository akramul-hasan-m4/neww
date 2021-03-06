package pojo;
// Generated Jan 30, 2018 1:20:41 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Courses generated by hbm2java
 */
@Entity
@Table(name="courses"
    ,catalog="onlinexm"
)
public class Courses  implements java.io.Serializable {


     private Integer courseId;
     private String courseName;
     private Set references = new HashSet(0);
     private Set bookses = new HashSet(0);
     private Set exams = new HashSet(0);
     private Set questionerDefinations = new HashSet(0);
     private Set questionBanks = new HashSet(0);

    public Courses() {
    }

    public Courses(String courseName, Set references, Set bookses, Set exams, Set questionerDefinations, Set questionBanks) {
       this.courseName = courseName;
       this.references = references;
       this.bookses = bookses;
       this.exams = exams;
       this.questionerDefinations = questionerDefinations;
       this.questionBanks = questionBanks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="course_id", unique=true, nullable=false)
    public Integer getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    @Column(name="course_name", length=45)
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
    public Set getReferences() {
        return this.references;
    }
    
    public void setReferences(Set references) {
        this.references = references;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
    public Set getBookses() {
        return this.bookses;
    }
    
    public void setBookses(Set bookses) {
        this.bookses = bookses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
    public Set getExams() {
        return this.exams;
    }
    
    public void setExams(Set exams) {
        this.exams = exams;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
    public Set getQuestionerDefinations() {
        return this.questionerDefinations;
    }
    
    public void setQuestionerDefinations(Set questionerDefinations) {
        this.questionerDefinations = questionerDefinations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courses")
    public Set getQuestionBanks() {
        return this.questionBanks;
    }
    
    public void setQuestionBanks(Set questionBanks) {
        this.questionBanks = questionBanks;
    }




}


