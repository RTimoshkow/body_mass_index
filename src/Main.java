public class Main {
    public static void main(String[] args) {
        // Дисклеймер! Программа не несет в себе цели, кого нибудь оскорбить. Все сказанное в ней шутка.

        BmiService service = new BmiService();
        double bmi = service.calculate(110, 1.82);
        if (bmi <= 16) {
            System.out.println("Ваш индекс = " + bmi + " Вы дрыщ! Пойдите поешьте");
        }
        if (bmi > 16 && bmi <= 18.5) {
            System.out.println("Ваш индекс = " + bmi + " Вы все еще дрыщ!");
        }
        if (bmi > 18.5 && bmi <= 24.99) {
            System.out.println("Ваш индекс = " + bmi + " Норма... Для офисного планктона");
        }
        if (bmi >= 25 && bmi <= 30) {
            System.out.println("Ваш индекс = " + bmi + " Поздравляю! Вы начинаете походить на нормального человека;)");
        }
        if (bmi > 30 && bmi <= 35) {
            System.out.println("Ваш индекс = " + bmi + " А ты хорош!");
        }
        if (bmi > 35 && bmi <= 40) {
            System.out.println("Ваш индекс = " + bmi + " Слушай, может уже хватит жрать по ночам?");
        }
        if (bmi > 40) {
            System.out.println("Ваш индекс = " + bmi + " ЗАБЕРИТЕ КТО НИБУДЬ У НЕГО ТАРЕЛКУ!!!");
        }
    }
}
