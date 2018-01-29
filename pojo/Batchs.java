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
 * Batchs generated by hbm2java
 */
@Entity
@Table(name="batchs"
    ,catalog="onlinexm"
)
public class Batchs  implements java.io.Serializable {


     private Integer batchId;
     private Integer batchNo;
     private Integer seatLimit;
     private Set studentses = new HashSet(0);

    public Batchs() {
    }

    public Batchs(Integer batchNo, Integer seatLimit, Set studentses) {
       this.batchNo = batchNo;
       this.seatLimit = seatLimit;
       this.studentses = studentses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="batch_id", unique=true, nullable=false)
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="batch_no")
    public Integer getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    
    @Column(name="seat_limit")
    public Integer getSeatLimit() {
        return this.seatLimit;
    }
    
    public void setSeatLimit(Integer seatLimit) {
        this.seatLimit = seatLimit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="batchs")
    public Set getStudentses() {
        return this.studentses;
    }
    
    public void setStudentses(Set studentses) {
        this.studentses = studentses;
    }




}


