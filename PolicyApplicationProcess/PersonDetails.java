package PolicyApplicationProcess;

import java.util.HashMap;
import java.util.List;

public class PersonDetails {
    protected int age ;
    protected String name;
    protected boolean driving_records ;
    protected int health_records;

    public PersonDetails(int age, String name, boolean driving_records, int health_records) {
        this.age = age;
        this.name = name;
        this.driving_records = driving_records;
        this.health_records = health_records;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isDriving_records() {
        return driving_records;
    }

    public int getHealth_records() {
        return health_records;
    }
}
