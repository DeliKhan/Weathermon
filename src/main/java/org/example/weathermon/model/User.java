package org.example.weathermon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String userId;

    private String animeTheme;
    
    public String getAnimeTheme(){
        return animeTheme;
    }

    public void setAnimeTheme(String animeTheme){
        this.animeTheme = animeTheme;
    }

    
}
