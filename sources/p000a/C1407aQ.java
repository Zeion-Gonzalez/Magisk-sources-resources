package p000a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.MainActivity;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: a.aQ */
/* loaded from: classes.dex */
public final class C1407aQ extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: R */
    public final /* synthetic */ int f4420R;

    /* renamed from: w */
    public final /* synthetic */ Object f4421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1407aQ(int i, Object obj) {
        super(0);
        this.f4420R = i;
        this.f4421w = obj;
    }

    /* renamed from: h */
    public final List m2826h() {
        int i = this.f4420R;
        Object obj = this.f4421w;
        switch (i) {
            case 13:
                try {
                    return (List) ((InterfaceC1459bP) obj).mo93z();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1239X8.f4021S;
                }
            default:
                List m3898z = ((C0770OM) obj).f2620N.m3898z();
                ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(m3898z));
                Iterator it = m3898z.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
        }
    }

    /* renamed from: v */
    public final void m2827v() {
        int i = this.f4420R;
        Object obj = this.f4421w;
        switch (i) {
            case 8:
                AbstractC0795Op.m1803BX((RecyclerView) obj);
                return;
            case 9:
            default:
                ((C1885jV) obj).m3506I(2);
                return;
            case 10:
                ((DialogC2727zU) obj).dismiss();
                return;
        }
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        int i;
        C0326GG mo1354C;
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i2 = this.f4420R;
        int i3 = 4;
        int i4 = 3;
        Bundle bundle = null;
        InterfaceC0771ON interfaceC0771ON = null;
        int i5 = 0;
        Object obj = this.f4421w;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                return AbstractC1843ih.m3415L((InterfaceC0670Mg) obj);
            case 1:
                AbstractC2499v4 abstractC2499v4 = (AbstractC2499v4) obj;
                abstractC2499v4.getClass();
                return new C0186Db(abstractC2499v4.f7665z, abstractC2499v4.f7660s);
            case 2:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context m4003M = navHostFragment.m4003M();
                if (m4003M != null) {
                    C0366Gz c0366Gz = new C0366Gz(m4003M);
                    if (!AbstractC1292YB.m2695u(navHostFragment, c0366Gz.f7646R)) {
                        InterfaceC1546d7 interfaceC1546d7 = c0366Gz.f7646R;
                        C1871jG c1871jG = c0366Gz.f7656k;
                        if (interfaceC1546d7 != null && (mo1354C = interfaceC1546d7.mo1354C()) != null) {
                            mo1354C.mo724h(c1871jG);
                        }
                        c0366Gz.f7646R = navHostFragment;
                        navHostFragment.f7200Yd.mo728z(c1871jG);
                    }
                    C2145oS mo1569G = navHostFragment.mo1569G();
                    C0401Hd c0401Hd = c0366Gz.f7663w;
                    C2252qQ c2252qQ = C0401Hd.f1352q;
                    if (!AbstractC1292YB.m2695u(c0401Hd, (C0401Hd) new C1174Vy(mo1569G, c2252qQ, i5).m2397S(C0401Hd.class))) {
                        if (c0366Gz.f7661u.isEmpty()) {
                            c0366Gz.f7663w = (C0401Hd) new C1174Vy(mo1569G, c2252qQ, i5).m2397S(C0401Hd.class);
                        } else {
                            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
                        }
                    }
                    C2345s6 c2345s6 = new C2345s6(navHostFragment.m4004O(), navHostFragment.m4008W());
                    C1931kK c1931kK = c0366Gz.f7660s;
                    c1931kK.m3550z(c2345s6);
                    Context m4004O = navHostFragment.m4004O();
                    C0364Gx m4008W = navHostFragment.m4008W();
                    int i6 = navHostFragment.f7217p;
                    if (i6 == 0 || i6 == -1) {
                        i6 = R.id.nav_host_fragment_container;
                    }
                    c1931kK.m3550z(new C2129oA(m4004O, m4008W, i6));
                    Bundle m3555z = navHostFragment.f7216od.f4218h.m3555z("android-support-nav:fragment:navControllerState");
                    if (m3555z != null) {
                        m3555z.setClassLoader(m4003M.getClassLoader());
                        c0366Gz.f7644P = m3555z.getBundle("android-support-nav:controller:navigatorState");
                        c0366Gz.f7643N = m3555z.getParcelableArray("android-support-nav:controller:backStack");
                        LinkedHashMap linkedHashMap = c0366Gz.f7647S;
                        linkedHashMap.clear();
                        int[] intArray = m3555z.getIntArray("android-support-nav:controller:backStackDestIds");
                        ArrayList<String> stringArrayList = m3555z.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (intArray != null && stringArrayList != null) {
                            int length = intArray.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length) {
                                c0366Gz.f7649V.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i8));
                                i7++;
                                i8++;
                            }
                        }
                        ArrayList<String> stringArrayList2 = m3555z.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            for (String str : stringArrayList2) {
                                Parcelable[] parcelableArray = m3555z.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                                if (parcelableArray != null) {
                                    C1200WR c1200wr = new C1200WR(parcelableArray.length);
                                    C2098nX c2098nX = new C2098nX(parcelableArray);
                                    while (c2098nX.hasNext()) {
                                        c1200wr.m2478N((C0359Gs) ((Parcelable) c2098nX.next()));
                                    }
                                    linkedHashMap.put(str, c1200wr);
                                }
                            }
                        }
                        c0366Gz.f7645Q = m3555z.getBoolean("android-support-nav:controller:deepLinkHandled");
                    }
                    navHostFragment.f7216od.f4218h.m3554v("android-support-nav:fragment:navControllerState", new C1635ek(i4, c0366Gz));
                    Bundle m3555z2 = navHostFragment.f7216od.f4218h.m3555z("android-support-nav:fragment:graphId");
                    if (m3555z2 != null) {
                        navHostFragment.f9029U8 = m3555z2.getInt("android-support-nav:fragment:graphId");
                    }
                    navHostFragment.f7216od.f4218h.m3554v("android-support-nav:fragment:graphId", new C1635ek(i3, navHostFragment));
                    int i9 = navHostFragment.f9029U8;
                    C1146VR c1146vr = c0366Gz.f7652c;
                    if (i9 != 0) {
                        c0366Gz.m4341k(((C0186Db) c1146vr.getValue()).m371h(i9), null);
                    } else {
                        Bundle bundle2 = navHostFragment.f7210k;
                        if (bundle2 != null) {
                            i = bundle2.getInt("android-support-nav:fragment:graphId");
                        } else {
                            i = 0;
                        }
                        if (bundle2 != null) {
                            bundle = bundle2.getBundle("android-support-nav:fragment:startDestinationArgs");
                        }
                        if (i != 0) {
                            c0366Gz.m4341k(((C0186Db) c1146vr.getValue()).m371h(i), bundle);
                        }
                    }
                    return c0366Gz;
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            case 3:
                AbstractC0632Lt abstractC0632Lt = (AbstractC0632Lt) obj;
                String mo606R = abstractC0632Lt.mo606R();
                AbstractC1687fj abstractC1687fj = (AbstractC1687fj) abstractC0632Lt.f2047z;
                abstractC1687fj.m3192z();
                abstractC1687fj.m3188h();
                InterfaceC0771ON interfaceC0771ON2 = abstractC1687fj.f5278P;
                if (interfaceC0771ON2 != null) {
                    interfaceC0771ON = interfaceC0771ON2;
                }
                return interfaceC0771ON.mo1790l().mo1944j(mo606R);
            case 4:
                C2261qZ c2261qZ = (C2261qZ) obj;
                String str2 = c2261qZ.f6956R;
                C1231X0 c1231x0 = new C1231X0(c2261qZ.f6957S, c2261qZ.f6956R, new C2196pM(15, bundle), c2261qZ.f6959w);
                c1231x0.setWriteAheadLoggingEnabled(c2261qZ.f6958q);
                return c1231x0;
            case 5:
                AbstractActivityC1957kp abstractActivityC1957kp = (AbstractActivityC1957kp) obj;
                return (NavHostFragment) ((C0852Pu) abstractActivityC1957kp.f1678X.f6382R).f2883q.m798H(((MainActivity) abstractActivityC1957kp).f9593HL);
            case 6:
                C0234ES c0234es = (C0234ES) obj;
                C0349Gf c0349Gf = new C0349Gf();
                c0349Gf.m760N(null, "https://cloudflare-dns.com/dns-query");
                C2658y7 m762h = c0349Gf.m762h();
                List m2661T = AbstractC1292YB.m2661T(InetAddress.getByName("162.159.36.1"), InetAddress.getByName("162.159.46.1"), InetAddress.getByName("1.1.1.1"), InetAddress.getByName("1.0.0.1"), InetAddress.getByName("2606:4700:4700::1111"), InetAddress.getByName("2606:4700:4700::1001"), InetAddress.getByName("2606:4700:4700::0064"), InetAddress.getByName("2606:4700:4700::6400"));
                if (c0234es != null) {
                    C1161Vk c1161Vk = new C1161Vk(c0234es);
                    C0003A3 c0003a3 = C2259qX.f6948I;
                    C2584wh c2584wh = new C2584wh(m762h.f8279P, m2661T);
                    if (!AbstractC1292YB.m2695u(c2584wh, c1161Vk.f3768V)) {
                        c1161Vk.f3772e = null;
                    }
                    c1161Vk.f3768V = c2584wh;
                    return new C2259qX(new C0234ES(c1161Vk), m762h, true);
                }
                throw new NullPointerException("client not set");
            case 7:
                return AbstractC1843ih.m3405F(((C0012AD) obj).mo38u(), false).mo861z();
            case 8:
                m2827v();
                return c0329gj;
            case 9:
                return new C1337Z3((C2371sc) obj);
            case 10:
                m2827v();
                return c0329gj;
            case 11:
                m2827v();
                return c0329gj;
            case 12:
                return obj;
            default:
                return m2826h();
        }
    }
}
