package service.user;

import data.Teacher;
import data.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherService implements DataService<User>{
    private TeacherRepository teacherRepository;

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }
    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
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
    
}
