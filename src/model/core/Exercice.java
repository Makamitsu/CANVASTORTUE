package model.core;

import java.awt.image.BufferedImage;

/**
 * Created by ambie on 29/03/2017.
 */
public class Exercice {
    private String name;
    private String path;
    private String description;
    private boolean started;

    public Exercice(String name, String path, String description) {
        this.name = name;
        this.path = path;
        this.description = description;
        this.started = false;
    }

    public void start(){
        this.started = true;
    }

    public boolean isStarted() {
        return started;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }

}
