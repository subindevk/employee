package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id",insertable = false,updatable = false)
    private Long Id;

    @Column(name = "Department_id")
    private String Department_id;


    public Department() {

    }

    public Department(String Department_id, Long id) {
        super();
        this.id = id;
        this.Department_id = Department_id;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDepartment_id() {
        return Department_id;
    }
    public void setDepartment_id(String Department_id) {
        this.Department_id = Department_id;
    }
}
