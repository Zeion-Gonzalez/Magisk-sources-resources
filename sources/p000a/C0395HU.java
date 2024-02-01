package p000a;

import androidx.activity.C2752h;
import java.util.ListIterator;

/* renamed from: a.HU */
/* loaded from: classes.dex */
public final class C0395HU extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: R */
    public final /* synthetic */ int f1324R;

    /* renamed from: w */
    public final /* synthetic */ C2752h f1325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0395HU(C2752h c2752h, int i) {
        super(0);
        this.f1324R = i;
        this.f1325w = c2752h;
    }

    /* renamed from: h */
    public final void m889h() {
        Object obj;
        int i = this.f1324R;
        C2752h c2752h = this.f1325w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c2752h.m4683h();
                return;
            case 1:
                C1200WR c1200wr = c2752h.f8637h;
                ListIterator listIterator = c1200wr.listIterator(c1200wr.mo1150h());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((AbstractC0356Gp) obj).f1205z) {
                        }
                    } else {
                        obj = null;
                    }
                }
                AbstractC0356Gp abstractC0356Gp = (AbstractC0356Gp) obj;
                c2752h.f8639v = null;
                return;
            default:
                c2752h.m4683h();
                return;
        }
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo93z() {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f1324R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m889h();
                return c0329gj;
            case 1:
                m889h();
                return c0329gj;
            default:
                m889h();
                return c0329gj;
        }
    }
}
