package p000a;

/* renamed from: a.qF */
/* loaded from: classes.dex */
public enum EnumC2241qF {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final C2181p5 Companion = new C2181p5();

    EnumC2241qF() {
    }

    /* renamed from: z */
    public final EnumC1632eh m3881z() {
        switch (AbstractC2695ys.f8500z[ordinal()]) {
            case 1:
            case 2:
                return EnumC1632eh.f5092w;
            case 3:
            case 4:
                return EnumC1632eh.f5087I;
            case 5:
                return EnumC1632eh.f5091q;
            case 6:
                return EnumC1632eh.f5089S;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
