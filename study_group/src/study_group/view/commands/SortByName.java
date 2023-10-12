package study_group.view.commands;

import study_group.view.ConsoleUI;

public class SortByName extends Command{
    public SortByName(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Sort by name";
    }

    public void execute(){
        consoleUI.sortByName();
    }
}
