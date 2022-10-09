package testAutoFramework.models;

public abstract class BaseModel {
    protected String name;
    protected Object obj;

    public BaseModel(Object obj, String name){
        this.obj = obj;
        this.name = name;
    }
}
