package service.user;

import data.Student;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentService implements DataService<Student>{
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public Student findStudentById(int id) { 
        return studentRepository.findById(id);        
    }
    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    @Override
    public void create(Student user) {
        WriterToTxt.write(user);        
    }

    @Override
    public Student read(Student user) {
        return ReaderFromTxt.read(user);
    }
    
}
