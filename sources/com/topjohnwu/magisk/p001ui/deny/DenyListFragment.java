package com.topjohnwu.magisk.p001ui.deny;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC1431ar;
import p000a.AbstractC1890ja;
import p000a.AbstractC2615xD;
import p000a.C0056B5;
import p000a.C0908R7;
import p000a.C1164Vn;
import p000a.C1182W7;
import p000a.EnumC0511Je;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class DenyListFragment extends AbstractC1890ja<AbstractC1431ar> implements InterfaceC1503cL {

    /* renamed from: BO */
    public SearchView f9597BO;

    /* renamed from: EC */
    public final int f9598EC = R.layout.fragment_deny_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9599U8;

    public DenyListFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9599U8 = AbstractC0438II.m1020Z(new C0908R7(this, 1));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9598EC;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: N */
    public final boolean mo2519N(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        InterfaceC1841if interfaceC1841if = this.f9599U8;
        switch (itemId) {
            case R.id.action_show_OS /* 2131296342 */:
                z = !menuItem.isChecked();
                C1164Vn c1164Vn = (C1164Vn) interfaceC1841if.getValue();
                c1164Vn.f3792y = z;
                c1164Vn.m2381k(c1164Vn.f3791s);
                break;
            case R.id.action_show_system /* 2131296343 */:
                z = !menuItem.isChecked();
                C1164Vn c1164Vn2 = (C1164Vn) interfaceC1841if.getValue();
                c1164Vn2.f3790g = z;
                c1164Vn2.m2381k(c1164Vn2.f3791s);
                break;
            default:
                return false;
        }
        menuItem.setChecked(z);
        return true;
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: P */
    public final void mo2520P(Menu menu) {
        menu.findItem(R.id.action_show_OS).setEnabled(menu.findItem(R.id.action_show_system).isChecked());
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: Q */
    public final /* synthetic */ void mo2521Q(Menu menu) {
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: Yd */
    public final /* bridge */ /* synthetic */ void mo3515Yd(AbstractC2760z abstractC2760z) {
        AbstractC1431ar abstractC1431ar = (AbstractC1431ar) abstractC2760z;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(R.string.denylist);
        }
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: b */
    public final boolean mo3516b() {
        SearchView searchView;
        SearchView searchView2;
        SearchView searchView3 = this.f9597BO;
        if (searchView3 == null) {
            searchView = null;
        } else {
            searchView = searchView3;
        }
        if (searchView.f8803l) {
            if (searchView3 == null) {
                searchView2 = null;
            } else {
                searchView2 = searchView3;
            }
            if (!searchView2.f8798b) {
                if (searchView3 == null) {
                    searchView3 = null;
                }
                searchView3.m4724R();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        super.mo3517j(view, bundle);
        ((AbstractC1431ar) m3513K()).f4488j.m4907G(new C0056B5(1, this));
        RecyclerView recyclerView = ((AbstractC1431ar) m3513K()).f4488j;
        AbstractC0438II.m1007P(recyclerView, R.dimen.l_50, 5);
        AbstractC0438II.m1005N(recyclerView);
        AbstractC0438II.m1045s(recyclerView);
    }

    @Override // p000a.InterfaceC1503cL
    /* renamed from: v */
    public final void mo2522v(Menu menu, MenuInflater menuInflater) {
        SearchView searchView;
        menuInflater.inflate(R.menu.menu_deny_md2, menu);
        SearchView searchView2 = (SearchView) menu.findItem(R.id.action_search).getActionView();
        this.f9597BO = searchView2;
        SearchView searchView3 = null;
        if (searchView2 == null) {
            searchView = null;
        } else {
            searchView = searchView2;
        }
        if (searchView2 == null) {
            searchView2 = null;
        }
        searchView.f8807nP = searchView2.getContext().getString(R.string.hide_filter_hint);
        searchView.m4727k();
        SearchView searchView4 = this.f9597BO;
        if (searchView4 != null) {
            searchView3 = searchView4;
        }
        searchView3.f8804m = new C1182W7(this);
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1164Vn) this.f9599U8.getValue();
    }
}
