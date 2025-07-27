package gui;

public enum YesOrNoState {
    YES("Да"),
    No("Нет");

    private final String title;

    YesOrNoState(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}