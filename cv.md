# Vasili Urusov

## Contacts
- __Location__: Minsk, Belarus
- __Phone__: +375 29 778-48-36
- __Email__: uvd.1994@gmail.com
- __GitHub__: [uvde](https://github.com/uvde)

## About Me
Soft Skills | Description
:---: | ---
**Teamwork** | While working in a team I learned how to share information, help to resolve a problem, work towards common goals, interact with team members, being positive. I work well as a part of a team. 
**Leadership skills** | While working in my previous profession I was in charge of a brigade. I learned to be a good listener to delegate properly and manage the project. 
**Detail-oriented** | I strive for perfection in everything I do.  
**Enthusiasm and personal drive** | I am enthusiastic about what I do; completing tasks with excellence and always looking forward to the next one. I am passionate, driven and motivated. Diligent – I always work my best.
**Willingness to learn** | Being a young and energetic person, I am excited to learn as much as possible and grow in my field. 
**Time management and organizational skills** | Able to prioritize tasks and manage my time so that I can focus on my work and wellbeing in a single day. 
**Initiative** | I do not sit and wait for things to happen or common to me, I make things happen. 
**Ability to handle pressure and meet deadlines** | I easily work under pressure. Having faced many challenges throughout the years, I have improved my way of seeing problems in a more analytical and creative way which helped me to meet deadlines. 
**Flexibility** |  I am always ready for new ideas and soft tools.
**Punctuality and Reliability** |  I know how important it is not to let down your team so I am always on time for meetings and I am the person who you can rely on. 

## Skills

+ Java 8 
+ Spring Framework
+ SQL
   + PostgreSQL
   + MySQL
+ Git
+ Hibernate
   + JPA
   + JDBC
+ RESTful
+ HTML / CSS / JS
+ XML / JSON
+ Maven / Gradle
+ Apache Tomcat
+ Postman

Code Example
```
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentDTO> getStudents() {
        List<StudentDTO> listStudents = studentService.getAllStudents();
        return listStudents;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.createStudent(studentDTO);
    }

    @DeleteMapping("/student/{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping("/student/{updateID}")
    public void saveOrUpdate(@PathVariable("updateID") Long updateId, @RequestBody StudentDTO studentDTO){
        studentService.saveOrUpdate(updateId ,studentDTO);
    }
}
```

## Education

- **University**: Belarusian National Technical University, Civil Engineering
- **EPAM** : Java Web Development

## English

B1