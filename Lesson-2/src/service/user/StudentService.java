package service.user;

import data.Student;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentService implements DataService<User>{
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
        
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
        
    }
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public Student findStudentById(int id) { //Integer без надобности лучше не использовать
        return studentRepository.findById(id);        
    }
    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
    
}
