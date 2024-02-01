package p000a;

import android.view.View;

/* renamed from: a.Wd */
/* loaded from: classes.dex */
public final class C1211Wd extends AbstractC1292YB {

    /* renamed from: I */
    public int f3936I;

    /* renamed from: R */
    public final /* synthetic */ int f3937R;

    /* renamed from: q */
    public final /* synthetic */ Object f3938q;

    /* renamed from: w */
    public boolean f3939w;

    public C1211Wd(C2444u1 c2444u1, int i) {
        this.f3937R = 1;
        this.f3938q = c2444u1;
        this.f3936I = i;
        this.f3939w = false;
    }

    @Override // p000a.AbstractC1292YB, p000a.InterfaceC0579Kq
    /* renamed from: h */
    public final void mo1309h(View view) {
        switch (this.f3937R) {
            case 1:
                this.f3939w = true;
                return;
            default:
                return;
        }
    }

    @Override // p000a.AbstractC1292YB, p000a.InterfaceC0579Kq
    /* renamed from: v */
    public final void mo1310v() {
        int i = this.f3937R;
        Object obj = this.f3938q;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!this.f3939w) {
                    this.f3939w = true;
                    InterfaceC0579Kq interfaceC0579Kq = ((C1583do) obj).f4867P;
                    if (interfaceC0579Kq != null) {
                        interfaceC0579Kq.mo1310v();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((C2444u1) obj).f7482z.setVisibility(0);
                return;
        }
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: z */
    public final void mo1311z() {
        int i = this.f3937R;
        Object obj = this.f3938q;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = this.f3936I + 1;
                this.f3936I = i2;
                C1583do c1583do = (C1583do) obj;
                if (i2 == c1583do.f4871z.size()) {
                    InterfaceC0579Kq interfaceC0579Kq = c1583do.f4867P;
                    if (interfaceC0579Kq != null) {
                        interfaceC0579Kq.mo1311z();
                    }
                    this.f3936I = 0;
                    this.f3939w = false;
                    c1583do.f4866N = false;
                    return;
                }
                return;
            default:
                if (!this.f3939w) {
                    ((C2444u1) obj).f7482z.setVisibility(this.f3936I);
                    return;
                }
                return;
        }
    }

    public C1211Wd(C1583do c1583do) {
        this.f3937R = 0;
        this.f3938q = c1583do;
        this.f3939w = false;
        this.f3936I = 0;
    }
}
