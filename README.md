# Learning Spring and Spring Boot

Aspiring Java Backend Developer with a strong foundation in Java, object-oriented programming, and database management. Passionate about building scalable and efficient web applications using Spring Boot, REST APIs, and microservices architecture. Seeking to enhance expertise in backend development, cloud deployment, and security best practices while contributing to innovative software solutions.

## 1. Spring-Demo
- **Understanding The Concept of Spring Framework**:
    - IOC.
    - Beans and how to manage its attributes.
    - Understanding XML configuration files.
    - Adding Spring Dependency.
    - The Dependency Injection Concept.

## 2. Spring-Boot Quick Start
- **Using Annotations**:
    - `@Component`: Marks a Java class as a Spring-managed component. Used to indicate that the class is a candidate for auto-detection during classpath scanning.
    - `@Autowired`: Automatically injects a bean (object) into a class. It simplifies dependency injection.
    - `@Qualifier(name_class)`: Used with `@Autowired` to specify which bean to inject when multiple beans of the same type exist.
    - `@Primary`: Marks a bean as the primary candidate for autowiring when multiple beans of the same type are available.
    - `@Controller`: Marks a class as a web controller, capable of handling HTTP requests.
    - `@RestController`: A specialized version of `@Controller` that combines `@Controller` and `@ResponseBody`, making it easier to create RESTful APIs.
    - `@Service`: Indicates that a class contains business logic. It is used to define service layer components.
    

## 3. Spring-Boot without Database
- Create list of product and do CRUD Operation On it.
- I exported the postman Collection o it.
- know the the Archticture of Project Files.

## 4. Spring-Boot Connected to MYSQL Database

- **Leaning other Annotations**:
    - `@Repository`: Marks a class as a data access layer and    makes it eligible for Spring DataException translation.
    - `@RequestMapping`: Maps HTTP requests to handler methods of MVC and REST controllers.
    - `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: Specialized annotations for mapping HTTP methods (GET, POST, PUT, DELETE) to specific methods.
    
## 5. Spring-Security

- **Leaning other Annotations**:
    - `@Configuration`: Indicates that a class contains Spring bean definitions and configuration.
    - `@Bean`: Marks a method as a bean producer to create and configure Spring-managed beans.
    - `@Value`: Injects values into fields, typically from properties or environment variables.
    - `@Scope`: Defines the scope of a bean (e.g., singleton, prototype).
