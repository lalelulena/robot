public class RobotRace {
    public static void main(String[] args) {
        Robot alpha = new Robot("Alpha");
        Robot beta = new Robot("Beta");

        while (alpha.hasBattery() || beta.hasBattery()) {
            if (alpha.hasBattery()) {
                alpha.runStep();
            }
            if (beta.hasBattery()) {
                beta.runStep();
            }
        }

        System.out.println("Wettrennen beendet.");
        if (alpha.getDistance() > beta.getDistance()) {
            System.out.println("🎉 " + alpha.getName() + " gewinnt!");
        } else if (beta.getDistance() > alpha.getDistance()) {
            System.out.println("🎉 " + beta.getName() + " gewinnt!");
        } else {
            System.out.println("🤝 Es ist ein Unentschieden!");
        }

    }
}