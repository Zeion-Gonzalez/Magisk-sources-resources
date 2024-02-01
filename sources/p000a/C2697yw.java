package p000a;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: a.yw */
/* loaded from: classes.dex */
public final class C2697yw extends AbstractC2092nP {

    /* renamed from: I */
    public final /* synthetic */ C1651f2 f8509I;

    /* renamed from: w */
    public final ArrayDeque f8510w;

    public C2697yw(C1651f2 c1651f2) {
        this.f8509I = c1651f2;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f8510w = arrayDeque;
        boolean isDirectory = c1651f2.f5120z.isDirectory();
        File file = c1651f2.f5120z;
        if (isDirectory) {
            arrayDeque.push(m4617h(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C0972SF(file));
        } else {
            this.f6458S = EnumC1988lP.f6166w;
        }
    }

    /* renamed from: h */
    public final AbstractC1223Wq m4617h(File file) {
        int ordinal = this.f8509I.f5119h.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new C1860j3(this, file);
            }
            throw new C0993Sd();
        }
        return new C0824PN(this, file);
    }

    @Override // p000a.AbstractC2092nP
    /* renamed from: z */
    public final void mo3170z() {
        File file;
        File mo890z;
        while (true) {
            ArrayDeque arrayDeque = this.f8510w;
            AbstractC0396HW abstractC0396HW = (AbstractC0396HW) arrayDeque.peek();
            if (abstractC0396HW == null) {
                file = null;
                break;
            }
            mo890z = abstractC0396HW.mo890z();
            if (mo890z == null) {
                arrayDeque.pop();
            } else {
                if (AbstractC1292YB.m2695u(mo890z, abstractC0396HW.f1326z) || !mo890z.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f8509I.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(m4617h(mo890z));
                }
            }
        }
        file = mo890z;
        if (file != null) {
            this.f6457R = file;
            this.f6458S = EnumC1988lP.f6165S;
        } else {
            this.f6458S = EnumC1988lP.f6166w;
        }
    }
}
