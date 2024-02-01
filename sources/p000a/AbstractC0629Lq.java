package p000a;

import java.util.Arrays;

/* renamed from: a.Lq */
/* loaded from: classes.dex */
public abstract class AbstractC0629Lq {

    /* renamed from: R */
    public int f2042R;

    /* renamed from: S */
    public AbstractC0399Ha[] f2043S;

    /* renamed from: w */
    public int f2044w;

    /* renamed from: N */
    public abstract AbstractC0399Ha[] mo1392N();

    /* renamed from: P */
    public abstract AbstractC0399Ha mo1393P();

    /* renamed from: Q */
    public final void m1394Q(AbstractC0399Ha abstractC0399Ha) {
        int i;
        InterfaceC1171Vv[] mo243h;
        synchronized (this) {
            int i2 = this.f2042R - 1;
            this.f2042R = i2;
            if (i2 == 0) {
                this.f2044w = 0;
            }
            mo243h = abstractC0399Ha.mo243h(this);
        }
        for (InterfaceC1171Vv interfaceC1171Vv : mo243h) {
            if (interfaceC1171Vv != null) {
                interfaceC1171Vv.mo320u(C0329GJ.f1115z);
            }
        }
    }

    /* renamed from: v */
    public final AbstractC0399Ha m1395v() {
        AbstractC0399Ha abstractC0399Ha;
        synchronized (this) {
            AbstractC0399Ha[] abstractC0399HaArr = this.f2043S;
            if (abstractC0399HaArr == null) {
                abstractC0399HaArr = mo1392N();
                this.f2043S = abstractC0399HaArr;
            } else if (this.f2042R >= abstractC0399HaArr.length) {
                Object[] copyOf = Arrays.copyOf(abstractC0399HaArr, abstractC0399HaArr.length * 2);
                this.f2043S = (AbstractC0399Ha[]) copyOf;
                abstractC0399HaArr = (AbstractC0399Ha[]) copyOf;
            }
            int i = this.f2044w;
            do {
                abstractC0399Ha = abstractC0399HaArr[i];
                if (abstractC0399Ha == null) {
                    abstractC0399Ha = mo1393P();
                    abstractC0399HaArr[i] = abstractC0399Ha;
                }
                i++;
                if (i >= abstractC0399HaArr.length) {
                    i = 0;
                }
            } while (!abstractC0399Ha.mo244z(this));
            this.f2044w = i;
            this.f2042R++;
        }
        return abstractC0399Ha;
    }
}
