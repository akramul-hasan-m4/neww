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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Books generated by hbm2java
 */
@Entity
@Table(name="books"
    ,catalog="onlinexm"
)
public class Books  implements java.io.Serializable {


     private Integer booksId;
     private Courses courses;
     private String booksName;
     private Set chapterses = new HashSet(0);
     private Set questionBanks = new HashSet(0);
     private Set questionerDefinations = new HashSet(0);

    public Books() {
    }

    public Books(Courses courses, String booksName, Set chapterses, Set questionBanks, Set questionerDefinations) {
       this.courses = courses;
       this.booksName = booksName;
       this.chapterses = chapterses;
       this.questionBanks = questionBanks;
       this.questionerDefinations = questionerDefinations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="books_id", unique=true, nullable=false)
    public Integer getBooksId() {
        return this.booksId;
    }
    
    public void setBooksId(Integer booksId) {
        this.booksId = booksId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="course_id")
    public Courses getCourses() {
        return this.courses;
    }
    
    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    
    @Column(name="books_name", length=45)
    public String getBooksName() {
        return this.booksName;
    }
    
    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="books")
    public Set getChapterses() {
        return this.chapterses;
    }
    
    public void setChapterses(Set chapterses) {
        this.chapterses = chapterses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="books")
    public Set getQuestionBanks() {
        return this.questionBanks;
    }
    
    public void setQuestionBanks(Set questionBanks) {
        this.questionBanks = questionBanks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="books")
    public Set getQuestionerDefinations() {
        return this.questionerDefinations;
    }
    
    public void setQuestionerDefinations(Set questionerDefinations) {
        this.questionerDefinations = questionerDefinations;
    }




}

