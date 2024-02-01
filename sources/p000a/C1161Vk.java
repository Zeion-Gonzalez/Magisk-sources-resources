package p000a;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.Vk */
/* loaded from: classes.dex */
public final class C1161Vk {

    /* renamed from: E */
    public final AbstractC0438II f3756E;

    /* renamed from: G */
    public final InterfaceC2155oe f3757G;

    /* renamed from: H */
    public final long f3758H;

    /* renamed from: I */
    public final SocketFactory f3759I;

    /* renamed from: J */
    public final int f3760J;

    /* renamed from: M */
    public C1284Y2 f3761M;

    /* renamed from: N */
    public final C0024AR f3762N;

    /* renamed from: P */
    public final ArrayList f3763P;

    /* renamed from: Q */
    public final boolean f3764Q;

    /* renamed from: R */
    public final ProxySelector f3765R;

    /* renamed from: S */
    public final Proxy f3766S;

    /* renamed from: U */
    public final C2216pl f3767U;

    /* renamed from: V */
    public InterfaceC0733Nm f3768V;

    /* renamed from: W */
    public final boolean f3769W;

    /* renamed from: Y */
    public final int f3770Y;

    /* renamed from: c */
    public final int f3771c;

    /* renamed from: e */
    public C0175DP f3772e;

    /* renamed from: f */
    public final int f3773f;

    /* renamed from: g */
    public List f3774g;

    /* renamed from: h */
    public final C0175DP f3775h;

    /* renamed from: k */
    public final X509TrustManager f3776k;

    /* renamed from: o */
    public final boolean f3777o;

    /* renamed from: q */
    public final SSLSocketFactory f3778q;

    /* renamed from: r */
    public final int f3779r;

    /* renamed from: s */
    public final HostnameVerifier f3780s;

    /* renamed from: u */
    public final InterfaceC1990lR f3781u;

    /* renamed from: v */
    public final ArrayList f3782v;

    /* renamed from: w */
    public final InterfaceC1990lR f3783w;

    /* renamed from: y */
    public final List f3784y;

    /* renamed from: z */
    public final C0185Da f3785z;

    public C1161Vk() {
        this.f3785z = new C0185Da();
        this.f3775h = new C0175DP(3);
        this.f3782v = new ArrayList();
        this.f3763P = new ArrayList();
        C1710g8 c1710g8 = C1710g8.f5376I;
        byte[] bArr = AbstractC1181W6.f3860z;
        this.f3762N = new C0024AR(8, c1710g8);
        this.f3764Q = true;
        C1710g8 c1710g82 = InterfaceC1990lR.f6167z;
        this.f3781u = c1710g82;
        this.f3777o = true;
        this.f3769W = true;
        this.f3757G = InterfaceC2155oe.f6618G;
        this.f3768V = InterfaceC0733Nm.f2479M;
        this.f3783w = c1710g82;
        this.f3759I = SocketFactory.getDefault();
        this.f3774g = C0234ES.f759t;
        this.f3784y = C0234ES.f758T;
        this.f3780s = C1113Uq.f3616z;
        this.f3767U = C2216pl.f6824v;
        this.f3779r = 10000;
        this.f3770Y = 10000;
        this.f3760J = 10000;
        this.f3758H = 1024L;
    }

    public C1161Vk(C0234ES c0234es) {
        this();
        this.f3785z = c0234es.f769S;
        this.f3775h = c0234es.f768R;
        AbstractC2708z8.m4637oI(c0234es.f787w, this.f3782v);
        AbstractC2708z8.m4637oI(c0234es.f764I, this.f3763P);
        this.f3762N = c0234es.f784q;
        this.f3764Q = c0234es.f781k;
        this.f3781u = c0234es.f778g;
        this.f3777o = c0234es.f789y;
        this.f3769W = c0234es.f786s;
        this.f3757G = c0234es.f770U;
        this.f3761M = c0234es.f761E;
        this.f3768V = c0234es.f777f;
        this.f3766S = c0234es.f785r;
        this.f3765R = c0234es.f772Y;
        this.f3783w = c0234es.f765J;
        this.f3759I = c0234es.f774c;
        this.f3778q = c0234es.f763H;
        this.f3776k = c0234es.f776e;
        this.f3774g = c0234es.f771X;
        this.f3784y = c0234es.f762F;
        this.f3780s = c0234es.f773Z;
        this.f3767U = c0234es.f760C;
        this.f3756E = c0234es.f783p;
        this.f3773f = c0234es.f780j;
        this.f3779r = c0234es.f766L;
        this.f3770Y = c0234es.f779i;
        this.f3760J = c0234es.f775d;
        this.f3771c = c0234es.f767O;
        this.f3758H = c0234es.f782n;
        this.f3772e = c0234es.f788x;
    }
}
