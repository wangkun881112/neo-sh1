package neo.main;

import java.util.UUID;

public class Main_CreateUUID {

    public static void main(String[] args) {

        for (int i = 1; i <= 3600; i++) {
            System.out.println(UUID.randomUUID().toString().toUpperCase());
        }
    }
}
