package p000a;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.MainActivity;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.pM */
/* loaded from: classes.dex */
public class C2196pM implements InterfaceC2481um, InterfaceC0460Ii, InterfaceC2369sa, InterfaceC0491JG, InterfaceC0148Cs, InterfaceC1811i6 {

    /* renamed from: R */
    public Object f6755R;

    /* renamed from: S */
    public final /* synthetic */ int f6756S;

    public C2196pM(int i) {
        this.f6756S = i;
        if (i == 6) {
            this.f6755R = new ConcurrentHashMap();
        } else if (i != 11) {
            this.f6755R = new ArrayDeque();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            this.f6755R = i2 >= 30 ? new C0896Qt() : i2 >= 29 ? new C1162Vl() : new C2423te();
        }
    }

    /* renamed from: g */
    public static Object m3815g(Object[] objArr, int i, C2252qQ c2252qQ) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int i6 = c2252qQ.f6936S;
            switch (i6) {
                case AbstractC0795Op.f2698E /* 0 */:
                    i3 = ((C0980SO) obj2).f3310v;
                    break;
                default:
                    i3 = ((C2474ub) obj2).f7578h;
                    break;
            }
            int abs = Math.abs(i3 - i2) * 2;
            switch (i6) {
                case AbstractC0795Op.f2698E /* 0 */:
                    z2 = ((C0980SO) obj2).f3308P;
                    break;
                default:
                    z2 = ((C2474ub) obj2).f7579v;
                    break;
            }
            if (z2 == z) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i7 = abs + i4;
            if (obj == null || i5 > i7) {
                obj = obj2;
                i5 = i7;
            }
        }
        return obj;
    }

    /* renamed from: E */
    public final void m3816E(Drawable drawable) {
        if (drawable != null) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
        }
    }

    @Override // p000a.InterfaceC0148Cs
    /* renamed from: G */
    public final C2621xJ mo306G(View view, C2621xJ c2621xJ, C2402tF c2402tF) {
        int i;
        c2402tF.f7335P = c2621xJ.m4517h() + c2402tF.f7335P;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        boolean z = true;
        if (AbstractC0095Bq.m199P(view) != 1) {
            z = false;
        }
        int m4519v = c2621xJ.m4519v();
        int m4516P = c2621xJ.m4516P();
        int i2 = c2402tF.f7338z;
        if (z) {
            i = m4516P;
        } else {
            i = m4519v;
        }
        int i3 = i2 + i;
        c2402tF.f7338z = i3;
        int i4 = c2402tF.f7337v;
        if (!z) {
            m4519v = m4516P;
        }
        int i5 = i4 + m4519v;
        c2402tF.f7337v = i5;
        AbstractC0095Bq.m197M(view, i3, c2402tF.f7336h, i5, c2402tF.f7335P);
        return c2621xJ;
    }

    /* renamed from: I */
    public Typeface mo135I(Context context, C0980SO[] c0980soArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0980soArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo3821y(i, c0980soArr).f3311z);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo3819q = mo3819q(context, inputStream);
            AbstractC2575wW.m4454u(inputStream);
            return mo3819q;
        } catch (IOException unused2) {
            AbstractC2575wW.m4454u(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            AbstractC2575wW.m4454u(inputStream2);
            throw th;
        }
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: M */
    public final void mo2264M(InterfaceC1546d7 interfaceC1546d7) {
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        C0466Io c0466Io;
        if (((AbstractC2029mC) this.f6755R).f6316k != null) {
            int itemId = menuItem.getItemId();
            AbstractC2029mC abstractC2029mC = (AbstractC2029mC) this.f6755R;
            if (itemId == abstractC2029mC.f6314R.f5355g) {
                abstractC2029mC.f6316k.getClass();
                int i = MainActivity.f9592nF;
                return true;
            }
        }
        C0024AR c0024ar = ((AbstractC2029mC) this.f6755R).f6317q;
        if (c0024ar != null) {
            MainActivity mainActivity = (MainActivity) c0024ar.f141R;
            int i2 = MainActivity.f9592nF;
            switch (menuItem.getItemId()) {
                case R.id.homeFragment /* 2131296524 */:
                    c0466Io = new C0466Io(R.id.action_homeFragment);
                    break;
                case R.id.logFragment /* 2131296576 */:
                    c0466Io = new C0466Io(R.id.action_logFragment);
                    break;
                case R.id.modulesFragment /* 2131296638 */:
                    c0466Io = new C0466Io(R.id.action_moduleFragment);
                    break;
                case R.id.superuserFragment /* 2131296824 */:
                    c0466Io = new C0466Io(R.id.action_superuserFragment);
                    break;
                default:
                    c0466Io = null;
                    break;
            }
            if (c0466Io != null) {
                ((C0366Gz) ((NavHostFragment) mainActivity.f6062l.getValue()).f9030n0.getValue()).m4330G(c0466Io);
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: P */
    public final int mo1116P() {
        int flags;
        flags = ((ContentInfo) this.f6755R).getFlags();
        return flags;
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: Q */
    public final ContentInfo mo1117Q() {
        return (ContentInfo) this.f6755R;
    }

    /* renamed from: R */
    public final C2621xJ m3817R() {
        return ((AbstractC1522cj) this.f6755R).mo2378h();
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: S */
    public final void mo2265S(Object obj) {
        AbstractC2441tz.m4202q(obj);
        throw null;
    }

    /* renamed from: U */
    public final void m3818U(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((AbstractC2691yn) this.f6755R).m4598z(0);
    }

    @Override // p000a.InterfaceC2481um
    /* renamed from: V */
    public final void mo1606V(C2189pE c2189pE, MenuItem menuItem) {
        ((ViewOnKeyListenerC0205Dw) this.f6755R).f638g.removeCallbacksAndMessages(c2189pE);
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    public final void mo82W(C2189pE c2189pE) {
    }

    @Override // p000a.InterfaceC0491JG
    /* renamed from: h */
    public final boolean mo155h(View view) {
        boolean z;
        boolean z2 = false;
        if (!((SwipeDismissBehavior) this.f6755R).mo5002g(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m199P(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = ((SwipeDismissBehavior) this.f6755R).f9217N;
        if ((i == 0 && z) || (i == 1 && !z)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        C2196pM c2196pM = ((SwipeDismissBehavior) this.f6755R).f9221h;
        if (c2196pM != null) {
            c2196pM.m3818U(view);
        }
        return true;
    }

    /* renamed from: k */
    public Typeface mo885k(Context context, Resources resources, int i, String str, int i2) {
        File m4434i = AbstractC2575wW.m4434i(context);
        if (m4434i == null) {
            return null;
        }
        try {
            if (AbstractC2575wW.m4415V(m4434i, resources, i)) {
                return Typeface.createFromFile(m4434i.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4434i.delete();
        }
    }

    @Override // p000a.InterfaceC2481um
    /* renamed from: o */
    public final void mo1607o(C2189pE c2189pE, C1117Uu c1117Uu) {
        ((ViewOnKeyListenerC0205Dw) this.f6755R).f638g.removeCallbacksAndMessages(null);
        int size = ((ViewOnKeyListenerC0205Dw) this.f6755R).f645s.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c2189pE == ((C0041Ar) ((ViewOnKeyListenerC0205Dw) this.f6755R).f645s.get(i)).f183h) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        ((ViewOnKeyListenerC0205Dw) this.f6755R).f638g.postAtTime(new RunnableC2317rc(this, i2 < ((ViewOnKeyListenerC0205Dw) this.f6755R).f645s.size() ? (C0041Ar) ((ViewOnKeyListenerC0205Dw) this.f6755R).f645s.get(i2) : null, c1117Uu, c2189pE), c2189pE, SystemClock.uptimeMillis() + 200);
    }

    /* renamed from: q */
    public Typeface mo3819q(Context context, InputStream inputStream) {
        File m4434i = AbstractC2575wW.m4434i(context);
        if (m4434i == null) {
            return null;
        }
        try {
            if (AbstractC2575wW.m4410S(m4434i, inputStream)) {
                return Typeface.createFromFile(m4434i.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4434i.delete();
        }
    }

    /* renamed from: s */
    public final int m3820s() {
        Configuration configuration = ((Context) this.f6755R).getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final String toString() {
        switch (this.f6756S) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f6755R) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: u */
    public final int mo1118u() {
        int source;
        source = ((ContentInfo) this.f6755R).getSource();
        return source;
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: v */
    public final void mo2266v(Object obj) {
        AbstractC2441tz.m4202q(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0058  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface mo136w(android.content.Context r10, p000a.C1084UI r11, android.content.res.Resources r12, int r13) {
        /*
            r9 = this;
            a.qQ r0 = new a.qQ
            r1 = 1
            r0.<init>(r1)
            a.ub[] r2 = r11.f3554z
            java.lang.Object r0 = m3815g(r2, r13, r0)
            a.ub r0 = (p000a.C2474ub) r0
            if (r0 != 0) goto L12
            r10 = 0
            return r10
        L12:
            int r8 = r0.f7577Q
            java.lang.String r0 = r0.f7580z
            a.pM r2 = p000a.AbstractC1731gb.f5459z
            r3 = r10
            r4 = r12
            r5 = r8
            r6 = r0
            r7 = r13
            android.graphics.Typeface r10 = r2.mo885k(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L2d
            r2 = 0
            java.lang.String r12 = p000a.AbstractC1731gb.m3265h(r12, r8, r0, r2, r13)
            a.Jm r13 = p000a.AbstractC1731gb.f5458h
            r13.m1208h(r12, r10)
        L2d:
            java.lang.String r12 = "Could not retrieve font from family."
            java.lang.String r13 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r10 != 0) goto L37
        L35:
            r12 = r2
            goto L54
        L37:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r4 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            long r12 = r0.longValue()     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            goto L54
        L4d:
            r0 = move-exception
            goto L50
        L4f:
            r0 = move-exception
        L50:
            android.util.Log.e(r13, r12, r0)
            goto L35
        L54:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L63
            java.lang.Object r0 = r9.f6755R
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r0.put(r12, r11)
        L63:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2196pM.mo136w(android.content.Context, a.UI, android.content.res.Resources, int):android.graphics.Typeface");
    }

    /* renamed from: y */
    public C0980SO mo3821y(int i, C0980SO[] c0980soArr) {
        return (C0980SO) m3815g(c0980soArr, i, new C2252qQ(0));
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: z */
    public final ClipData mo1119z() {
        ClipData clip;
        clip = ((ContentInfo) this.f6755R).getClip();
        return clip;
    }

    public /* synthetic */ C2196pM(int i, int i2) {
        this.f6756S = i;
    }

    public /* synthetic */ C2196pM(int i, Object obj) {
        this.f6756S = i;
        this.f6755R = obj;
    }

    public C2196pM(AbstractC2703z2 abstractC2703z2) {
        this.f6756S = 5;
        this.f6755R = abstractC2703z2;
    }

    public C2196pM(C2621xJ c2621xJ) {
        this.f6756S = 11;
        int i = Build.VERSION.SDK_INT;
        this.f6755R = i >= 30 ? new C0896Qt(c2621xJ) : i >= 29 ? new C1162Vl(c2621xJ) : new C2423te(c2621xJ);
    }

    public C2196pM(ClipData clipData, int i) {
        this.f6756S = 7;
        this.f6755R = Build.VERSION.SDK_INT >= 31 ? new C2172ow(clipData, i) : new C1596e2(clipData, i);
    }

    public C2196pM(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6756S = 12;
        this.f6755R = Build.VERSION.SDK_INT >= 25 ? new C1979lE(uri, clipDescription, uri2) : new C1174Vy(uri, clipDescription, uri2, 5);
    }

    public C2196pM(ContentInfo contentInfo) {
        this.f6756S = 8;
        contentInfo.getClass();
        this.f6755R = AbstractC0804P.m1905u(contentInfo);
    }

    public C2196pM(View view, int i) {
        this.f6756S = i;
        if (i != 17) {
            this.f6755R = Build.VERSION.SDK_INT >= 30 ? new C2726zT(view) : new C1094UW(view);
        } else {
            this.f6755R = view.getOverlay();
        }
    }

    public C2196pM(ViewGroup viewGroup) {
        this.f6756S = 16;
        this.f6755R = viewGroup.getOverlay();
    }

    public C2196pM(WindowInsetsController windowInsetsController) {
        this.f6756S = 10;
        this.f6755R = new C2726zT(windowInsetsController);
    }

    public C2196pM(TextView textView) {
        this.f6756S = 14;
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f6755R = new C0889Qi(textView);
    }

    public C2196pM(AbstractC2760z abstractC2760z, int i, ReferenceQueue referenceQueue) {
        this.f6756S = 13;
        this.f6755R = new C0376HA(abstractC2760z, i, this, referenceQueue);
    }

    public C2196pM(SwipeDismissBehavior swipeDismissBehavior) {
        this.f6756S = 28;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f9223u = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f9222o = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f9217N = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2196pM(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(20, materialButtonToggleGroup);
        this.f6756S = 20;
    }
}
