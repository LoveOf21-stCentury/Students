package study_group.view.commands;

import study_group.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "End of work";
    }

    public void execute(){
        consoleUI.finish();
    }
}
