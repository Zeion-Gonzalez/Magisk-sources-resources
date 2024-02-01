package p000a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.AF */
/* loaded from: classes.dex */
public final class C0014AF extends AbstractC2392t {

    /* renamed from: h */
    public final AbstractC0883Qb f104h;

    /* renamed from: v */
    public final Serializable f105v;

    /* renamed from: z */
    public final /* synthetic */ int f106z;

    public C0014AF() {
        this.f106z = 1;
        this.f104h = new C2379sk();
        this.f105v = new ArrayList();
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        int i = this.f106z;
        AbstractC0883Qb abstractC0883Qb = this.f104h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C0025AS) abstractC0883Qb;
            default:
                return (C2379sk) abstractC0883Qb;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: Q */
    public final void mo40Q(C2105nf c2105nf) {
        switch (this.f106z) {
            case AbstractC0795Op.f2698E /* 0 */:
                c2105nf.m3728Q((String) this.f105v, (C0025AS) this.f104h);
                return;
            default:
                return;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        switch (this.f106z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return null;
            default:
                C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
                if (c1858j0.f5808u >= 4) {
                    return new C1253XQ(-1, c1858j0.f5809v + 4, false);
                }
                if (!c1858j0.f5807o) {
                    return null;
                }
                return C1253XQ.m2558z(c1858j0.f5799N);
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: v */
    public final void mo42v() {
        int i;
        boolean z;
        switch (this.f106z) {
            case 1:
                List list = (List) this.f105v;
                int size = list.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) list.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            size--;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) list.get(i));
                    sb.append('\n');
                }
                ((C2379sk) this.f104h).f7309Q = sb.toString();
                return;
            default:
                return;
        }
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: z */
    public final void mo43z(CharSequence charSequence) {
        switch (this.f106z) {
            case 1:
                ((List) this.f105v).add(charSequence);
                return;
            default:
                return;
        }
    }

    public C0014AF(int i, String str) {
        this.f106z = 0;
        C0025AS c0025as = new C0025AS();
        this.f104h = c0025as;
        c0025as.f143Q = i;
        this.f105v = str;
    }
}
