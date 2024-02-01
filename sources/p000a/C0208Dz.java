package p000a;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: a.Dz */
/* loaded from: classes.dex */
public final class C0208Dz extends AbstractC0663MY {

    /* renamed from: N */
    public final /* synthetic */ int f663N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0208Dz(C1997lY c1997lY, int i) {
        super(c1997lY);
        this.f663N = i;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: k */
    public final void mo415k() {
        switch (this.f663N) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1997lY c1997lY = this.f2150h;
                c1997lY.f6202r = null;
                CheckableImageButton checkableImageButton = c1997lY.f6199k;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0795Op.m1825Pm(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
