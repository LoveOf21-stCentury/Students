package study_group.view;

import study_group.presenter.Presenter;

import java.util.Scanner;


public class ConsoleUI implements View {
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private MainMenu menu;
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI() {
        menu = new MainMenu(this);
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    @Override
    public void start() {
        hello();
        while (work) {
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("You ended work");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentList() {
        presenter.getStudentList();
    }

    public void addStudent() {
        System.out.println("Enter name of student");
        String name = scanner.nextLine();
        System.out.println("Enter age of student");
        String strAge = scanner.nextLine();
        int age = Integer.parseInt(strAge);
        presenter.addStudent(name, age);
    }

    private void hello() {
        System.out.println("Welcome to our navigation!");
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numbCommand = Integer.parseInt(line);
            if (checkCommand(numbCommand)) {
                menu.execute(numbCommand);
            }
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[0-9+]")) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numbCommand) {
        if (numbCommand <= menu.getSize()) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void inputError() {
        System.out.println(INPUT_ERROR + "\n");
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

}
