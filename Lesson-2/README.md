1.Создали data и классы User, Student, Teacher

2. Сщздали util и ReaderFromTxt, WriterToTxt

3. Создали service, интерфейс DataService и имплементируйющий класс StudentServiceImpl 

4. создать package - view.
2.2 Создать абстрактный класс UserView, содержащий в себе метод vоid showTheBest(), принимать в себя лист из Userов.
Внутри себя он должен вызывать абстрактный метод FindTheBest(List(User) userList) и распечатывающий результат
2.3 Создать класс StudentView, унаследованный UserView, который в себе будет определять метод FindTheBest()

5. Создать package - controller
3.2. Сщздать класс Controller сщдержащий в себе необходимые интерфейсы в виде переменных, а в конструкторе создаем обьекты конкретных реалий.
3.3 Создаем метод createStudent(Student student) - реализующий логику, путем вызова соответствующих методов интерфейсов:
  - Создания студента 
  - Записи в файл студента
  - Чтения того, что записали
  - Возвращаем в методе то, что прочли в файле 
Домашка: 
Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и Преподавателя из файла txt (реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.

СТАНДАРТНЫЕ ИНТЕРФЕЙСЫ
1.1. Создать класс StudentGroupIterator, заставив его реализовывать интерфейс Iterator<Student>
1.2. Реализовать его абстрактные методы
1.3. Реализовать метод remove()

2.1 модифицировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
2.2 Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
2.3 модифицировать класс StudentGroupServiseImpl, добавив в него метод удаления студента по фио
3.3 модифицировать класс Controller, добавив в него метод удаления студента и вызывать в нем созданный метод из StudentGroupServiseImpl

3.1 Модифицировать класс Student, реализовывать интерфейс Comparable
3.2 Реализовать контракт compareTo() со сравнением по году рождения студента
3.3 модифицировать класс StudentgroupServiceImpl, добавив в него метод сортировки списка студентов
3.4 модифицировать класс Controller, добавив в него метод сортировки списка студентов и вызывать в нем созданный метод из StudentgroupServiceImpl

4.1 Создать класс UserComparator реализующий интерфейс Comparator<User>
4.2 Реализовать контракт compareTo() со сравнением по ФИО
4.3 Модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов по ФИО
4.4 модифицировать класс Controller, добавив в него метод сортировки списка студентов по ФИО и вызывать в нем созданный метод из StudentgroupServiceImpl

Обобщения
1. Создать пакет repository
1.1 Реализовать в нем интерфейс Repository<E, I>
1.2 Задать в созданном интерфейсе 2 абстрактных метода save(E entity); findById(I id);
1.3 Создать класс GroupRepository имплементировав его от созданного интерфейса

2. Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
2.2 В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
2.3 В классе StudentGroupServiceImpl реализовать методы сохранения группы и поиска ее по номеру

3.1. Создать интерфейс UserRepository<U extends User,I>, унаследовав его от repository<E,I>
3.2 В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio(String fio)
3.3 Создать класс StudentRepository имплементировав интерфейс UserRepository

4.1 создать класс StudentRepository имплементировав интерфейс UserRepository <Student, Integer>
4.2 В классе StudentService добавить новую переменную StudentRepository
4.3 В классе StudentService реализовать методы сохранения студента и его поиска по id и фио

static <T extends Comparable<T>>//дженеризируем метод, маска с интерфейсами задается здесь, словом extends// List<T> sortList(List<T> list){ 
  Collections.sort(list);
  return list;
} // метод принимает список обьектов, наследующих Comparable и сортирует их

Домашка 4:
Реализовать класc TeacherRepository (обобщение на ваше усмотрение)
Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User
Реализовать методы поиска и сохранения в классе TeacherService
Реализовать как можно более обобщенный интерфейс Controller
Создать классы StudentController, TeacherController, GroupController с методами сохранения и поиска соответствующих объектов
* Реализовать такой же функционал для класса GroupStream

Семинар 5:
1.1 Создать пекедж terminal. Дальнейшие работы ведем в нем.
1.2 Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand).
1.3 Создать класс TerminalReader, который содержит переменную CommandParser и метод, который в бесконечном цикле слушает команды с помощью Scanner(System.in).
2.1 Сделать класс TerminalReader синглтоном.
2.2 Создать интерфейс CommandExecutable с абстрактным методом execute().
2.3 Реализовать 2 класса, имплементировав созданный интерфейс, CreateStudentExecutable и DeleteStudentExecutable. В унаследованных методах они должны обращаться к методам класса StudentService.
Подумать какие переменные могли бы содержать созданные классы.
Создать класс CommandExecutableFactory.
Реализовать в нем метод CommandExecutable create(String[] input), где в зависимости от переданных параметров создается тот или иной класс.
Использовать этот класс и метод в классе TerminalReader.

Домашка:
Реализовать команды для терминального клиента: удалить студента по имени удалить студента по номеру группы и возрасту.
Продумать логику отображения результата выполнения команды