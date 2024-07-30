//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Sotrudnik {
        private String fio;
        private String dolzhnost;
        private String email;
        private String telefon;
        private double zarplata;
        private int vozrast;

        public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
            this.fio = fio;
            this.dolzhnost = dolzhnost;
            this.email = email;
            this.telefon = telefon;
            this.zarplata = zarplata;
            this.vozrast = vozrast;
        }
        public void info() {
            System.out.println("ФИО: " + fio);
            System.out.println("Должность: " + dolzhnost);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + telefon);
            System.out.println("Зарплата: " + zarplata + " руб.");
            System.out.println("Возраст: " + vozrast + " лет");
            System.out.println("---------------------");
        }

        public static void main(String[] args) {
            Sotrudnik[] persArray = new Sotrudnik[5];
            persArray[0] = new Sotrudnik("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Sotrudnik("Петров Петр Петрович", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 35);
            persArray[2] = new Sotrudnik("Сидоров Сидор Сидорович", "Бухгалтер", "sidorov@mailbox.com", "892312314", 45000, 28);
            persArray[3] = new Sotrudnik("Кузнецов Кузьма Кузьмич", "Директор", "kuznetsov@mailbox.com", "892312315", 80000, 45);
            persArray[4] = new Sotrudnik("Федоров Федор Федорович", "Аналитик", "fedorov@mailbox.com", "892312316", 55000, 38);
            for (Sotrudnik sotrudnik : persArray) {
                sotrudnik.info();
            }
        }
    }

}