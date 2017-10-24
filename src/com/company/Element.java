package com.company;

import java.util.*;

public class Element {
    private ElementCategory category;
    private int valenceElectrons, atomicNumber;
    private double meltingPoint, boilingPoint, sublimationPoint, electronegativity, molarMass;
    private List<Double> ionizationEnergies;

    public Element() {
        setToDefaults();
    }

    public Element(int atomicNumber, int valenceElectrons, double meltingPoint, double boilingPoint,
                   double sublimationPoint, double electronegativity, double molarMass, List<Double> ionizationEnergies, ElementCategory category) {

        setToDefaults();
        this.atomicNumber = atomicNumber;
        this.valenceElectrons = valenceElectrons;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.sublimationPoint = sublimationPoint;
        this.electronegativity = electronegativity;
        this.molarMass = molarMass;
        if (ionizationEnergies != null) {
            this.ionizationEnergies = ionizationEnergies;
        }
        if (category != null) {
            this.category = category;
        }

    }

    public Element(int atomicNumber) {
        setToDefaults();
        this.atomicNumber = atomicNumber;
    }

    public enum Elements {
        HYDROGEN(1, 1, 13.99, 20.271, -1, 2.2, 1.008, makeList(new double[]{1312}), ElementCategory.NONMETAL),
        HELIUM(2),
        LITHIUM(3),
        BERYLLIUM(4),
        BORON(5),
        CARBON(6),
        NITROGEN(7),
        OXYGEN(8),
        FLUORINE(9),
        NEON(10),
        SODIUM(11),
        MAGNESIUM(12),
        ALUMINUM(13),
        SILICON(14),
        CHLORINE(15),
        ARGON(16)
        ;

        Element element;

        Elements(int atomicNumber, int valenceElectrons, double meltingPoint, double boilingPoint,
                 double sublimationPoint, double electronegativity, double molarMass, List<Double> ionizationEnergies, ElementCategory category) {
            this.element = new Element(atomicNumber, valenceElectrons, meltingPoint, boilingPoint, sublimationPoint,
                    electronegativity, molarMass, ionizationEnergies, category);
        }

        Elements(int atomicNumber) {
            this.element = new Element(atomicNumber);
        }

        public static ArrayList<Double> makeList(double[] vals) {
            ArrayList<Double> list = new ArrayList<>();

            for (double val : vals) {
                list.add(val);
            }
            return list;
        }
    }

    public void setToDefaults() {
        category = ElementCategory.DEFAULT;
        valenceElectrons = -1;
        atomicNumber = -1;
        meltingPoint = -1;
        boilingPoint = -1;
        sublimationPoint = -1;
        electronegativity = -1;
        molarMass = -1;
        ionizationEnergies = new ArrayList<>();
    }



    public double getBoilingPoint() {
        return boilingPoint;
    }

    public double getElectronegativity() {
        return electronegativity;
    }

    public double getMolarMass() {
        return molarMass;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }

    public double getSublimationPoint() {
        return sublimationPoint;
    }

    public ElementCategory getCategory() {
        return category;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public int getValenceElectrons() {
        return valenceElectrons;
    }

    public List<Double> getIonizationEnergies() {
        return ionizationEnergies;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setBoilingPoint(double boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public void setMolarMass(double molarMass) {
        this.molarMass = molarMass;
    }

    public void setCategory(ElementCategory category) {
        this.category = category;
    }

    public void setElectronegativity(double electronegativity) {
        this.electronegativity = electronegativity;
    }

    public void setIonizationEnergies(List<Double> ionizationEnergies) {
        this.ionizationEnergies = ionizationEnergies;
    }

    public void setMeltingPoint(double meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public void setSublimationPoint(double sublimationPoint) {
        this.sublimationPoint = sublimationPoint;
    }

    public void setValenceElectrons(int valenceElectrons) {
        this.valenceElectrons = valenceElectrons;
    }

}
