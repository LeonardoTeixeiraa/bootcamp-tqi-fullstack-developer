package org.leonardoteixeira.config;

import io.github.cdimascio.dotenv.Dotenv;

public class ApiConfig {

    public static String getKey() {
        Dotenv dotenv = Dotenv.configure()
                .directory("src/main/resources/")
                .filename(".env")
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .load();

        String raw = dotenv.get("api.key");

        if (raw == null) return null;

        String envValue = System.getenv(raw);
        if (envValue != null) {
            return envValue;
        }

        return raw;
    }
}
