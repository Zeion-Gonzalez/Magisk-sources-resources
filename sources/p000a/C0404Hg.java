package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: a.Hg */
/* loaded from: classes.dex */
public final class C0404Hg {

    /* renamed from: z */
    public int f1370z = 0;

    /* renamed from: h */
    public int f1368h = 0;

    /* renamed from: v */
    public float f1369v = 1.0f;

    /* renamed from: P */
    public float f1367P = Float.NaN;

    /* renamed from: z */
    public final void m906z(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0917RG.f3158u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f1369v = obtainStyledAttributes.getFloat(index, this.f1369v);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f1370z);
                this.f1370z = i2;
                this.f1370z = C0561KY.f1829P[i2];
            } else if (index == 4) {
                this.f1368h = obtainStyledAttributes.getInt(index, this.f1368h);
            } else if (index == 3) {
                this.f1367P = obtainStyledAttributes.getFloat(index, this.f1367P);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
