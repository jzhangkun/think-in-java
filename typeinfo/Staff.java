package typeinfo;

import java.util.ArrayList;

/**
 * Created by jzhangkun on 23/05/2017.
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }
    public void add(String... titles) {
        for(String title: titles)
            add(new Position(title));
    }
    public Staff(String... titles) {
        add(titles);
    }
    public boolean positionAvailable(String title) {
        for(Position position: this)
            if (position.getTitle().equals(title) &&
                position.getPerson() == Person.NULL) {
                return true;
            }
        return false;
    }
    public void fillPosition(String title, Person hire) {
        for(Position position: this) {
            if (position.getTitle().equals(title) &&
                position.getPerson() == Person.NULL) {
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("CEO", "CTO", "CMO", "PM", "PL",
            "Software Engineer", "Software Engineer", "Software Engineer",
            "Test Engineer", "Techincal Writer"
        );
        staff.fillPosition("CTO", new Person("Kun", "Zhang", "SH"));
        staff.fillPosition("PL", new Person("Janet", "Planner", "EU"));
        if (staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "USA"));

        System.out.println(staff);
    }
}
