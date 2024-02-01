package com.topjohnwu.magisk.p001ui.theme;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import p000a.AbstractActivityC1957kp;
import p000a.AbstractC0438II;
import p000a.AbstractC1081UF;
import p000a.AbstractC1155Vd;
import p000a.AbstractC1292YB;
import p000a.AbstractC1890ja;
import p000a.AbstractC2307rQ;
import p000a.AbstractC2615xD;
import p000a.C0084Bc;
import p000a.C0908R7;
import p000a.C1091UT;
import p000a.C1239X8;
import p000a.C2098nX;
import p000a.EnumC0511Je;
import p000a.EnumC2349sC;
import p000a.InterfaceC1841if;

/* loaded from: classes.dex */
public final class ThemeFragment extends AbstractC1890ja<AbstractC1081UF> {

    /* renamed from: EC */
    public final int f9622EC = R.layout.fragment_theme_md2;

    /* renamed from: U8 */
    public final InterfaceC1841if f9623U8;

    public ThemeFragment() {
        int i = EnumC0511Je.f1697S;
        this.f9623U8 = AbstractC0438II.m1020Z(new C0908R7(this, 10));
    }

    @Override // p000a.AbstractC1890ja
    /* renamed from: D */
    public final int mo3512D() {
        return this.f9622EC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [a.X8] */
    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? arrayList;
        Object obj;
        super.mo431Y(layoutInflater, viewGroup, bundle);
        C2098nX c2098nX = new C2098nX((EnumC2349sC[]) EnumC2349sC.f7238q.clone());
        if (!c2098nX.hasNext()) {
            arrayList = C1239X8.f4021S;
        } else {
            arrayList = new ArrayList();
            while (c2098nX.hasNext()) {
                Object next = c2098nX.next();
                if (c2098nX.hasNext()) {
                    obj = c2098nX.next();
                } else {
                    obj = null;
                }
                arrayList.add(new C0084Bc(next, obj));
            }
        }
        for (C0084Bc c0084Bc : arrayList) {
            EnumC2349sC enumC2349sC = (EnumC2349sC) c0084Bc.f329S;
            EnumC2349sC enumC2349sC2 = (EnumC2349sC) c0084Bc.f328R;
            View inflate = layoutInflater.inflate(R.layout.item_theme_container, (ViewGroup) null, false);
            for (C0084Bc c0084Bc2 : AbstractC1292YB.m2661T(new C0084Bc(enumC2349sC, (FrameLayout) inflate.findViewById(R.id.left)), new C0084Bc(enumC2349sC2, (FrameLayout) inflate.findViewById(R.id.right)))) {
                EnumC2349sC enumC2349sC3 = (EnumC2349sC) c0084Bc2.f329S;
                FrameLayout frameLayout = (FrameLayout) c0084Bc2.f328R;
                if (enumC2349sC3 != null) {
                    LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(m3511B(), enumC2349sC3.f7240R));
                    int i = AbstractC1155Vd.f3748i;
                    AbstractC1155Vd abstractC1155Vd = (AbstractC1155Vd) AbstractC2307rQ.m3967v(from, R.layout.item_theme, frameLayout, true);
                    abstractC1155Vd.mo19k(43, (C1091UT) this.f9623U8.getValue());
                    abstractC1155Vd.mo19k(39, enumC2349sC3);
                    abstractC1155Vd.mo2815q(m4002I());
                }
            }
            ((AbstractC1081UF) m3513K()).f3549L.addView(inflate);
        }
        return ((AbstractC1081UF) m3513K()).f8982k;
    }

    @Override // p000a.AbstractC1890ja, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        super.mo285Z();
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            m3511B.setTitle(m4018w().getString(R.string.section_theme));
        }
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: y */
    public final AbstractC2615xD mo3692y() {
        return (C1091UT) this.f9623U8.getValue();
    }
}
