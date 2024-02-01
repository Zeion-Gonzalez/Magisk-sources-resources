package p000a;

/* renamed from: a.HT */
/* loaded from: classes.dex */
public abstract class AbstractC0394HT {

    /* renamed from: z */
    public final Object f1323z;

    public AbstractC0394HT(C1710g8 c1710g8) {
        this.f1323z = c1710g8;
    }

    /* renamed from: h */
    public final boolean m887h(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            InterfaceC1928kH interfaceC1928kH = (InterfaceC1928kH) this.f1323z;
            if (interfaceC1928kH == null) {
                return mo888z();
            }
            int mo3244v = interfaceC1928kH.mo3244v(charSequence, i);
            if (mo3244v == 0) {
                return true;
            }
            if (mo3244v != 1) {
                return mo888z();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public abstract boolean mo888z();
}
