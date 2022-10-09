package testAutoFramework.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
}
    