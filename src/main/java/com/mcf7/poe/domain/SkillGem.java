package com.mcf7.poe.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class SkillGem {
    @Basic
    private Attribute attribute;
    @Basic
    private boolean vaalSkill;

    private LevelScaledProgression qualityStat;

    private LevelBasedProgression<Integer> requiredLevel;

    private LevelBasedProgression<Integer> strengthRequirement;
    private LevelBasedProgression<Integer> inteligenceRequirement;
    private LevelBasedProgression<Integer> dexterityRequirement;

    private LevelBasedProgression<Integer> manaCost;

    private LevelBasedProgression<Double> damageMultiplier;

    private LevelBasedProgression<Integer> experienceToLevel;

    private List<Stat> baseStats;
}
