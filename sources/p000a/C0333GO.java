package p000a;

import android.view.View;
import android.view.WindowId;

/* renamed from: a.GO */
/* loaded from: classes.dex */
public final class C0333GO implements InterfaceC1916k2 {

    /* renamed from: z */
    public final WindowId f1132z;

    public C0333GO(View view) {
        this.f1132z = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0333GO) && ((C0333GO) obj).f1132z.equals(this.f1132z);
    }

    public final int hashCode() {
        return this.f1132z.hashCode();
    }
}
