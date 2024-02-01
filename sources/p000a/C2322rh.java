package p000a;

import android.graphics.Rect;

/* renamed from: a.rh */
/* loaded from: classes.dex */
public final class C2322rh implements InterfaceC1029TJ {

    /* renamed from: S */
    public final Rect f7150S;

    public C2322rh(Rect rect) {
        this.f7150S = rect;
    }

    @Override // p000a.InterfaceC1029TJ
    /* renamed from: Q */
    public final Object mo2202Q(Object obj, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        int i;
        int i2;
        int i3;
        C2739zj c2739zj = (C2739zj) obj;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        boolean booleanValue4 = bool4.booleanValue();
        Rect rect = this.f7150S;
        int i4 = rect.left;
        int i5 = 0;
        if (booleanValue) {
            i = c2739zj.f8594z;
        } else {
            i = 0;
        }
        rect.left = i4 + i;
        int i6 = rect.top;
        if (booleanValue2) {
            i2 = c2739zj.f8592h;
        } else {
            i2 = 0;
        }
        rect.top = i6 + i2;
        int i7 = rect.right;
        if (booleanValue3) {
            i3 = c2739zj.f8593v;
        } else {
            i3 = 0;
        }
        rect.right = i7 + i3;
        int i8 = rect.bottom;
        if (booleanValue4) {
            i5 = c2739zj.f8591P;
        }
        rect.bottom = i8 + i5;
        return C0329GJ.f1115z;
    }
}
