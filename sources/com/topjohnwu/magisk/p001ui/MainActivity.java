package com.topjohnwu.magisk.p001ui;

import android.view.MenuItem;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.widget.ConcealableBottomNavigationView;
import p000a.AbstractActivityC2427tj;
import p000a.AbstractC0438II;
import p000a.AbstractC0795Op;
import p000a.AbstractC1843ih;
import p000a.AbstractC1890ja;
import p000a.AbstractC2437tv;
import p000a.AbstractC2615xD;
import p000a.C0908R7;
import p000a.C1016T3;
import p000a.EnumC0511Je;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC2427tj {

    /* renamed from: nF */
    public static final /* synthetic */ int f9592nF = 0;

    /* renamed from: HL */
    public final int f9593HL;

    /* renamed from: Yd */
    public final int f9594Yd = R.layout.activity_main_md2;

    /* renamed from: od */
    public boolean f9595od;

    /* renamed from: qn */
    public final InterfaceC1841if f9596qn;

    public MainActivity() {
        int i = EnumC0511Je.f1697S;
        this.f9596qn = AbstractC0438II.m1020Z(new C0908R7(this, 0));
        this.f9593HL = R.id.main_nav_host;
        this.f9595od = true;
    }

    /* renamed from: Y */
    public static void m5134Y(MainActivity mainActivity, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        ConcealableBottomNavigationView concealableBottomNavigationView = ((AbstractC2437tv) mainActivity.m1924k()).f7464j;
        int i2 = 0;
        if (z2) {
            concealableBottomNavigationView.setVisibility(0);
            if (concealableBottomNavigationView.f9625g != z) {
                concealableBottomNavigationView.f9625g = z;
                concealableBottomNavigationView.refreshDrawableState();
                return;
            }
            return;
        }
        if (z) {
            i2 = 8;
        }
        concealableBottomNavigationView.setVisibility(i2);
    }

    /* renamed from: J */
    public final void m5135J(boolean z) {
        AbstractC0795Op.m1859nB(((AbstractC2437tv) m1924k()).f7463L);
        if (z) {
            MaterialToolbar materialToolbar = ((AbstractC2437tv) m1924k()).f7463L;
            materialToolbar.mo4746f(AbstractC1843ih.m3431X(materialToolbar.getContext(), R.drawable.ic_back_md2));
        } else {
            ((AbstractC2437tv) m1924k()).f7463L.mo4746f(null);
        }
    }

    @Override // p000a.AbstractActivityC0819PG
    /* renamed from: U */
    public final View mo1921U() {
        AbstractC1890ja m3581f = m3581f();
        View mo3518l = m3581f != null ? m3581f.mo3518l() : null;
        return mo3518l == null ? super.mo1921U() : mo3518l;
    }

    @Override // p000a.AbstractActivityC0819PG
    /* renamed from: g */
    public final int mo1923g() {
        return this.f9594Yd;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    @Override // p000a.AbstractActivityC0819PG
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1925s() {
        /*
            r5 = this;
            a.ja r0 = r5.m3581f()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.mo3519m()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            int r4 = r0.getVisibility()
            if (r4 != 0) goto L19
            r4 = r2
            goto L1a
        L19:
            r4 = r3
        L1a:
            if (r4 != r2) goto L1e
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 == 0) goto L23
            r1 = r0
            goto L3e
        L23:
            androidx.databinding.z r0 = r5.m1924k()
            a.tv r0 = (p000a.AbstractC2437tv) r0
            com.topjohnwu.magisk.widget.ConcealableBottomNavigationView r0 = r0.f7464j
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L32
            goto L33
        L32:
            r2 = r3
        L33:
            if (r2 == 0) goto L3e
            androidx.databinding.z r0 = r5.m1924k()
            a.tv r0 = (p000a.AbstractC2437tv) r0
            com.topjohnwu.magisk.widget.ConcealableBottomNavigationView r0 = r0.f7464j
            return r0
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topjohnwu.magisk.p001ui.MainActivity.mo1925s():android.view.View");
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1016T3) this.f9596qn.getValue();
    }
}
