package pojo;

import lombok.Data;

@Data
public class User {

    String name;

    String job;

    public void User(String name, String job){
        this.name = name;
        this.job = job;
    }

}
