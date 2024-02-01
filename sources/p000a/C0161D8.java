package p000a;

import java.io.Serializable;

/* renamed from: a.D8 */
/* loaded from: classes.dex */
public final class C0161D8 implements InterfaceC1841if, Serializable {

    /* renamed from: R */
    public Object f519R = C1710g8.f5385y;

    /* renamed from: S */
    public InterfaceC1459bP f520S;

    public C0161D8(InterfaceC1459bP interfaceC1459bP) {
        this.f520S = interfaceC1459bP;
    }

    @Override // p000a.InterfaceC1841if
    public final Object getValue() {
        if (this.f519R == C1710g8.f5385y) {
            this.f519R = this.f520S.mo93z();
            this.f520S = null;
        }
        return this.f519R;
    }

    public final String toString() {
        boolean z;
        if (this.f519R != C1710g8.f5385y) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
