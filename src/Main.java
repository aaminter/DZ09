public static void main(String[] args) {

    System.out.println("===== ЗАДАНИЕ 1: Пятницы месяца =====");

    int firstFriday = 3;

    for (int day = firstFriday; day <= 31; day += 7) {
        System.out.println("Сегодня пятница, " + day +
                "-е число. Необходимо подготовить отчет");
    }


    System.out.println("\n===== ЗАДАНИЕ 2: Марафон (do-while) =====");

    int totalDistance = 42195;
    int distance = 0;

    do {
        int remaining = totalDistance - distance;
        if (remaining < 0) remaining = 0;

        System.out.println("Держитесь! Осталось " + remaining + " метров");

        distance += 500;

    } while (distance <= totalDistance);


    System.out.println("\n===== ЗАДАНИЕ 2: Марафон (for) =====");

    for (int d = 0; d <= totalDistance; d += 500) {
        int remaining = totalDistance - d;
        if (remaining < 0) remaining = 0;

        System.out.println("Держитесь! Осталось " + remaining + " метров");
    }


    System.out.println("\n===== ЗАДАНИЕ 3: Парковка (while) =====");

    int budget = 1200;
    int day = 1;
    int remainingMoney = budget;
    int usedDaysWhile = 0;

    while (remainingMoney >= 100) {

        if (day % 5 == 0) {
            System.out.println("День " + day + " — бесплатно");
            day++;
            usedDaysWhile++;
            continue;
        }

        remainingMoney -= 100;

        System.out.println("День " + day +
                " — списано 100 ₽, осталось " + remainingMoney + " ₽");

        day++;
        usedDaysWhile++;
    }

    System.out.println("Итого дней (while): " + usedDaysWhile);


    System.out.println("\n===== ЗАДАНИЕ 3: Парковка (for) =====");

    int remainingMoneyFor = budget;
    int usedDaysFor = 0;

    for (int d = 1; remainingMoneyFor >= 100; d++) {

        if (d % 5 == 0) {
            System.out.println("День " + d + " — бесплатно");
            usedDaysFor++;
            continue;
        }

        remainingMoneyFor -= 100;

        System.out.println("День " + d +
                " — списано 100 ₽, осталось " + remainingMoneyFor + " ₽");

        usedDaysFor++;
    }

    System.out.println("Итого дней (for): " + usedDaysFor);


    System.out.println("\n===== ЗАДАНИЕ 5: Умная зарядка =====");

    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge < 100 && overheats <= 3) {

        minute++;

        if (minute % 10 == 0) {

            overheats++;

            System.out.println("🔥 Перегрев на минуте " + minute +
                    ". Всего: " + overheats);

            if (overheats > 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }

            minute += 2;
            continue;
        }

        charge += 2;
        if (charge > 100) charge = 100;

        System.out.println("Минутa " + minute + " → заряд: " + charge + "%");
    }

    System.out.println("Время зарядки составило " + minute + " минут");
}