package lk.cmb.ucsc.drivingschool.converters;

import lk.cmb.ucsc.drivingschool.commands.TeacherForm;
import lk.cmb.ucsc.drivingschool.model.Teacher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class TeacherToTeacherForm implements Converter<Teacher, TeacherForm> {
    @Override
    public TeacherForm convert(Teacher teacher) {
        TeacherForm teacherForm = new TeacherForm();
        teacherForm.setId(teacher.getId().toHexString());
        teacherForm.setName(teacher.getName());
        teacherForm.setCompetence(teacher.getCompetence());
        teacherForm.setAttendence(teacher.getAttendence());
        teacherForm.setComment(teacher.getComment());
        return teacherForm;
    }
}
