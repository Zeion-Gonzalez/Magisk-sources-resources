package com.topjohnwu.magisk.core.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import p000a.AbstractC0865QC;
import p000a.AbstractC1375Zj;
import p000a.C0612LW;
import p000a.C0965S6;
import p000a.C1766hB;
import p000a.C1910jw;
import p000a.InterfaceC0630Lr;

/* loaded from: classes.dex */
public final class NetworkObserver implements InterfaceC0630Lr {

    /* renamed from: S */
    public final ConnectivityManager f9591S;

    public NetworkObserver(Context context) {
        Object obj = AbstractC0865QC.f2950z;
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1375Zj.m2770h(context, ConnectivityManager.class);
        this.f9591S = connectivityManager;
        C0965S6 c0965s6 = new C0965S6(this);
        C1766hB c1766hB = new C1766hB(2, this);
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(16).build(), c0965s6);
        IntentFilter intentFilter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 26) {
            applicationContext.registerReceiver(c1766hB, intentFilter, 4);
        } else {
            applicationContext.registerReceiver(c1766hB, intentFilter);
        }
        C0612LW.f1981s.f1986k.mo728z(this);
    }

    /* renamed from: W */
    public static void m5132W(boolean z) {
        C1910jw.f5956P = C1910jw.f5965v;
        C1910jw.f5953I.m2291M(Boolean.valueOf(z));
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: N */
    public final /* synthetic */ void mo1396N() {
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: P */
    public final /* synthetic */ void mo1397P() {
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: h */
    public final /* synthetic */ void mo1398h() {
    }

    /* renamed from: o */
    public final void m5133o() {
        ConnectivityManager connectivityManager = this.f9591S;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        m5132W(networkCapabilities != null ? networkCapabilities.hasCapability(16) : false);
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: u */
    public final /* synthetic */ void mo1399u() {
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: v */
    public final void mo1400v() {
        m5133o();
    }

    @Override // p000a.InterfaceC0630Lr
    /* renamed from: z */
    public final /* synthetic */ void mo1401z() {
    }
}
