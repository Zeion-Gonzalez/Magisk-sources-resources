package p000a;

import android.graphics.drawable.Drawable;
import com.topjohnwu.magisk.R;

/* renamed from: a.eG */
/* loaded from: classes.dex */
public final class C1608eG extends AbstractC2467uU implements InterfaceC0645M7, InterfaceC1631eg {

    /* renamed from: I */
    public final String f4926I;

    /* renamed from: R */
    public final C1353ZK f4927R;

    /* renamed from: g */
    public final String f4928g;

    /* renamed from: k */
    public final Drawable f4929k;

    /* renamed from: q */
    public final boolean f4930q;

    /* renamed from: w */
    public final C2531vd f4931w;

    /* renamed from: y */
    public boolean f4932y;

    public C1608eG(C1353ZK c1353zk, C2531vd c2531vd, String str, boolean z, Drawable drawable, String str2) {
        this.f4927R = c1353zk;
        this.f4931w = c2531vd;
        this.f4926I = str;
        this.f4930q = z;
        this.f4929k = drawable;
        this.f4928g = str2;
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_policy_md2;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC1292YB.m2695u(this.f4926I, ((C1608eG) interfaceC0645M7).f4926I);
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return this.f4931w;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        if (this.f4931w.f7749h == ((C1608eG) interfaceC0645M7).f4931w.f7749h) {
            return true;
        }
        return false;
    }
}
