package lk.cmb.ucsc.drivingschool.converters;

import lk.cmb.ucsc.drivingschool.commands.TeacherForm;
import lk.cmb.ucsc.drivingschool.model.Teacher;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
public class TeacherFormToTeacher implements Converter<TeacherForm, Teacher> {

    @Override
    public Teacher convert(TeacherForm teacherForm) {
        Teacher teacher = new Teacher();
        if (teacherForm.getId() != null  && !StringUtils.isEmpty(teacherForm.getId())) {
            teacher.setId(new ObjectId(teacherForm.getId()));
        }
        teacher.setName(teacherForm.getName());
        teacher.setCompetence(teacherForm.getCompetence());
        teacher.setAttendence(teacherForm.getAttendence());
        teacher.setComment(teacherForm.getComment());
        return teacher;
    }
}
