package p000a;

import android.graphics.Typeface;

/* renamed from: a.XF */
/* loaded from: classes.dex */
public final class C1245XF extends AbstractC2703z2 {

    /* renamed from: R */
    public final /* synthetic */ AbstractC2703z2 f4041R;

    /* renamed from: w */
    public final /* synthetic */ C1726gW f4042w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245XF(C1726gW c1726gW, AbstractC2703z2 abstractC2703z2) {
        super(2);
        this.f4042w = c1726gW;
        this.f4041R = abstractC2703z2;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Pm */
    public final void mo92Pm(int i) {
        this.f4042w.f5439S = true;
        this.f4041R.mo92Pm(i);
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: oI */
    public final void mo777oI(Typeface typeface) {
        C1726gW c1726gW = this.f4042w;
        c1726gW.f5438R = Typeface.create(typeface, c1726gW.f5445v);
        c1726gW.f5439S = true;
        this.f4041R.mo91G5(c1726gW.f5438R, false);
    }
}
