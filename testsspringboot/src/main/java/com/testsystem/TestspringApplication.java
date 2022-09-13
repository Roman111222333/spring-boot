package com.testsystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class TestspringApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestspringApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception{
//        return authenticationManagerBean();
//    }
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("swagger practice")).build();
//    }


    //		EmployeeRepository employeeRepository=context.getBean(EmployeeRepository.class);
//		Employee employee1=new Employee();
//		employee1.setEmployeeName("alsam");
//		employee1.setEmail("aslam23@gmail.com");
//		employee1.setPhone("03448966654");
//		employee1.setStatus(true);
//		employeeRepository.save(employee1);
    //System.out.println(employee2);
// update
//		Optional<Student> optional=studentRepository.findById(1);
//		Student student=optional.get();
//		student.setStudentName("rohail");
//		Student studentresult=studentRepository.save(student);
//		System.out.println(studentresult);

    //get data

    //	Iterable<Student> itr= studentRepository.findAll();
//        Iterator<Student> iterator=itr.iterator();
//		while (iterator.hasNext()){
//		    Student student=iterator.next();
//            System.out.println(student);
//        }
    //Update by lambda expression
//        itr.forEach(Student->{
//            System.out.println(Student);
//        });
    //Delete
    //studentRepository.deleteById(1);
}

