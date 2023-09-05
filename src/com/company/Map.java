package com.company;

public class Map {
    private  String name;

    public Map(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void music() {
        AudioPlayer MGP = Audio;
    }

    public void townCenter() {
        System.out.println("####################################################################################");
        System.out.println("""

                  _______ _            _______                     _____           _            \s
                 |__   __| |          |__   __|                   / ____|         | |           \s
                    | |  | |__   ___     | | _____      ___ __   | |     ___ _ __ | |_ ___ _ __ \s
                    | |  | '_ \\ / _ \\    | |/ _ \\ \\ /\\ / / '_ \\  | |    / _ \\ '_ \\| __/ _ \\ '__|\s
                    | |  | | | |  __/    | | (_) \\ V  V /| | | | | |___|  __/ | | | ||  __/ |   \s
                    |_|  |_| |_|\\___|    |_|\\___/ \\_/\\_/ |_| |_|  \\_____\\___|_| |_|\\__\\___|_|   \s
                                                                                                \s
                                                                                                \s
                """);
        System.out.println("####################################################################################");
        System.out.println("You've entered in " + getName());
    }


}