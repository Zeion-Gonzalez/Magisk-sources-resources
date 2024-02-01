package p000a;

/* renamed from: a.JY */
/* loaded from: classes.dex */
public final /* synthetic */ class C0505JY extends AbstractC0447IV implements InterfaceC0559KW {
    public C0505JY(C0471Iu c0471Iu) {
        super(2, c0471Iu, C0471Iu.class, "onProgressUpdate", "onProgressUpdate(FLcom/topjohnwu/magisk/core/download/Subject;)V");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        C0471Iu c0471Iu = (C0471Iu) this.f6652R;
        c0471Iu.getClass();
        if (((AbstractC0164DB) obj2) instanceof C2642xo) {
            float f = floatValue * 100.0f;
            if (!Float.isNaN(f)) {
                int round = Math.round(f);
                if (c0471Iu.f1571r != round) {
                    c0471Iu.f1571r = round;
                    c0471Iu.mo1709Q(37);
                }
            } else {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
        }
        return C0329GJ.f1115z;
    }
}
