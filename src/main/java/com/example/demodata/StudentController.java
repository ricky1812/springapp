              package com.example.demodata;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.PostMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              import org.springframework.web.bind.annotation.PathVariable;
              import org.springframework.beans.factory.annotation.Autowired;
              import org.springframework.web.bind.annotation.RequestBody;
              import org.springframework.web.bind.annotation.PutMapping;
              import org.springframework.web.bind.annotation.DeleteMapping;


              import java.util.List;
              import java.util.Arrays;
              
              @SpringBootApplication
              @RestController

              
              public class StudentController {
                @Autowired
              private StudentService studentService;
                
                
                 

                   @GetMapping("/students")
                   public List<Student> GetAllStudents(){
                    return studentService.getAllStudents();
                      
                   }

                  @GetMapping("/students/{id}")
                   public Student GetStudent(@PathVariable String id){
                    return studentService.getStudent(id);
                   }

                   @PostMapping("/students")
                   public void AddStudent(@RequestBody Student student)
                   {
                    studentService.addStudent(student);
                   }

                   @PutMapping("/students/{id}")
                   public void UpdateStudent(@RequestBody Student student, @PathVariable String id)
                   {
                    studentService.updateStudent(id,student);
                   }

                   @DeleteMapping("/students/{id}")
                   public void DeleteStudent(@PathVariable String id)
                   {
                    studentService.deleteStudent(id);
                   }


                  
                  
                
              }
            