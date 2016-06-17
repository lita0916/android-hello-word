package com.example.admin.helloword;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by admin on 2016/6/16.
 */
public class CalcBean {

    public static final BigDecimal CONST_1000 = new BigDecimal(1000);
    public static final BigDecimal CONST_1000000 = new BigDecimal(1000000);
    private BigDecimal a;
    private BigDecimal c;
    private BigDecimal d;
    private BigDecimal e;
    private BigDecimal f;
    private BigDecimal g;
    private BigDecimal h;
    private BigDecimal i;
    private BigDecimal j;
    private BigDecimal k;
    private BigDecimal l;
    private BigDecimal m;
    private BigDecimal n = new BigDecimal("0.85");
    private BigDecimal o = new BigDecimal("7.85");
    private BigDecimal p;
    private BigDecimal q = new BigDecimal("205800000000");
    ;
    private BigDecimal r;
    private BigDecimal s;
    private BigDecimal t;
    private BigDecimal u = new BigDecimal("9.8");
    private BigDecimal v = new BigDecimal("0.85");
    private BigDecimal w = new BigDecimal("9617");
    private BigDecimal x;
    private BigDecimal y;
    private BigDecimal z;
    private BigDecimal result;

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public BigDecimal getD() {
        return d;
    }

    public void setD(BigDecimal d) {
        this.d = d;
    }

    public BigDecimal getE() {
        return e;
    }

    public void setE(BigDecimal e) {
        this.e = e;
    }

    public BigDecimal getF() {
        return f;
    }

    public void setF(BigDecimal f) {
        this.f = f;
    }

    public BigDecimal getG() {
        return g;
    }

    public void setG(BigDecimal g) {
        this.g = g;
    }

    public BigDecimal getH() {
        return h;
    }

    public void setH(BigDecimal h) {
        this.h = h;
    }

    public BigDecimal getI() {
        return i;
    }

    public void setI(BigDecimal i) {
        this.i = i;
    }

    public BigDecimal getJ() {
        return j;
    }

    public void setJ(BigDecimal j) {
        this.j = j;
    }

    public BigDecimal getK() {
        return k;
    }

    public void setK(BigDecimal k) {
        this.k = k;
    }

    public BigDecimal getL() {
        return l;
    }

    public void setL(BigDecimal l) {
        this.l = l;
    }

    public BigDecimal getM() {
        return m;
    }

    public void setM(BigDecimal m) {
        this.m = m;
    }

    public BigDecimal getN() {
        return n;
    }

    public void setN(BigDecimal n) {
        this.n = n;
    }

    public BigDecimal getO() {
        return o;
    }

    public void setO(BigDecimal o) {
        this.o = o;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public BigDecimal getT() {
        return t;
    }

    public void setT(BigDecimal t) {
        this.t = t;
    }

    public BigDecimal getU() {
        return u;
    }

    public void setU(BigDecimal u) {
        this.u = u;
    }

    public BigDecimal getV() {
        return v;
    }

    public void setV(BigDecimal v) {
        this.v = v;
    }

    public BigDecimal getW() {
        return w;
    }

    public void setW(BigDecimal w) {
        this.w = w;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public void initAndCalcResult(MainActivity activity) {
        setA(new BigDecimal(((EditText) activity.findViewById(R.id.a)).getText().toString()));
        setC(new BigDecimal(((EditText) activity.findViewById(R.id.c)).getText().toString()));
        setD(new BigDecimal(((EditText) activity.findViewById(R.id.d)).getText().toString()));
        setE(new BigDecimal(((EditText) activity.findViewById(R.id.e)).getText().toString()));
        setF(new BigDecimal(((EditText) activity.findViewById(R.id.f)).getText().toString()));
        setG(new BigDecimal(((EditText) activity.findViewById(R.id.g)).getText().toString()));
        setH(new BigDecimal(((EditText) activity.findViewById(R.id.h)).getText().toString()));
        setI(new BigDecimal(((EditText) activity.findViewById(R.id.i)).getText().toString()));
        setJ(new BigDecimal(((EditText) activity.findViewById(R.id.j)).getText().toString()));
        setK(new BigDecimal(((EditText) activity.findViewById(R.id.k)).getText().toString()));
        setL(new BigDecimal(((EditText) activity.findViewById(R.id.l)).getText().toString()));

        // m = g + h + i + a;
        setM(g.add(h).add(i).add(a));
        //p = n * (1 - l) + l;
        setP(n.multiply(new BigDecimal(1).subtract(l)).add(l));
        //r = 3.14 / 4 * c * c / 1000000;
        setR(new BigDecimal(3.14).divide(new BigDecimal(4)).multiply(c).multiply(c).divide(CONST_1000000));
        //s = 3.14 / 4 * (25 * 25 * g + 22 * 22 * h + 19 * 19 * i + 38 * 38 * a) / m / 1000000;
        setS(new BigDecimal(3.14).divide(new BigDecimal(4)).multiply((
                new BigDecimal(25).multiply(new BigDecimal(25)).multiply(g))
                .add(new BigDecimal(22).multiply(new BigDecimal(22)).multiply(h))
                .add(new BigDecimal(19).multiply(new BigDecimal(19)).multiply(i))
                .add(new BigDecimal(38).multiply(new BigDecimal(38)).multiply(a)))
                .divide(m, 5, RoundingMode.HALF_UP).divide(CONST_1000000));

        //t = 3.14 / 4 * (j * j - k * k) / 1000000;
        setT(new BigDecimal(3.14).divide(new BigDecimal(4)).multiply(j.multiply(j).subtract(k.multiply(k))).divide(CONST_1000000));
        //v = o * 1000 * u;
        setV(o.multiply(CONST_1000.multiply(u)));

        //w = p * 1000 * u;
        setW(p.multiply(CONST_1000.multiply(u)));


        //x = w * m * d / q;
        setX(w.multiply(m).multiply(d).divide(q, 3, RoundingMode.HALF_UP));
        //y = r * p * 1000 * d * u / q * (m / s + d / t);
        setY(r.multiply(p).multiply(CONST_1000).multiply(d).multiply(u).multiply(m.divide(s, 5, RoundingMode.HALF_UP).add(d.divide(t, 5, RoundingMode.HALF_UP))).divide(q, 3, RoundingMode.HALF_UP));
        //z = s * o * 1000 * m * u * e * f * f * m / 1790 / q / s;
        setZ(s.multiply(o).multiply(CONST_1000).multiply(m).multiply(u).multiply(e).multiply(f).multiply(f).multiply(m).divide(new BigDecimal(1790), 5, RoundingMode.HALF_UP).divide(q, 5, RoundingMode.HALF_UP).divide(s, 3, RoundingMode.HALF_UP));
        //result = x + y + z;
        setResult(x.add(y).add(z));
    }


    public void initAndCalcResultIngoreException(MainActivity activityBean) {
        try {
            initAndCalcResult(activityBean);
        } catch (Exception e1) {
            //忽略异常
        }
    }
}

