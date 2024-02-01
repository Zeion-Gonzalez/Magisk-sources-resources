package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: a.tQ */
/* loaded from: classes.dex */
public final class C2411tQ {

    /* renamed from: R */
    public static final SparseIntArray f7372R;

    /* renamed from: z */
    public float f7385z = 0.0f;

    /* renamed from: h */
    public float f7381h = 0.0f;

    /* renamed from: v */
    public float f7384v = 0.0f;

    /* renamed from: P */
    public float f7376P = 1.0f;

    /* renamed from: N */
    public float f7375N = 1.0f;

    /* renamed from: Q */
    public float f7377Q = Float.NaN;

    /* renamed from: u */
    public float f7383u = Float.NaN;

    /* renamed from: o */
    public int f7382o = -1;

    /* renamed from: W */
    public float f7380W = 0.0f;

    /* renamed from: G */
    public float f7373G = 0.0f;

    /* renamed from: M */
    public float f7374M = 0.0f;

    /* renamed from: V */
    public boolean f7379V = false;

    /* renamed from: S */
    public float f7378S = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7372R = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: z */
    public final void m4167z(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0917RG.f3155W);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f7372R.get(index)) {
                case 1:
                    this.f7385z = obtainStyledAttributes.getFloat(index, this.f7385z);
                    break;
                case 2:
                    this.f7381h = obtainStyledAttributes.getFloat(index, this.f7381h);
                    break;
                case 3:
                    this.f7384v = obtainStyledAttributes.getFloat(index, this.f7384v);
                    break;
                case 4:
                    this.f7376P = obtainStyledAttributes.getFloat(index, this.f7376P);
                    break;
                case 5:
                    this.f7375N = obtainStyledAttributes.getFloat(index, this.f7375N);
                    break;
                case 6:
                    this.f7377Q = obtainStyledAttributes.getDimension(index, this.f7377Q);
                    break;
                case 7:
                    this.f7383u = obtainStyledAttributes.getDimension(index, this.f7383u);
                    break;
                case 8:
                    this.f7380W = obtainStyledAttributes.getDimension(index, this.f7380W);
                    break;
                case 9:
                    this.f7373G = obtainStyledAttributes.getDimension(index, this.f7373G);
                    break;
                case 10:
                    this.f7374M = obtainStyledAttributes.getDimension(index, this.f7374M);
                    break;
                case 11:
                    this.f7379V = true;
                    this.f7378S = obtainStyledAttributes.getDimension(index, this.f7378S);
                    break;
                case 12:
                    this.f7382o = C0561KY.m1267Q(obtainStyledAttributes, index, this.f7382o);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
