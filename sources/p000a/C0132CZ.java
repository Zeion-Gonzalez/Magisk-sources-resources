package p000a;

import androidx.activity.C2752h;
import java.util.ListIterator;

/* renamed from: a.CZ */
/* loaded from: classes.dex */
public final class C0132CZ extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f452R;

    /* renamed from: w */
    public final /* synthetic */ C2752h f453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0132CZ(C2752h c2752h, int i) {
        super(1);
        this.f452R = i;
        this.f453w = c2752h;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f452R) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1499cG c1499cG = (C1499cG) obj;
                m261h();
                return c0329gj;
            default:
                C1499cG c1499cG2 = (C1499cG) obj;
                m261h();
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m261h() {
        int i = this.f452R;
        Object obj = null;
        C2752h c2752h = this.f453w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1200WR c1200wr = c2752h.f8637h;
                ListIterator listIterator = c1200wr.listIterator(c1200wr.mo1150h());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((AbstractC0356Gp) previous).f1205z) {
                            obj = previous;
                        }
                    }
                }
                c2752h.f8639v = (AbstractC0356Gp) obj;
                return;
            default:
                C1200WR c1200wr2 = c2752h.f8637h;
                ListIterator listIterator2 = c1200wr2.listIterator(c1200wr2.mo1150h());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((AbstractC0356Gp) previous2).f1205z) {
                            obj = previous2;
                        }
                    }
                }
                AbstractC0356Gp abstractC0356Gp = (AbstractC0356Gp) obj;
                return;
        }
    }
}
