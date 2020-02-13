package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.commands.TeacherForm;
import lk.cmb.ucsc.drivingschool.model.Teacher;

import java.util.List;


public interface TeacherService {

    List<Teacher> listAll();

    Teacher getById(String id);

    Teacher saveOrUpdate(Teacher teacher);

    void delete(String id);

    Teacher saveOrUpdateTeacherForm(TeacherForm teacherForm);
}
