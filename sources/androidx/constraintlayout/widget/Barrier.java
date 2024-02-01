package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.AbstractC0487JC;
import p000a.AbstractC0917RG;
import p000a.C0403Hf;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0487JC {

    /* renamed from: U */
    public C0403Hf f8873U;

    /* renamed from: s */
    public int f8874s;

    /* renamed from: y */
    public int f8875y;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000b, code lost:
    
        if (r0 == 6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0012, code lost:
    
        if (r0 == 6) goto L29;
     */
    @Override // p000a.AbstractC0487JC
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1178o(p000a.C1628ed r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f8875y
            r3.f8874s = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f8874s = r5
        L17:
            boolean r5 = r4 instanceof p000a.C0403Hf
            if (r5 == 0) goto L21
            a.Hf r4 = (p000a.C0403Hf) r4
            int r5 = r3.f8874s
            r4.f1364G5 = r5
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo1178o(a.ed, boolean):void");
    }

    @Override // p000a.AbstractC0487JC
    /* renamed from: u */
    public final void mo1179u(AttributeSet attributeSet) {
        super.mo1179u(attributeSet);
        this.f8873U = new C0403Hf();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0917RG.f3156h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.f8875y = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f8873U.f1363BX = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f8873U.f1365d2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1633I = this.f8873U;
        m1175V();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
