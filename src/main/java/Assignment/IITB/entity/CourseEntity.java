package Assignment.IITB.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class CourseEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "course_id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;





}
