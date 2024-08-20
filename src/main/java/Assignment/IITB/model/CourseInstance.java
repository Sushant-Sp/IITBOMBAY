package Assignment.IITB.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseInstance {

private Long id;
   private int year;
    private int semester;
    private Long course_id;

}
