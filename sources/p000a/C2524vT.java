package p000a;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.vT */
/* loaded from: classes.dex */
public class C2524vT extends AbstractC0614LY {

    /* renamed from: d */
    public int f7731d;

    /* renamed from: L */
    public ArrayList f7729L = new ArrayList();

    /* renamed from: i */
    public boolean f7732i = true;

    /* renamed from: O */
    public boolean f7730O = false;

    /* renamed from: n */
    public int f7733n = 0;

    @Override // p000a.AbstractC0614LY
    /* renamed from: C */
    public final void mo1359C(C1219Wm c1219Wm) {
        super.mo1359C(c1219Wm);
        this.f7733n |= 4;
        if (this.f7729L != null) {
            for (int i = 0; i < this.f7729L.size(); i++) {
                ((AbstractC0614LY) this.f7729L.get(i)).mo1359C(c1219Wm);
            }
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: F */
    public final void mo1361F(AbstractC1500cH abstractC1500cH) {
        this.f1996F = abstractC1500cH;
        this.f7733n |= 8;
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1361F(abstractC1500cH);
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: H */
    public final void mo1362H(ViewGroup viewGroup) {
        super.mo1362H(viewGroup);
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1362H(viewGroup);
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: J */
    public final void mo1364J(InterfaceC2728zV interfaceC2728zV) {
        super.mo1364J(interfaceC2728zV);
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: N */
    public final void mo292N(C2495v0 c2495v0) {
        View view = c2495v0.f7630h;
        if (m1376f(view)) {
            Iterator it = this.f7729L.iterator();
            while (it.hasNext()) {
                AbstractC0614LY abstractC0614LY = (AbstractC0614LY) it.next();
                if (abstractC0614LY.m1376f(view)) {
                    abstractC0614LY.mo292N(c2495v0);
                    c2495v0.f7631v.add(abstractC0614LY);
                }
            }
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: O */
    public final void mo1371X(long j) {
        ArrayList arrayList;
        this.f2014w = j;
        if (j >= 0 && (arrayList = this.f7729L) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0614LY) this.f7729L.get(i)).mo1371X(j);
            }
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: S */
    public final AbstractC0614LY clone() {
        C2524vT c2524vT = (C2524vT) super.clone();
        c2524vT.f7729L = new ArrayList();
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            AbstractC0614LY clone = ((AbstractC0614LY) this.f7729L.get(i)).clone();
            c2524vT.f7729L.add(clone);
            clone.f2002U = c2524vT;
        }
        return c2524vT;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: Y */
    public final void mo1372Y(View view) {
        super.mo1372Y(view);
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1372Y(view);
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: c */
    public final void mo1374c(View view) {
        for (int i = 0; i < this.f7729L.size(); i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1374c(view);
        }
        this.f2010k.remove(view);
    }

    @Override // p000a.AbstractC0614LY
    public final void cancel() {
        super.cancel();
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).cancel();
        }
    }

    /* renamed from: d */
    public final void m4358d(AbstractC0614LY abstractC0614LY) {
        this.f7729L.add(abstractC0614LY);
        abstractC0614LY.f2002U = this;
        long j = this.f2014w;
        if (j >= 0) {
            abstractC0614LY.mo1371X(j);
        }
        if ((this.f7733n & 1) != 0) {
            abstractC0614LY.mo1373Z(this.f1998I);
        }
        if ((this.f7733n & 2) != 0) {
            abstractC0614LY.mo1380p();
        }
        if ((this.f7733n & 4) != 0) {
            abstractC0614LY.mo1359C(this.f2005Z);
        }
        if ((this.f7733n & 8) != 0) {
            abstractC0614LY.mo1361F(this.f1996F);
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: e */
    public final void mo1375e() {
        if (this.f7729L.isEmpty()) {
            m1365L();
            m1363I();
            return;
        }
        C0558KV c0558kv = new C0558KV(this);
        Iterator it = this.f7729L.iterator();
        while (it.hasNext()) {
            ((AbstractC0614LY) it.next()).mo1385z(c0558kv);
        }
        this.f7731d = this.f7729L.size();
        if (!this.f7732i) {
            for (int i = 1; i < this.f7729L.size(); i++) {
                ((AbstractC0614LY) this.f7729L.get(i - 1)).mo1385z(new C0107C5(this, 2, (AbstractC0614LY) this.f7729L.get(i)));
            }
            AbstractC0614LY abstractC0614LY = (AbstractC0614LY) this.f7729L.get(0);
            if (abstractC0614LY != null) {
                abstractC0614LY.mo1375e();
                return;
            }
            return;
        }
        Iterator it2 = this.f7729L.iterator();
        while (it2.hasNext()) {
            ((AbstractC0614LY) it2.next()).mo1375e();
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: i */
    public final String mo1377i(String str) {
        String mo1377i = super.mo1377i(str);
        for (int i = 0; i < this.f7729L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo1377i);
            sb.append("\n");
            sb.append(((AbstractC0614LY) this.f7729L.get(i)).mo1377i(str + "  "));
            mo1377i = sb.toString();
        }
        return mo1377i;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: j */
    public final void mo1378j(long j) {
        this.f2000R = j;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: n */
    public final void mo1373Z(TimeInterpolator timeInterpolator) {
        this.f7733n |= 1;
        ArrayList arrayList = this.f7729L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0614LY) this.f7729L.get(i)).mo1373Z(timeInterpolator);
            }
        }
        this.f1998I = timeInterpolator;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: o */
    public final void mo295o(C2495v0 c2495v0) {
        View view = c2495v0.f7630h;
        if (m1376f(view)) {
            Iterator it = this.f7729L.iterator();
            while (it.hasNext()) {
                AbstractC0614LY abstractC0614LY = (AbstractC0614LY) it.next();
                if (abstractC0614LY.m1376f(view)) {
                    abstractC0614LY.mo295o(c2495v0);
                    c2495v0.f7631v.add(abstractC0614LY);
                }
            }
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: p */
    public final void mo1380p() {
        this.f7733n |= 2;
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1380p();
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: q */
    public final void mo1381q() {
        for (int i = 0; i < this.f7729L.size(); i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1381q();
        }
        super.mo1381q();
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: u */
    public final void mo1382u(C2495v0 c2495v0) {
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1382u(c2495v0);
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: v */
    public final void mo1383v(View view) {
        for (int i = 0; i < this.f7729L.size(); i++) {
            ((AbstractC0614LY) this.f7729L.get(i)).mo1383v(view);
        }
        this.f2010k.add(view);
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: w */
    public final void mo1384w(ViewGroup viewGroup, C0525Ju c0525Ju, C0525Ju c0525Ju2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f2000R;
        int size = this.f7729L.size();
        for (int i = 0; i < size; i++) {
            AbstractC0614LY abstractC0614LY = (AbstractC0614LY) this.f7729L.get(i);
            if (j > 0 && (this.f7732i || i == 0)) {
                long j2 = abstractC0614LY.f2000R;
                if (j2 > 0) {
                    abstractC0614LY.mo1378j(j2 + j);
                } else {
                    abstractC0614LY.mo1378j(j);
                }
            }
            abstractC0614LY.mo1384w(viewGroup, c0525Ju, c0525Ju2, arrayList, arrayList2);
        }
    }

    /* renamed from: x */
    public final void m4360x(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f7732i = false;
                return;
            }
            throw new AndroidRuntimeException(AbstractC2441tz.m4188N("Invalid parameter for TransitionSet ordering: ", i));
        }
        this.f7732i = true;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: z */
    public final void mo1385z(InterfaceC2728zV interfaceC2728zV) {
        super.mo1385z(interfaceC2728zV);
    }
}
