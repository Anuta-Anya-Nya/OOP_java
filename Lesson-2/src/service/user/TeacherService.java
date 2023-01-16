package service.user;

import data.Teacher;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherService implements DataService<Teacher>{
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public void saveTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public Teacher findTeacherById(int id) { 
        return teacherRepository.findById(id);        
    }
    public Teacher findTeacherByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }
    @Override
    public void create(Teacher user) {
        WriterToTxt.write(user);
    }
    
    
}
