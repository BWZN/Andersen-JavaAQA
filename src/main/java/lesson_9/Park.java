package lesson_9;

public class Park {
    public static class Attraction {
        private final String name;
        private final String workingHours;
        private final double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return  name + ", Рабочие часы = " + workingHours  + ", цена = " + price;
        }
    }

    private final Attraction[] attractions;
    private int cnt;

    public Park() {
        this.attractions = new Attraction[10];
        this.cnt = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (cnt < attractions.length) {
            attractions[cnt] = new Attraction(name, workingHours, price);
            cnt++;
        } else {
            System.out.println("Park is full");
        }
    }

    public void showAttractions() {
        for (int i = 0; i < cnt; i++) {
            System.out.println(attractions[i]);
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        park.addAttraction("Атракцион 1", "10:00 - 22:00", 100);
        park.addAttraction("Атракцион 2", "11:00 - 23:00", 200);
        park.addAttraction("Атракцион 3", "12:00 - 00:00", 300);

        park.showAttractions();
    }
}
