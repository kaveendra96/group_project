package lk.cmb.ucsc.drivingschool.repo;

import lk.cmb.ucsc.drivingschool.model.Teacher;
import org.springframework.data.repository.CrudRepository;


public interface TeacherRepository extends CrudRepository<Teacher, String> {
}
