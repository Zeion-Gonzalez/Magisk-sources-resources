package p000a;

import android.content.res.Resources;

/* renamed from: a.M1 */
/* loaded from: classes.dex */
public class C0639M1 extends AbstractC2222pt {

    /* renamed from: h */
    public final int f2064h;

    public C0639M1(int i) {
        this.f2064h = i;
    }

    @Override // p000a.AbstractC2222pt
    /* renamed from: h */
    public final boolean mo1431h() {
        return this.f2064h == 0;
    }

    @Override // p000a.AbstractC2222pt
    /* renamed from: v */
    public String mo1433z(Resources resources) {
        return resources.getString(this.f2064h);
    }
}
