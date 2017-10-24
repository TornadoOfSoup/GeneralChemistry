package elements;

public class Elements {

    public class Hydrogen extends Element {

        public Hydrogen() {
            setEverything(1, 1, 13.99, 20.271,
                     2.2, 1.008, makeList(new double[]{1312}), ElementCategory.NONMETAL);
        }
    }

    public class Helium extends Element {

        public Helium() {
            setEverything(2, 2, -1, 4.22,
                     -1, 4.002602, makeList(new double[]{2372.3, 5250.5}), ElementCategory.NOBLE_GASES);
        }
    }

    public class Lithium extends Element {

        public Lithium() {
            setEverything(3, 1, 453.689, 1615.15,
                    0.98, 6.941, makeList(new double[]{520.2, 7298.1, 11815}), ElementCategory.ALKALI_METALS);
        }
    }

    public class Beryllium extends Element {

        public Beryllium() {
            setEverything(4, 2, 1560, 2742,
                    1.57, 9.0122, makeList(new double[]{899.5, 1757.1, 14848.7}), ElementCategory.ALKALINE_EARTH_METALS);
        }
    }

    public class Boron extends Element {

        public Boron() {
            setEverything(5, 3, 2349, 4200,
                    2.04, 10.81, makeList(new double[]{800.6, 2427.1, 3659.7}), ElementCategory.METALLOIDS);
        }
    }

    public class Carbon extends Element {

        public Carbon() {
            setEverything(6, 4, -1, -1,
                    2.55, 12.011, makeList(new double[]{1086.5, 2352.6, 4620.5}), ElementCategory.NONMETAL);
        }
    }

    public class Nitrogen extends Element {

        public Nitrogen() {
            setEverything(7, 5, 63.15, 77.355,
                    3.04, 14.007, makeList(new double[]{1402.3, 2856, 4578.1}), ElementCategory.NONMETAL);
        }
    }

    public class Oxygen extends Element {

        public Oxygen() {
            setEverything(8, 6, 54.36, 90.188,
                    3.44, 15.999, makeList(new double[]{1313.9, 3388.3, 5300.5}), ElementCategory.NONMETAL);
        }
    }

    public class Fluorine extends Element {

        public Fluorine() {
            setEverything(9, 7, 53.48, 85.03,
                    3.98, 18.998, makeList(new double[]{1681, 3374, 6147}), ElementCategory.NONMETAL);
        }
    }

    public class Neon extends Element {

        public Neon() {
            setEverything(10, 8, 24.56, 27.104,
                    -1, 20.180, makeList(new double[]{2080.7, 3952.3, 6122}), ElementCategory.NOBLE_GASES);
        }
    }
}
