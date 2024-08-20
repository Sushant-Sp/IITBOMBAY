package Assignment.IITB.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course_instance")
public class CourseInstanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instance_id")
    private Long id;

    @Column(name = "year")
    private int year;
    @Column(name = "semester")
    private int semester;

    @Column(name = "course_id")
    private Long course_id;

    @ManyToOne
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    private CourseEntity course;


}
