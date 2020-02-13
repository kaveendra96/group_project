package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.commands.TeacherForm;
import lk.cmb.ucsc.drivingschool.converters.TeacherFormToTeacher;
import lk.cmb.ucsc.drivingschool.model.Teacher;
import lk.cmb.ucsc.drivingschool.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;
    private TeacherFormToTeacher teacherFormToTeacher;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository, TeacherFormToTeacher teacherFormToTeacher) {
        this.teacherRepository = teacherRepository;
        this.teacherFormToTeacher = teacherFormToTeacher;
    }


    @Override
    public List<Teacher> listAll() {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepository.findAll().forEach(teachers::add);
        return teachers;
    }

    @Override
    public Teacher getById(String id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher saveOrUpdate(Teacher teacher) {
        teacherRepository.save(teacher);
        return teacher;
    }

    @Override
    public void delete(String id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher saveOrUpdateTeacherForm(TeacherForm teacherForm) {
        Teacher savedTeacher = saveOrUpdate(teacherFormToTeacher.convert(teacherForm));

        System.out.println("Saved Teacher Id: " + savedTeacher.getId());
        return savedTeacher;
    }
}
