package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.KY */
/* loaded from: classes.dex */
public final class C0561KY {

    /* renamed from: N */
    public static final SparseIntArray f1828N;

    /* renamed from: P */
    public static final int[] f1829P = {0, 4, 8};

    /* renamed from: Q */
    public static final SparseIntArray f1830Q;

    /* renamed from: z */
    public final HashMap f1833z = new HashMap();

    /* renamed from: h */
    public final boolean f1831h = true;

    /* renamed from: v */
    public final HashMap f1832v = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1828N = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1830Q = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: P */
    public static C1895jg m1266P(Context context, AttributeSet attributeSet, boolean z) {
        String str;
        int i;
        String[] strArr;
        int dimensionPixelSize;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        String str2;
        C1370Ze c1370Ze;
        C1895jg c1895jg = new C1895jg();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC0917RG.f3159v : AbstractC0917RG.f3160z);
        String[] strArr2 = AbstractC1843ih.f5760w;
        int[] iArr = f1829P;
        SparseIntArray sparseIntArray = f1828N;
        C0404Hg c0404Hg = c1895jg.f5928h;
        C2411tQ c2411tQ = c1895jg.f5925N;
        C0986SU c0986su = c1895jg.f5929v;
        C0689N2 c0689n2 = c1895jg.f5926P;
        String str3 = "unused attribute 0x";
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            C1370Ze c1370Ze2 = new C1370Ze();
            c0986su.getClass();
            c0689n2.getClass();
            c0404Hg.getClass();
            c2411tQ.getClass();
            int i8 = 0;
            while (i8 < indexCount) {
                int i9 = indexCount;
                int index = obtainStyledAttributes.getIndex(i8);
                int i10 = i8;
                switch (f1830Q.get(index)) {
                    case 2:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2319p);
                        i2 = 2;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb = new StringBuilder(str2);
                        c1370Ze = c1370Ze2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        continue;
                        indexCount = i9;
                        c1370Ze2 = c1370Ze;
                        str4 = str2;
                        i8 = i10 + 1;
                        strArr2 = strArr;
                    case 5:
                        strArr = strArr2;
                        i3 = 5;
                        c1370Ze2.m2766v(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0689n2.f2273H);
                        i2 = 6;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 7:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0689n2.f2303e);
                        i2 = 7;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 8:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2309j);
                        i2 = 8;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 11:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2328x);
                        i2 = 11;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 12:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2288T);
                        i2 = 12;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 13:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2301d);
                        i2 = 13;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 14:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2313n);
                        i2 = 14;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 15:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2324t);
                        i2 = 15;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 16:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2283O);
                        i2 = 16;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 17:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0689n2.f2284P);
                        i2 = 17;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 18:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0689n2.f2282N);
                        i2 = 18;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 19:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2285Q);
                        i4 = 19;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 20:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2269E);
                        i4 = 20;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 21:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0689n2.f2326v);
                        i2 = 21;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 22:
                        strArr = strArr2;
                        dimensionPixelSize = iArr[obtainStyledAttributes.getInt(index, c0404Hg.f1370z)];
                        i2 = 22;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 23:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0689n2.f2306h);
                        i2 = 23;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 24:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2271F);
                        i2 = 24;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 27:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2294X);
                        i2 = 27;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 28:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2297Z);
                        i2 = 28;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 31:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2279L);
                        i2 = 31;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 34:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2267C);
                        i2 = 34;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 37:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2304f);
                        i4 = 37;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 38:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getResourceId(index, c1895jg.f5930z);
                        c1895jg.f5930z = dimensionPixelSize;
                        i2 = 38;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 39:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2268D);
                        i4 = 39;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 40:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2278K);
                        i4 = 40;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 41:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2312m);
                        i2 = 41;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 42:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2311l);
                        i2 = 42;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 43:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0404Hg.f1369v);
                        i4 = 43;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 44:
                        strArr = strArr2;
                        c1370Ze2.m2764P(44, true);
                        c1370Ze2.m2767z(44, obtainStyledAttributes.getDimension(index, c2411tQ.f7378S));
                        break;
                    case 45:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c2411tQ.f7381h);
                        i4 = 45;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 46:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c2411tQ.f7384v);
                        i4 = 46;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 47:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c2411tQ.f7376P);
                        i4 = 47;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 48:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c2411tQ.f7375N);
                        i4 = 48;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 49:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c2411tQ.f7377Q);
                        i4 = 49;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 50:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c2411tQ.f7383u);
                        i4 = 50;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 51:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c2411tQ.f7380W);
                        i4 = 51;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 52:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c2411tQ.f7373G);
                        i4 = 52;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 53:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getDimension(index, c2411tQ.f7374M);
                        i4 = 53;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 54:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2299b);
                        i2 = 54;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 55:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2316nP);
                        i2 = 55;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 56:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2296Yd);
                        i2 = 56;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 57:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2321qn);
                        i2 = 57;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 58:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2274HL);
                        i2 = 58;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 59:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2318od);
                        i2 = 59;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 60:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c2411tQ.f7385z);
                        i4 = 60;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 62:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2277J);
                        i2 = 62;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 63:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0689n2.f2300c);
                        i4 = 63;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 64:
                        strArr = strArr2;
                        dimensionPixelSize = m1267Q(obtainStyledAttributes, index, c0986su.f3329z);
                        i2 = 64;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 65:
                        strArr = strArr2;
                        c1370Ze2.m2766v(65, obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        break;
                    case 66:
                        strArr = strArr2;
                        c1370Ze2.m2765h(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0986su.f3321N);
                        i4 = 67;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 68:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0404Hg.f1367P);
                        i4 = 68;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 69:
                        strArr = strArr2;
                        i5 = 69;
                        c1370Ze2.m2767z(i5, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        strArr = strArr2;
                        i5 = 70;
                        c1370Ze2.m2767z(i5, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2291UZ);
                        i2 = 72;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 73:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2314n0);
                        i2 = 73;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 74:
                        strArr = strArr2;
                        i3 = 74;
                        c1370Ze2.m2766v(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0689n2.f2280Lq);
                        i6 = 75;
                        c1370Ze2.m2764P(i6, z2);
                        break;
                    case 76:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0986su.f3328v);
                        i2 = 76;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 77:
                        strArr = strArr2;
                        i3 = 77;
                        c1370Ze2.m2766v(i3, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0404Hg.f1368h);
                        i2 = 78;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 79:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0986su.f3322P);
                        i4 = 79;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 80:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0689n2.f2302dx);
                        i6 = 80;
                        c1370Ze2.m2764P(i6, z2);
                        break;
                    case 81:
                        strArr = strArr2;
                        z2 = obtainStyledAttributes.getBoolean(index, c0689n2.f2298ZH);
                        i6 = 81;
                        c1370Ze2.m2764P(i6, z2);
                        break;
                    case 82:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, c0986su.f3325h);
                        i2 = 82;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 83:
                        strArr = strArr2;
                        dimensionPixelSize = m1267Q(obtainStyledAttributes, index, c2411tQ.f7382o);
                        i2 = 83;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 84:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, c0986su.f3327u);
                        i2 = 84;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 85:
                        strArr = strArr2;
                        f = obtainStyledAttributes.getFloat(index, c0986su.f3323Q);
                        i4 = 85;
                        c1370Ze2.m2767z(i4, f);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                c1370Ze2.m2765h(88, obtainStyledAttributes.getInteger(index, c0986su.f3324W));
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                c0986su.f3326o = string;
                                c1370Ze2.m2766v(90, string);
                                if (c0986su.f3326o.indexOf("/") <= 0) {
                                    c1370Ze2.m2765h(88, -1);
                                    break;
                                } else {
                                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    c0986su.f3324W = resourceId;
                                    c1370Ze2.m2765h(89, resourceId);
                                    c1370Ze2.m2765h(88, -2);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c0986su.f3324W = resourceId2;
                            c1370Ze2.m2765h(89, resourceId2);
                            if (c0986su.f3324W != -1) {
                                c1370Ze2.m2765h(88, -2);
                                break;
                            }
                        }
                        indexCount = i9;
                        c1370Ze2 = c1370Ze;
                        str4 = str2;
                        i8 = i10 + 1;
                        strArr2 = strArr;
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2308i);
                        i2 = 93;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 94:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0689n2.f2265B);
                        i2 = 94;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 95:
                        strArr = strArr2;
                        i7 = 0;
                        m1269u(c1370Ze2, obtainStyledAttributes, index, i7);
                        break;
                    case 96:
                        strArr = strArr2;
                        i7 = 1;
                        m1269u(c1370Ze2, obtainStyledAttributes, index, i7);
                        break;
                    case 97:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0689n2.f2275Ha);
                        i2 = 97;
                        c1370Ze2.m2765h(i2, dimensionPixelSize);
                        break;
                    case 98:
                        int i12 = AbstractC1069U3.f3533H;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            c1895jg.f5930z = obtainStyledAttributes.getResourceId(index, c1895jg.f5930z);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        z2 = obtainStyledAttributes.getBoolean(index, c0689n2.f2325u);
                        i6 = 99;
                        strArr = strArr2;
                        c1370Ze2.m2764P(i6, z2);
                        break;
                }
                str2 = str4;
                c1370Ze = c1370Ze2;
                indexCount = i9;
                c1370Ze2 = c1370Ze;
                str4 = str2;
                i8 = i10 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i13 = 0;
            while (i13 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i13);
                int i14 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c0986su.getClass();
                        c0689n2.getClass();
                        c0404Hg.getClass();
                        c2411tQ.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        c0689n2.f2276I = m1267Q(obtainStyledAttributes, index2, c0689n2.f2276I);
                        break;
                    case 2:
                        str = str3;
                        c0689n2.f2319p = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2319p);
                        break;
                    case 3:
                        str = str3;
                        c0689n2.f2327w = m1267Q(obtainStyledAttributes, index2, c0689n2.f2327w);
                        break;
                    case 4:
                        str = str3;
                        c0689n2.f2286R = m1267Q(obtainStyledAttributes, index2, c0689n2.f2286R);
                        break;
                    case 5:
                        str = str3;
                        c0689n2.f2322r = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        c0689n2.f2273H = obtainStyledAttributes.getDimensionPixelOffset(index2, c0689n2.f2273H);
                        break;
                    case 7:
                        str = str3;
                        c0689n2.f2303e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0689n2.f2303e);
                        break;
                    case 8:
                        str = str3;
                        c0689n2.f2309j = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2309j);
                        break;
                    case 9:
                        str = str3;
                        c0689n2.f2289U = m1267Q(obtainStyledAttributes, index2, c0689n2.f2289U);
                        break;
                    case 10:
                        str = str3;
                        c0689n2.f2323s = m1267Q(obtainStyledAttributes, index2, c0689n2.f2323s);
                        break;
                    case 11:
                        str = str3;
                        c0689n2.f2328x = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2328x);
                        break;
                    case 12:
                        str = str3;
                        c0689n2.f2288T = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2288T);
                        break;
                    case 13:
                        str = str3;
                        c0689n2.f2301d = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2301d);
                        break;
                    case 14:
                        str = str3;
                        c0689n2.f2313n = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2313n);
                        break;
                    case 15:
                        str = str3;
                        c0689n2.f2324t = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2324t);
                        break;
                    case 16:
                        str = str3;
                        c0689n2.f2283O = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2283O);
                        break;
                    case 17:
                        str = str3;
                        c0689n2.f2284P = obtainStyledAttributes.getDimensionPixelOffset(index2, c0689n2.f2284P);
                        break;
                    case 18:
                        str = str3;
                        c0689n2.f2282N = obtainStyledAttributes.getDimensionPixelOffset(index2, c0689n2.f2282N);
                        break;
                    case 19:
                        str = str3;
                        c0689n2.f2285Q = obtainStyledAttributes.getFloat(index2, c0689n2.f2285Q);
                        break;
                    case 20:
                        str = str3;
                        c0689n2.f2269E = obtainStyledAttributes.getFloat(index2, c0689n2.f2269E);
                        break;
                    case 21:
                        str = str3;
                        c0689n2.f2326v = obtainStyledAttributes.getLayoutDimension(index2, c0689n2.f2326v);
                        break;
                    case 22:
                        str = str3;
                        c0404Hg.f1370z = iArr[obtainStyledAttributes.getInt(index2, c0404Hg.f1370z)];
                        break;
                    case 23:
                        str = str3;
                        c0689n2.f2306h = obtainStyledAttributes.getLayoutDimension(index2, c0689n2.f2306h);
                        break;
                    case 24:
                        str = str3;
                        c0689n2.f2271F = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2271F);
                        break;
                    case 25:
                        str = str3;
                        c0689n2.f2317o = m1267Q(obtainStyledAttributes, index2, c0689n2.f2317o);
                        break;
                    case 26:
                        str = str3;
                        c0689n2.f2293W = m1267Q(obtainStyledAttributes, index2, c0689n2.f2293W);
                        break;
                    case 27:
                        str = str3;
                        c0689n2.f2294X = obtainStyledAttributes.getInt(index2, c0689n2.f2294X);
                        break;
                    case 28:
                        str = str3;
                        c0689n2.f2297Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2297Z);
                        break;
                    case 29:
                        str = str3;
                        c0689n2.f2272G = m1267Q(obtainStyledAttributes, index2, c0689n2.f2272G);
                        break;
                    case 30:
                        str = str3;
                        c0689n2.f2281M = m1267Q(obtainStyledAttributes, index2, c0689n2.f2281M);
                        break;
                    case 31:
                        str = str3;
                        c0689n2.f2279L = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2279L);
                        break;
                    case 32:
                        str = str3;
                        c0689n2.f2305g = m1267Q(obtainStyledAttributes, index2, c0689n2.f2305g);
                        break;
                    case 33:
                        str = str3;
                        c0689n2.f2329y = m1267Q(obtainStyledAttributes, index2, c0689n2.f2329y);
                        break;
                    case 34:
                        str = str3;
                        c0689n2.f2267C = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2267C);
                        break;
                    case 35:
                        str = str3;
                        c0689n2.f2287S = m1267Q(obtainStyledAttributes, index2, c0689n2.f2287S);
                        break;
                    case 36:
                        str = str3;
                        c0689n2.f2292V = m1267Q(obtainStyledAttributes, index2, c0689n2.f2292V);
                        break;
                    case 37:
                        str = str3;
                        c0689n2.f2304f = obtainStyledAttributes.getFloat(index2, c0689n2.f2304f);
                        break;
                    case 38:
                        str = str3;
                        c1895jg.f5930z = obtainStyledAttributes.getResourceId(index2, c1895jg.f5930z);
                        break;
                    case 39:
                        str = str3;
                        c0689n2.f2268D = obtainStyledAttributes.getFloat(index2, c0689n2.f2268D);
                        break;
                    case 40:
                        str = str3;
                        c0689n2.f2278K = obtainStyledAttributes.getFloat(index2, c0689n2.f2278K);
                        break;
                    case 41:
                        str = str3;
                        c0689n2.f2312m = obtainStyledAttributes.getInt(index2, c0689n2.f2312m);
                        break;
                    case 42:
                        str = str3;
                        c0689n2.f2311l = obtainStyledAttributes.getInt(index2, c0689n2.f2311l);
                        break;
                    case 43:
                        str = str3;
                        c0404Hg.f1369v = obtainStyledAttributes.getFloat(index2, c0404Hg.f1369v);
                        break;
                    case 44:
                        str = str3;
                        c2411tQ.f7379V = true;
                        c2411tQ.f7378S = obtainStyledAttributes.getDimension(index2, c2411tQ.f7378S);
                        break;
                    case 45:
                        str = str3;
                        c2411tQ.f7381h = obtainStyledAttributes.getFloat(index2, c2411tQ.f7381h);
                        break;
                    case 46:
                        str = str3;
                        c2411tQ.f7384v = obtainStyledAttributes.getFloat(index2, c2411tQ.f7384v);
                        break;
                    case 47:
                        str = str3;
                        c2411tQ.f7376P = obtainStyledAttributes.getFloat(index2, c2411tQ.f7376P);
                        break;
                    case 48:
                        str = str3;
                        c2411tQ.f7375N = obtainStyledAttributes.getFloat(index2, c2411tQ.f7375N);
                        break;
                    case 49:
                        str = str3;
                        c2411tQ.f7377Q = obtainStyledAttributes.getDimension(index2, c2411tQ.f7377Q);
                        break;
                    case 50:
                        str = str3;
                        c2411tQ.f7383u = obtainStyledAttributes.getDimension(index2, c2411tQ.f7383u);
                        break;
                    case 51:
                        str = str3;
                        c2411tQ.f7380W = obtainStyledAttributes.getDimension(index2, c2411tQ.f7380W);
                        break;
                    case 52:
                        str = str3;
                        c2411tQ.f7373G = obtainStyledAttributes.getDimension(index2, c2411tQ.f7373G);
                        break;
                    case 53:
                        str = str3;
                        c2411tQ.f7374M = obtainStyledAttributes.getDimension(index2, c2411tQ.f7374M);
                        break;
                    case 54:
                        str = str3;
                        c0689n2.f2299b = obtainStyledAttributes.getInt(index2, c0689n2.f2299b);
                        break;
                    case 55:
                        str = str3;
                        c0689n2.f2316nP = obtainStyledAttributes.getInt(index2, c0689n2.f2316nP);
                        break;
                    case 56:
                        str = str3;
                        c0689n2.f2296Yd = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2296Yd);
                        break;
                    case 57:
                        str = str3;
                        c0689n2.f2321qn = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2321qn);
                        break;
                    case 58:
                        str = str3;
                        c0689n2.f2274HL = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2274HL);
                        break;
                    case 59:
                        str = str3;
                        c0689n2.f2318od = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2318od);
                        break;
                    case 60:
                        str = str3;
                        c2411tQ.f7385z = obtainStyledAttributes.getFloat(index2, c2411tQ.f7385z);
                        break;
                    case 61:
                        str = str3;
                        c0689n2.f2295Y = m1267Q(obtainStyledAttributes, index2, c0689n2.f2295Y);
                        break;
                    case 62:
                        str = str3;
                        c0689n2.f2277J = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2277J);
                        break;
                    case 63:
                        str = str3;
                        c0689n2.f2300c = obtainStyledAttributes.getFloat(index2, c0689n2.f2300c);
                        break;
                    case 64:
                        str = str3;
                        c0986su.f3329z = m1267Q(obtainStyledAttributes, index2, c0986su.f3329z);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        c0986su.getClass();
                        break;
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        c0986su.getClass();
                        break;
                    case 67:
                        str = str3;
                        c0986su.f3321N = obtainStyledAttributes.getFloat(index2, c0986su.f3321N);
                        break;
                    case 68:
                        str = str3;
                        c0404Hg.f1367P = obtainStyledAttributes.getFloat(index2, c0404Hg.f1367P);
                        break;
                    case 69:
                        str = str3;
                        c0689n2.f2315nF = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        c0689n2.f2331zx = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        c0689n2.f2291UZ = obtainStyledAttributes.getInt(index2, c0689n2.f2291UZ);
                        break;
                    case 73:
                        str = str3;
                        c0689n2.f2314n0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2314n0);
                        break;
                    case 74:
                        str = str3;
                        c0689n2.f2266BO = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        c0689n2.f2280Lq = obtainStyledAttributes.getBoolean(index2, c0689n2.f2280Lq);
                        break;
                    case 76:
                        str = str3;
                        c0986su.f3328v = obtainStyledAttributes.getInt(index2, c0986su.f3328v);
                        break;
                    case 77:
                        str = str3;
                        c0689n2.f2307he = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        c0404Hg.f1368h = obtainStyledAttributes.getInt(index2, c0404Hg.f1368h);
                        break;
                    case 79:
                        str = str3;
                        c0986su.f3322P = obtainStyledAttributes.getFloat(index2, c0986su.f3322P);
                        break;
                    case 80:
                        str = str3;
                        c0689n2.f2302dx = obtainStyledAttributes.getBoolean(index2, c0689n2.f2302dx);
                        break;
                    case 81:
                        str = str3;
                        c0689n2.f2298ZH = obtainStyledAttributes.getBoolean(index2, c0689n2.f2298ZH);
                        break;
                    case 82:
                        str = str3;
                        c0986su.f3325h = obtainStyledAttributes.getInteger(index2, c0986su.f3325h);
                        break;
                    case 83:
                        str = str3;
                        c2411tQ.f7382o = m1267Q(obtainStyledAttributes, index2, c2411tQ.f7382o);
                        break;
                    case 84:
                        str = str3;
                        c0986su.f3327u = obtainStyledAttributes.getInteger(index2, c0986su.f3327u);
                        break;
                    case 85:
                        str = str3;
                        c0986su.f3323Q = obtainStyledAttributes.getFloat(index2, c0986su.f3323Q);
                        break;
                    case 86:
                        str = str3;
                        int i15 = obtainStyledAttributes.peekValue(index2).type;
                        if (i15 != 1) {
                            if (i15 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                c0986su.f3326o = string2;
                                if (string2.indexOf("/") <= 0) {
                                    break;
                                } else {
                                    c0986su.f3324W = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, c0986su.f3324W);
                            }
                            c0986su.getClass();
                            break;
                        } else {
                            c0986su.f3324W = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb2 = new StringBuilder(str3);
                        str = str3;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        c0689n2.f2320q = m1267Q(obtainStyledAttributes, index2, c0689n2.f2320q);
                        str = str3;
                        break;
                    case 92:
                        c0689n2.f2310k = m1267Q(obtainStyledAttributes, index2, c0689n2.f2310k);
                        str = str3;
                        break;
                    case 93:
                        c0689n2.f2308i = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2308i);
                        str = str3;
                        break;
                    case 94:
                        c0689n2.f2265B = obtainStyledAttributes.getDimensionPixelSize(index2, c0689n2.f2265B);
                        str = str3;
                        break;
                    case 95:
                        i = 0;
                        m1269u(c0689n2, obtainStyledAttributes, index2, i);
                        str = str3;
                        break;
                    case 96:
                        i = 1;
                        m1269u(c0689n2, obtainStyledAttributes, index2, i);
                        str = str3;
                        break;
                    case 97:
                        c0689n2.f2275Ha = obtainStyledAttributes.getInt(index2, c0689n2.f2275Ha);
                        str = str3;
                        break;
                }
                i13++;
                indexCount2 = i14;
                str3 = str;
            }
            if (c0689n2.f2266BO != null) {
                c0689n2.f2290U8 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c1895jg;
    }

    /* renamed from: Q */
    public static int m1267Q(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: o */
    public static void m1268o(C1655f7 c1655f7, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1655f7.f5156Z = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0041  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1269u(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0561KY.m1269u(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: v */
    public static int[] m1270v(Barrier barrier, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = AbstractC2665yG.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f8883f) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f8883f.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: N */
    public final void m1271N(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1895jg m1266P = m1266P(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m1266P.f5926P.f2330z = true;
                    }
                    this.f1832v.put(Integer.valueOf(m1266P.f5930z), m1266P);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void m1272h(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        C0905R4 c0905r4;
        C0561KY c0561ky = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c0561ky.f1832v;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C1655f7 c1655f7 = (C1655f7) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0561ky.f1831h && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C1895jg());
            }
            C1895jg c1895jg = (C1895jg) hashMap.get(Integer.valueOf(id));
            if (c1895jg == null) {
                i = childCount;
            } else {
                HashMap hashMap2 = c0561ky.f1833z;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0905R4 c0905r42 = (C0905R4) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            c0905r4 = new C0905R4(c0905r42, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i2 = childCount;
                        } else {
                            i2 = childCount;
                            try {
                                c0905r4 = new C0905R4(c0905r42, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i2;
                            }
                        }
                        hashMap3.put(str, c0905r4);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                        e = e4;
                        i2 = childCount;
                    }
                    childCount = i2;
                }
                i = childCount;
                c1895jg.f5927Q = hashMap3;
                c1895jg.f5930z = id;
                int i4 = c1655f7.f5140N;
                C0689N2 c0689n2 = c1895jg.f5926P;
                c0689n2.f2317o = i4;
                c0689n2.f2293W = c1655f7.f5144Q;
                c0689n2.f2272G = c1655f7.f5184u;
                c0689n2.f2281M = c1655f7.f5176o;
                c0689n2.f2292V = c1655f7.f5152W;
                c0689n2.f2287S = c1655f7.f5130G;
                c0689n2.f2286R = c1655f7.f5139M;
                c0689n2.f2327w = c1655f7.f5151V;
                c0689n2.f2276I = c1655f7.f5146S;
                c0689n2.f2320q = c1655f7.f5145R;
                c0689n2.f2310k = c1655f7.f5186w;
                c0689n2.f2305g = c1655f7.f5164g;
                c0689n2.f2329y = c1655f7.f5188y;
                c0689n2.f2323s = c1655f7.f5182s;
                c0689n2.f2289U = c1655f7.f5148U;
                c0689n2.f2269E = c1655f7.f5153X;
                c0689n2.f2304f = c1655f7.f5129F;
                c0689n2.f2322r = c1655f7.f5156Z;
                c0689n2.f2295Y = c1655f7.f5134I;
                c0689n2.f2277J = c1655f7.f5179q;
                c0689n2.f2300c = c1655f7.f5169k;
                c0689n2.f2273H = c1655f7.f5136K;
                c0689n2.f2303e = c1655f7.f5126D;
                c0689n2.f2294X = c1655f7.f5171m;
                c0689n2.f2285Q = c1655f7.f5185v;
                c0689n2.f2284P = c1655f7.f5189z;
                c0689n2.f2282N = c1655f7.f5165h;
                c0689n2.f2306h = ((ViewGroup.MarginLayoutParams) c1655f7).width;
                c0689n2.f2326v = ((ViewGroup.MarginLayoutParams) c1655f7).height;
                c0689n2.f2271F = ((ViewGroup.MarginLayoutParams) c1655f7).leftMargin;
                c0689n2.f2297Z = ((ViewGroup.MarginLayoutParams) c1655f7).rightMargin;
                c0689n2.f2267C = ((ViewGroup.MarginLayoutParams) c1655f7).topMargin;
                c0689n2.f2319p = ((ViewGroup.MarginLayoutParams) c1655f7).bottomMargin;
                c0689n2.f2308i = c1655f7.f5162e;
                c0689n2.f2278K = c1655f7.f5178p;
                c0689n2.f2268D = c1655f7.f5125C;
                c0689n2.f2311l = c1655f7.f5137L;
                c0689n2.f2312m = c1655f7.f5168j;
                c0689n2.f2302dx = c1655f7.f5170l;
                c0689n2.f2298ZH = c1655f7.f5158b;
                c0689n2.f2299b = c1655f7.f5167i;
                c0689n2.f2316nP = c1655f7.f5160d;
                c0689n2.f2296Yd = c1655f7.f5187x;
                c0689n2.f2321qn = c1655f7.f5147T;
                c0689n2.f2274HL = c1655f7.f5141O;
                c0689n2.f2318od = c1655f7.f5172n;
                c0689n2.f2315nF = c1655f7.f5183t;
                c0689n2.f2331zx = c1655f7.f5123B;
                c0689n2.f2307he = c1655f7.f5175nP;
                c0689n2.f2283O = c1655f7.f5163f;
                c0689n2.f2328x = c1655f7.f5154Y;
                c0689n2.f2301d = c1655f7.f5127E;
                c0689n2.f2313n = c1655f7.f5181r;
                c0689n2.f2324t = c1655f7.f5135J;
                c0689n2.f2288T = c1655f7.f5159c;
                c0689n2.f2265B = c1655f7.f5131H;
                c0689n2.f2275Ha = c1655f7.f5155Yd;
                c0689n2.f2309j = c1655f7.getMarginEnd();
                c0689n2.f2279L = c1655f7.getMarginStart();
                int visibility = childAt.getVisibility();
                C0404Hg c0404Hg = c1895jg.f5928h;
                c0404Hg.f1370z = visibility;
                c0404Hg.f1369v = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C2411tQ c2411tQ = c1895jg.f5925N;
                c2411tQ.f7385z = rotation;
                c2411tQ.f7381h = childAt.getRotationX();
                c2411tQ.f7384v = childAt.getRotationY();
                c2411tQ.f7376P = childAt.getScaleX();
                c2411tQ.f7375N = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c2411tQ.f7377Q = pivotX;
                    c2411tQ.f7383u = pivotY;
                }
                c2411tQ.f7380W = childAt.getTranslationX();
                c2411tQ.f7373G = childAt.getTranslationY();
                c2411tQ.f7374M = childAt.getTranslationZ();
                if (c2411tQ.f7379V) {
                    c2411tQ.f7378S = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0689n2.f2280Lq = barrier.f8873U.f1363BX;
                    c0689n2.f2290U8 = Arrays.copyOf(barrier.f1635S, barrier.f1634R);
                    c0689n2.f2291UZ = barrier.f8875y;
                    c0689n2.f2314n0 = barrier.f8873U.f1365d2;
                }
            }
            i3++;
            c0561ky = this;
            childCount = i;
        }
    }

    /* renamed from: z */
    public final void m1273z(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        StringBuilder sb;
        String str;
        C0561KY c0561ky = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c0561ky.f1832v;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (c0561ky.f1831h && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1895jg c1895jg = (C1895jg) hashMap.get(Integer.valueOf(id));
                        if (c1895jg != null) {
                            if (childAt instanceof Barrier) {
                                C0689N2 c0689n2 = c1895jg.f5926P;
                                c0689n2.f2270EC = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.f8875y = c0689n2.f2291UZ;
                                int i4 = c0689n2.f2314n0;
                                C0403Hf c0403Hf = barrier.f8873U;
                                c0403Hf.f1365d2 = i4;
                                c0403Hf.f1363BX = c0689n2.f2280Lq;
                                int[] iArr = c0689n2.f2290U8;
                                if (iArr != null) {
                                    barrier.m1171M(iArr);
                                } else {
                                    String str2 = c0689n2.f2266BO;
                                    if (str2 != null) {
                                        int[] m1270v = m1270v(barrier, str2);
                                        c0689n2.f2290U8 = m1270v;
                                        barrier.m1171M(m1270v);
                                    }
                                }
                            }
                            C1655f7 c1655f7 = (C1655f7) childAt.getLayoutParams();
                            c1655f7.m3128z();
                            c1895jg.m3536z(c1655f7);
                            HashMap hashMap2 = c1895jg.f5927Q;
                            Class<?> cls = childAt.getClass();
                            Iterator it = hashMap2.keySet().iterator();
                            while (it.hasNext()) {
                                String str3 = (String) it.next();
                                C0905R4 c0905r4 = (C0905R4) hashMap2.get(str3);
                                HashMap hashMap3 = hashMap2;
                                String m4200k = !c0905r4.f3105z ? AbstractC2441tz.m4200k("set", str3) : str3;
                                Iterator it2 = it;
                                try {
                                    switch (AbstractC2441tz.m4204s(c0905r4.f3102h)) {
                                        case AbstractC0795Op.f2698E /* 0 */:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, Integer.TYPE).invoke(childAt, Integer.valueOf(c0905r4.f3104v));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, Float.TYPE).invoke(childAt, Float.valueOf(c0905r4.f3100P));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, Integer.TYPE).invoke(childAt, Integer.valueOf(c0905r4.f3103u));
                                            break;
                                        case 3:
                                            i2 = childCount;
                                            Method method = cls.getMethod(m4200k, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0905r4.f3103u);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, CharSequence.class).invoke(childAt, c0905r4.f3099N);
                                            break;
                                        case 5:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0905r4.f3101Q));
                                            break;
                                        case 6:
                                            i2 = childCount;
                                            cls.getMethod(m4200k, Float.TYPE).invoke(childAt, Float.valueOf(c0905r4.f3100P));
                                            break;
                                        case 7:
                                            i2 = childCount;
                                            try {
                                                cls.getMethod(m4200k, Integer.TYPE).invoke(childAt, Integer.valueOf(c0905r4.f3104v));
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                sb = new StringBuilder(" Custom Attribute \"");
                                                sb.append(str3);
                                                sb.append("\" not found on ");
                                                sb.append(cls.getName());
                                                Log.e("TransitionLayout", sb.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + m4200k);
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i2;
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                sb = new StringBuilder(" Custom Attribute \"");
                                                sb.append(str3);
                                                sb.append("\" not found on ");
                                                sb.append(cls.getName());
                                                Log.e("TransitionLayout", sb.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i2;
                                            }
                                        default:
                                            i2 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    i2 = childCount;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    i2 = childCount;
                                }
                                hashMap2 = hashMap3;
                                it = it2;
                                childCount = i2;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c1655f7);
                            C0404Hg c0404Hg = c1895jg.f5928h;
                            if (c0404Hg.f1368h == 0) {
                                childAt.setVisibility(c0404Hg.f1370z);
                            }
                            childAt.setAlpha(c0404Hg.f1369v);
                            C2411tQ c2411tQ = c1895jg.f5925N;
                            childAt.setRotation(c2411tQ.f7385z);
                            childAt.setRotationX(c2411tQ.f7381h);
                            childAt.setRotationY(c2411tQ.f7384v);
                            childAt.setScaleX(c2411tQ.f7376P);
                            childAt.setScaleY(c2411tQ.f7375N);
                            if (c2411tQ.f7382o != -1) {
                                if (((View) childAt.getParent()).findViewById(c2411tQ.f7382o) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c2411tQ.f7377Q)) {
                                    childAt.setPivotX(c2411tQ.f7377Q);
                                }
                                if (!Float.isNaN(c2411tQ.f7383u)) {
                                    childAt.setPivotY(c2411tQ.f7383u);
                                }
                            }
                            childAt.setTranslationX(c2411tQ.f7380W);
                            childAt.setTranslationY(c2411tQ.f7373G);
                            childAt.setTranslationZ(c2411tQ.f7374M);
                            if (c2411tQ.f7379V) {
                                childAt.setElevation(c2411tQ.f7378S);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    c0561ky = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            c0561ky = this;
            childCount = i;
        }
        int i5 = childCount;
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            C1895jg c1895jg2 = (C1895jg) hashMap.get(num);
            if (c1895jg2 != null) {
                C0689N2 c0689n22 = c1895jg2.f5926P;
                if (c0689n22.f2270EC == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0689n22.f2290U8;
                    if (iArr2 != null) {
                        barrier2.m1171M(iArr2);
                    } else {
                        String str4 = c0689n22.f2266BO;
                        if (str4 != null) {
                            int[] m1270v2 = m1270v(barrier2, str4);
                            c0689n22.f2290U8 = m1270v2;
                            barrier2.m1171M(m1270v2);
                        }
                    }
                    barrier2.f8875y = c0689n22.f2291UZ;
                    barrier2.f8873U.f1365d2 = c0689n22.f2314n0;
                    int i6 = ConstraintLayout.f8876c;
                    C1655f7 c1655f72 = new C1655f7();
                    barrier2.m1175V();
                    c1895jg2.m3536z(c1655f72);
                    constraintLayout.addView(barrier2, c1655f72);
                }
                if (c0689n22.f2330z) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    int i7 = ConstraintLayout.f8876c;
                    C1655f7 c1655f73 = new C1655f7();
                    c1895jg2.m3536z(c1655f73);
                    constraintLayout.addView(guideline, c1655f73);
                }
            }
        }
        for (int i8 = 0; i8 < i5; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof AbstractC0487JC) {
                ((AbstractC0487JC) childAt2).mo1172N(constraintLayout);
            }
        }
    }
}
