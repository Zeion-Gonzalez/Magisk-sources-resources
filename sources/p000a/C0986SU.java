package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: a.SU */
/* loaded from: classes.dex */
public final class C0986SU {

    /* renamed from: G */
    public static final SparseIntArray f3320G;

    /* renamed from: z */
    public int f3329z = -1;

    /* renamed from: h */
    public int f3325h = 0;

    /* renamed from: v */
    public int f3328v = -1;

    /* renamed from: P */
    public float f3322P = Float.NaN;

    /* renamed from: N */
    public float f3321N = Float.NaN;

    /* renamed from: Q */
    public float f3323Q = Float.NaN;

    /* renamed from: u */
    public int f3327u = -1;

    /* renamed from: o */
    public String f3326o = null;

    /* renamed from: W */
    public int f3324W = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3320G = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: z */
    public final void m2162z(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0917RG.f3154Q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f3320G.get(index)) {
                case 1:
                    this.f3321N = obtainStyledAttributes.getFloat(index, this.f3321N);
                    break;
                case 2:
                    this.f3328v = obtainStyledAttributes.getInt(index, this.f3328v);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1843ih.f5760w[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3329z = C0561KY.m1267Q(obtainStyledAttributes, index, this.f3329z);
                    break;
                case 6:
                    this.f3325h = obtainStyledAttributes.getInteger(index, this.f3325h);
                    break;
                case 7:
                    this.f3322P = obtainStyledAttributes.getFloat(index, this.f3322P);
                    break;
                case 8:
                    this.f3327u = obtainStyledAttributes.getInteger(index, this.f3327u);
                    break;
                case 9:
                    this.f3323Q = obtainStyledAttributes.getFloat(index, this.f3323Q);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3326o = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.f3324W);
                            break;
                        }
                    }
                    this.f3324W = obtainStyledAttributes.getResourceId(index, -1);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
