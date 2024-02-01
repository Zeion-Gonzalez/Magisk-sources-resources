package p000a;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: a.Av */
/* loaded from: classes.dex */
public final class C0045Av extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ AbstractC2703z2 f190I;

    /* renamed from: R */
    public final /* synthetic */ Context f191R;

    /* renamed from: q */
    public final /* synthetic */ C1726gW f192q;

    /* renamed from: w */
    public final /* synthetic */ TextPaint f193w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045Av(C1726gW c1726gW, Context context, TextPaint textPaint, AbstractC2703z2 abstractC2703z2) {
        super(5);
        this.f192q = c1726gW;
        this.f191R = context;
        this.f193w = textPaint;
        this.f190I = abstractC2703z2;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: G5 */
    public final void mo91G5(Typeface typeface, boolean z) {
        this.f192q.m3261u(this.f191R, this.f193w, typeface);
        this.f190I.mo91G5(typeface, z);
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Pm */
    public final void mo92Pm(int i) {
        this.f190I.mo92Pm(i);
    }
}
