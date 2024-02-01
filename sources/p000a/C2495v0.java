package p000a;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: a.v0 */
/* loaded from: classes.dex */
public final class C2495v0 {

    /* renamed from: h */
    public final View f7630h;

    /* renamed from: z */
    public final HashMap f7632z = new HashMap();

    /* renamed from: v */
    public final ArrayList f7631v = new ArrayList();

    public C2495v0(View view) {
        this.f7630h = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2495v0)) {
            return false;
        }
        C2495v0 c2495v0 = (C2495v0) obj;
        return this.f7630h == c2495v0.f7630h && this.f7632z.equals(c2495v0.f7632z);
    }

    public final int hashCode() {
        return this.f7632z.hashCode() + (this.f7630h.hashCode() * 31);
    }

    public final String toString() {
        String m4195W = AbstractC2441tz.m4195W(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7630h + "\n", "    values:");
        HashMap hashMap = this.f7632z;
        for (String str : hashMap.keySet()) {
            m4195W = m4195W + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m4195W;
    }
}
