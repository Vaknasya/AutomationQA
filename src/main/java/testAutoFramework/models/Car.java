package testAutoFramework.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Car {
    String id;
    String name;
    String modelName;
    String wheels;
}
