package net.greet;

public enum Languages {

    XHOSA("MOLO, UNJANI? "),
    ENGLISH("HEY, HOW ARE YOU? "),
    SOTHO("DUMELANG, KE TENG UKAI? ");

    String language;

    Languages(String language) {
        this.language = language.substring(0, 1).toUpperCase() + language.substring(1).toLowerCase();
    }

    public String getLanguage(){
        return language.substring(0, 1).toUpperCase() + language.substring(1).toLowerCase();
    }
}
