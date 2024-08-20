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

        @Column(name = "title")
        private String title;

        @Column(name = "code")
        private Long code;

        @Column(name = "description")
        private String description;





}
