package com.mcf7.poe.domain;


import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class LevelBasedProgression<T> {
    private Map<Integer, T> levelProgressionMap;

    public T retrieveStatByLevel(int level) {
        return levelProgressionMap.get(level);
    }
}
