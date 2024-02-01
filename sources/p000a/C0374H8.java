package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.H8 */
/* loaded from: classes.dex */
public final class C0374H8 extends AbstractC2467uU implements InterfaceC0645M7, InterfaceC1631eg {

    /* renamed from: I */
    public final C0639M1 f1276I;

    /* renamed from: R */
    public final C1195WL f1277R;

    /* renamed from: g */
    public final boolean f1278g;

    /* renamed from: k */
    public boolean f1279k;

    /* renamed from: q */
    public boolean f1280q;

    /* renamed from: w */
    public final boolean f1281w;

    public C0374H8(C1195WL c1195wl) {
        boolean z;
        boolean z2;
        boolean z3;
        C0639M1 m2687o;
        boolean z4;
        this.f1277R = c1195wl;
        boolean exists = c1195wl.f3885J.exists();
        if (!AbstractC1292YB.m2695u(c1195wl.f3886R, "riru-core") && !c1195wl.f3889Y.exists()) {
            z = false;
        } else {
            z = true;
        }
        if (exists && c1195wl.f3890c.exists()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && ((!(z4 = C1910jw.f5961W) || !z) && (z4 || !exists))) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f1281w = z3;
        if (z2) {
            m2687o = new C0639M1(R.string.zygisk_module_unloaded);
        } else if (z) {
            m2687o = AbstractC1292YB.m2687o(R.string.suspend_text_riru, new C0639M1(R.string.zygisk));
        } else {
            m2687o = AbstractC1292YB.m2687o(R.string.suspend_text_zygisk, new C0639M1(R.string.zygisk));
        }
        this.f1276I = m2687o;
        this.f1280q = !c1195wl.f3891f.exists();
        this.f1279k = c1195wl.f3883E.exists();
        this.f1278g = c1195wl.f3895r.exists();
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_module_md2;
    }

    /* renamed from: M */
    public final void m862M(boolean z) {
        C0357Gq m44z;
        int[] iArr = {9, 42};
        if (this.f1280q != z) {
            this.f1280q = z;
            for (int i = 0; i < 2; i++) {
                AbstractC0795Op.m1801B(this, iArr[i]);
            }
            AbstractC1062Tx abstractC1062Tx = this.f1277R.f3891f;
            if (z) {
                abstractC1062Tx.delete();
                m44z = AbstractC0017AI.m44z("copy_preinit_files");
            } else {
                abstractC1062Tx.createNewFile();
                m44z = AbstractC0017AI.m44z("copy_preinit_files");
            }
            m44z.m4631d2(null);
        }
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC1292YB.m2695u(this.f1277R.f3886R, ((C0374H8) interfaceC0645M7).f1277R.f3886R);
    }

    @Override // p000a.InterfaceC1631eg
    public final Object getItem() {
        return this.f1277R;
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C0374H8 c0374h8 = (C0374H8) interfaceC0645M7;
        return true;
    }
}
