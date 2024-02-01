package p000a;

import java.io.Serializable;

/* renamed from: a.VR */
/* loaded from: classes.dex */
public final class C1146VR implements InterfaceC1841if, Serializable {

    /* renamed from: S */
    public InterfaceC1459bP f3729S;

    /* renamed from: R */
    public volatile Object f3728R = C1710g8.f5385y;

    /* renamed from: w */
    public final Object f3730w = this;

    public C1146VR(InterfaceC1459bP interfaceC1459bP) {
        this.f3729S = interfaceC1459bP;
    }

    @Override // p000a.InterfaceC1841if
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f3728R;
        C1710g8 c1710g8 = C1710g8.f5385y;
        if (obj2 != c1710g8) {
            return obj2;
        }
        synchronized (this.f3730w) {
            obj = this.f3728R;
            if (obj == c1710g8) {
                obj = this.f3729S.mo93z();
                this.f3728R = obj;
                this.f3729S = null;
            }
        }
        return obj;
    }

    public final String toString() {
        boolean z;
        if (this.f3728R != C1710g8.f5385y) {
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
