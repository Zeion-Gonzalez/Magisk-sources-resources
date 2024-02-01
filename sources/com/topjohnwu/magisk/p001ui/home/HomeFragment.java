package com.topjohnwu.magisk.p001ui.home;

import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC0865QC;
import p000a.AbstractC1375Zj;
import p000a.AbstractC1441b1;
import p000a.AbstractC1588du;
import p000a.AbstractC1890ja;
import p000a.AbstractC2230q2;
import p000a.AbstractC2615xD;
import p000a.AbstractServiceC1020T7;
import p000a.C0366Gz;
import p000a.C0466Io;
import p000a.C0471Iu;
import p000a.C0505JY;
import p000a.C0908R7;
import p000a.C1104Uh;
import p000a.C1112Up;
import p000a.C1420ag;
import p000a.C1505cN;
import p000a.C1910jw;
import p000a.C2670yQ;
import p000a.EnumC0511Je;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1841if;
import p000a.RunnableC1547d8;

/* loaded from: classes.dex */
public final class HomeFragment extends AbstractC1890ja<AbstractC1588du> implements InterfaceC1503cL {

    /* renamed from: BO */
    public static final /* synthetic */ int f9604BO = 0;

    /* renamed from: EC */
    public final int f9605EC = R.layout.fragment_home_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9606U8;

    public HomeFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9606U8 = AbstractC0438II.m1020Z(new C0908R7(this, 3));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9605EC;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: N */
    public final boolean mo2519N(MenuItem menuItem) {
        boolean isRebootingUserspaceSupported;
        C0366Gz c0366Gz;
        C1420ag m4335Q;
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (itemId != R.id.action_reboot) {
            if (itemId != R.id.action_settings) {
                return false;
            }
            C0466Io c0466Io = new C0466Io(R.id.action_homeFragment_to_settingsFragment);
            AbstractActivityC1957kp m3511B = m3511B();
            C0366Gz c0366Gz2 = null;
            if (m3511B != null) {
                c0366Gz = (C0366Gz) ((NavHostFragment) m3511B.f6062l.getValue()).f9030n0.getValue();
            } else {
                c0366Gz = null;
            }
            if (c0366Gz != null && (m4335Q = c0366Gz.m4335Q()) != null && m4335Q.m2846N(R.id.action_homeFragment_to_settingsFragment) != null) {
                AbstractActivityC1957kp m3511B2 = m3511B();
                if (m3511B2 != null) {
                    c0366Gz2 = (C0366Gz) ((NavHostFragment) m3511B2.f6062l.getValue()).f9030n0.getValue();
                }
                c0366Gz2.m4330G(c0466Io);
            }
        } else {
            AbstractActivityC1957kp m3511B3 = m3511B();
            if (m3511B3 != null) {
                PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(m3511B3, 2131951934), m3511B3.findViewById(R.id.action_reboot));
                m3511B3.getMenuInflater().inflate(R.menu.menu_reboot, popupMenu.getMenu());
                if (Build.VERSION.SDK_INT >= 30) {
                    Object obj = AbstractC0865QC.f2950z;
                    PowerManager powerManager = (PowerManager) AbstractC1375Zj.m2770h(m3511B3, PowerManager.class);
                    if (powerManager != null) {
                        isRebootingUserspaceSupported = powerManager.isRebootingUserspaceSupported();
                        if (isRebootingUserspaceSupported) {
                            z = true;
                        }
                    }
                    if (z) {
                        popupMenu.getMenu().findItem(R.id.action_reboot_userspace).setVisible(true);
                    }
                }
                popupMenu.setOnMenuItemClickListener(new C1505cN());
                popupMenu.show();
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: P */
    public final /* synthetic */ void mo2520P(Menu menu) {
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: Q */
    public final /* synthetic */ void mo2521Q(Menu menu) {
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: X */
    public final void mo3514X() {
        super.mo3514X();
        C0471Iu c0471Iu = (C0471Iu) this.f9606U8.getValue();
        if (c0471Iu.f1571r != 0) {
            c0471Iu.f1571r = 0;
            c0471Iu.mo1709Q(37);
        }
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo431Y(layoutInflater, viewGroup, bundle);
        AbstractC1441b1 abstractC1441b1 = ((AbstractC1588du) m3513K()).f4880j;
        TextView textView = abstractC1441b1.f4514L;
        int i = 11;
        textView.post(new RunnableC1547d8(textView, i, abstractC1441b1.f4517j));
        AbstractC2230q2 abstractC2230q2 = ((AbstractC1588du) m3513K()).f4877L;
        TextView textView2 = abstractC2230q2.f6874i;
        textView2.post(new RunnableC1547d8(textView2, i, abstractC2230q2.f6871L));
        return ((AbstractC1588du) m3513K()).f8982k;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(R.string.section_home);
        }
        int i = DownloadService.f9570q;
        C0505JY c0505jy = new C0505JY((C0471Iu) this.f9606U8.getValue());
        C1112Up c1112Up = AbstractServiceC1020T7.f3413w;
        c1112Up.mo2290G(null);
        c1112Up.m4843N(this, new C1104Uh(3, new C2670yQ(3, c0505jy)));
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: v */
    public final void mo2522v(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_home_md2, menu);
        C1910jw c1910jw = C1910jw.f5967z;
        if (!C1910jw.f5958R) {
            menu.removeItem(R.id.action_reboot);
        }
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C0471Iu) this.f9606U8.getValue();
    }
}
