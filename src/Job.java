import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Job implements Comparable<Job> {
    private int priority;
    private String description;
    public Job(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Job{" + "priority=" + priority + ", description='" +
                description + '\'' + '}';
    }
    @Override
    public int compareTo(Job o) {
        if(priority == o.priority)
            return 0;
        else if(priority < o.priority)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        Job o1 = new Job(4, "Zrobić pranie");
        Job o2 = new Job(2, "Odśnieżyć podjazd");
        Job o3 = new Job(8, "Nakarmić kota");
        Job o4 = new Job(1, "Umyć podłogę");
        Job o5 = new Job(7, "Zrobić obiad");
        Job o6 = new Job(4, "Sprawdzić maila");
        Job o7 = new Job(9, "Zrobić kawę");
        Job o8 = new Job(6, "Odkurzyć");
        Job o9 = new Job(9, "Pobawić się z kotem");
        Job o10 = new Job(6, "Przebrać pościel");
        List<Job> lista = new ArrayList<Job>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);
        lista.add(o6);
        lista.add(o7);
        lista.add(o8);
        lista.add(o9);
        lista.add(o10);
        Collections.sort(lista);
        for(Job x : lista){
            System.out.println(x);
        }
    }
}