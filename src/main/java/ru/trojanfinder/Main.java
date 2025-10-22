package ru.trojanfinder;

import ru.trojanfinder.rule.TrojanSource;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final List<String> analyzeMessages = new ArrayList<>();

    public static void main(String[] args) {
        String sourcesPath = args[0];
        List<String> analyzeMessages = new Main().analyzeSources(sourcesPath);

        for (String message : analyzeMessages) {
            System.out.println(message);
        }
    }

    public List<String> analyzeSources(String sourcesPath) {
        SpoonAPI spoon = new Launcher();
        spoon.addInputResource(sourcesPath);
        CtModel model = spoon.buildModel();

        TrojanSource source = new TrojanSource(this);
        source.scan(model.getRootPackage());

        return analyzeMessages;
    }

    public void addAnalyzerMessage(String message) {
        this.analyzeMessages.add(message);
    }
}
