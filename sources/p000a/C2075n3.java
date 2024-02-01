package p000a;

import android.content.res.Resources;

/* renamed from: a.n3 */
/* loaded from: classes.dex */
public final class C2075n3 extends AbstractC2222pt {

    /* renamed from: h */
    public final /* synthetic */ AbstractC1881jR f6430h;

    public C2075n3(AbstractC1881jR abstractC1881jR) {
        this.f6430h = abstractC1881jR;
    }

    @Override // p000a.AbstractC2222pt
    /* renamed from: z */
    public final CharSequence mo1433z(Resources resources) {
        AbstractC1881jR abstractC1881jR = this.f6430h;
        String[] mo1576U = abstractC1881jR.mo1576U(resources);
        int intValue = ((Number) abstractC1881jR.mo236y()).intValue();
        if (intValue >= 0 && intValue <= mo1576U.length - 1) {
            return mo1576U[intValue];
        }
        return "";
    }
}
