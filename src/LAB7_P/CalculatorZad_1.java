package LAB7_P;

import java.lang.Math;

public class CalculatorZad_1 {

    public float l1;
    public float l2;
    public float l3;
    public float l4;
    public float l5;
    public float l6;
    public float l7;
    public float result;
    int r = 0;

    public CalculatorZad_1(float _l1) {
        this.l1 = _l1;
        r = 1;
    }

    public CalculatorZad_1(float _l1, float _l2, float _l3, float _l4) {
        this.l1 = _l1;
        this.l2 = _l2;
        this.l3 = _l3;
        this.l4 = _l4;
        r = 2;
    }

    public CalculatorZad_1(float _l1, float _l2, float _l3, float _l4, float _l5, float _l6, float _l7) {
        this.l1 = _l1;
        this.l2 = _l2;
        this.l3 = _l3;
        this.l4 = _l4;
        this.l5 = _l5;
        this.l6 = _l6;
        this.l7 = _l7;
        r = 3;
    }

    public CalculatorZad_1(CalculatorZad_1 cp) {
        l1 = cp.l1;
        l2 = cp.l2;
        l3 = cp.l3;
        l4 = cp.l4;
        l5 = cp.l5;
        l6 = cp.l6;
        l7 = cp.l7;
    }

    public float operation() {

        if (r == 1) result = (float) Math.pow(l1, 2);
        if (r == 2) result = l1 + l2 + l3 + l4;
        if (r == 3) result = l1 * l2 * l3 * l4 * l5 * l5 * l7;

        return this.result;
    }


}
