package PolicyApplicationProcess;

import java.util.Scanner;

public class PolicyApplication {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are under 18 years ");
        } else {
            System.out.println("valid age ");
        }
    }

    static void drivingValidation(boolean violate) throws PoorDrivingRecordException {
        if (!true)
            throw new PoorDrivingRecordException("Driving records are not up to the mark!.. ");
        else
            System.out.println("valid driving records");
    }

    static void healthValidation(int health_issues) throws HealthIssueException {
        if (health_issues >= 3)
            throw new HealthIssueException("You have Several Health issues");
        else
            System.out.println("valid health records");
    }

    static boolean validationProcess(int age, boolean driving_record, int health_issues) {
        boolean valid = false;
        try {
            validateAge(age);
            valid = true;

        } catch (Exception e) {

            System.out.println(e);
            valid = false;
        }
        try {
            drivingValidation(driving_record);
            valid = true;

        } catch (Exception e) {
            System.out.println(e);
            valid= false;
        }
        try {
            healthValidation(health_issues);
            valid = true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


        return valid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = true;


        while (exit) {
            System.out.println("1. Check issuance ");
            System.out.println("2. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter you age");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter your name");
                    String name = input.nextLine();
//                    input.nextLine();
                    System.out.println("Driving records true/false ");
                    boolean driving_records = input.nextBoolean();
                    System.out.println("no of Health Issues ");
                    int health_records = input.nextInt();
                    PersonDetails p1 = new PersonDetails(age, name, driving_records, health_records);

                    try {
                        boolean validation = validationProcess(p1.age, p1.driving_records, p1.health_records);
//            validationProcess(p2.age, p2.driving_records, p2.health_records);
                        if (validation != false)
                            System.out.println(p1.getName() + " Policy will be issued ");
                        else
                            System.out.println(p1.getName() + " Policy cannot be issued ");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
                case 2 -> {
                    System.out.println("Terminating...........");
                    exit = false;

                }
            }
        }


    }
}
