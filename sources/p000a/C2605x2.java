package p000a;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: a.x2 */
/* loaded from: classes.dex */
public final class C2605x2 {

    /* renamed from: G */
    public final boolean f8027G;

    /* renamed from: M */
    public final Set f8028M;

    /* renamed from: N */
    public final List f8029N;

    /* renamed from: P */
    public final C2528vZ f8030P;

    /* renamed from: Q */
    public final int f8031Q;

    /* renamed from: S */
    public final List f8032S;

    /* renamed from: V */
    public final List f8033V;

    /* renamed from: W */
    public final boolean f8034W;

    /* renamed from: h */
    public final String f8035h;

    /* renamed from: o */
    public final Executor f8036o;

    /* renamed from: u */
    public final Executor f8037u;

    /* renamed from: v */
    public final InterfaceC0213E3 f8038v;

    /* renamed from: z */
    public final Context f8039z;

    public C2605x2(Context context, String str, C1710g8 c1710g8, C2528vZ c2528vZ, ArrayList arrayList, int i, Executor executor, Executor executor2, boolean z, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8039z = context;
        this.f8035h = str;
        this.f8038v = c1710g8;
        this.f8030P = c2528vZ;
        this.f8029N = arrayList;
        this.f8031Q = i;
        this.f8037u = executor;
        this.f8036o = executor2;
        this.f8034W = z;
        this.f8027G = z2;
        this.f8028M = linkedHashSet;
        this.f8033V = arrayList2;
        this.f8032S = arrayList3;
    }

    /* renamed from: z */
    public final boolean m4484z(int i, int i2) {
        Set set;
        if ((i > i2) && this.f8027G) {
            return false;
        }
        return this.f8034W && ((set = this.f8028M) == null || !set.contains(Integer.valueOf(i)));
    }
}
