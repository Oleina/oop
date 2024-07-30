import java.util.ArrayList;
import java.util.List;
public class park {
    private String name;
    private List<Attraction> attractions;

    public park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }
    public void addAttraction(String name, String workingHours, double cost) {
        attractions.add(new Attraction(name, workingHours, cost));
    }
    public void showAttractions() {
        System.out.println("Аттракционы в парке \"" + name + "\":");
        for (Attraction attraction : attractions) {
            attraction.info();
        }
    }
    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;
        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public void info() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        park park = new park("Развлекательный парк");
        park.addAttraction("Американские горки", "10:00 - 22:00", 300);
        park.addAttraction("Колесо обозрения", "09:00 - 23:00", 250);
        park.addAttraction("Водная горка", "11:00 - 20:00", 400);
        park.addAttraction("Поездка на паровозике", "10:00 - 19:00", 150);
        park.addAttraction("Скамейка для отдыха", "Открыта постоянно", 0);
        park.showAttractions();
    }
}

