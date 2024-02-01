package p000a;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: a.a6 */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1392a6 extends AbstractC2173oy implements InterfaceC1811i6, LayoutInflater.Factory2 {

    /* renamed from: B */
    public boolean f4338B;

    /* renamed from: BO */
    public int f4339BO;

    /* renamed from: C */
    public ActionBarContextView f4340C;

    /* renamed from: D */
    public boolean f4341D;

    /* renamed from: E */
    public final Context f4342E;

    /* renamed from: EC */
    public C1716gG f4343EC;

    /* renamed from: F */
    public C0528Jy f4344F;

    /* renamed from: H */
    public CharSequence f4345H;

    /* renamed from: HL */
    public boolean f4346HL;

    /* renamed from: Ha */
    public C2484up f4347Ha;

    /* renamed from: J */
    public AbstractC1500cH f4348J;

    /* renamed from: K */
    public boolean f4349K;

    /* renamed from: Lq */
    public Rect f4351Lq;

    /* renamed from: O */
    public TextView f4352O;

    /* renamed from: Pm */
    public OnBackInvokedDispatcher f4353Pm;

    /* renamed from: T */
    public boolean f4354T;

    /* renamed from: U */
    public final Object f4355U;

    /* renamed from: U8 */
    public boolean f4356U8;

    /* renamed from: UZ */
    public int f4357UZ;

    /* renamed from: X */
    public C0528Jy f4358X;

    /* renamed from: Y */
    public final InterfaceC1032TM f4359Y;

    /* renamed from: Yd */
    public boolean f4360Yd;

    /* renamed from: Z */
    public AbstractC0336GR f4361Z;

    /* renamed from: ZH */
    public Rect f4362ZH;

    /* renamed from: b */
    public C1678fX[] f4363b;

    /* renamed from: c */
    public C0290FV f4364c;

    /* renamed from: d */
    public ViewGroup f4365d;

    /* renamed from: dx */
    public boolean f4366dx;

    /* renamed from: e */
    public InterfaceC0848Pq f4367e;

    /* renamed from: f */
    public Window f4368f;

    /* renamed from: i */
    public boolean f4370i;

    /* renamed from: j */
    public RunnableC0874QP f4371j;

    /* renamed from: l */
    public boolean f4372l;

    /* renamed from: m */
    public boolean f4373m;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;

    /* renamed from: n */
    public View f4374n;

    /* renamed from: n0 */
    public C1716gG f4375n0;

    /* renamed from: nF */
    public Configuration f4376nF;

    /* renamed from: nP */
    public C1678fX f4377nP;

    /* renamed from: oI */
    public OnBackInvokedCallback f4378oI;

    /* renamed from: od */
    public boolean f4379od;

    /* renamed from: p */
    public PopupWindow f4380p;

    /* renamed from: qn */
    public boolean f4381qn;

    /* renamed from: r */
    public WindowCallbackC0319G6 f4382r;

    /* renamed from: t */
    public boolean f4383t;

    /* renamed from: x */
    public boolean f4384x;

    /* renamed from: zx */
    public int f4385zx;

    /* renamed from: G5 */
    public static final C2698yx f4335G5 = new C2698yx();

    /* renamed from: BX */
    public static final int[] f4334BX = {16842836};

    /* renamed from: d2 */
    public static final boolean f4336d2 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: dG */
    public static final boolean f4337dG = true;

    /* renamed from: L */
    public C0831PV f4350L = null;

    /* renamed from: he */
    public final RunnableC0874QP f4369he = new RunnableC0874QP(this, 0);

    public LayoutInflaterFactory2C1392a6(Context context, Window window, InterfaceC1032TM interfaceC1032TM, Object obj) {
        AbstractActivityC0510Jd abstractActivityC0510Jd;
        this.f4385zx = -100;
        this.f4342E = context;
        this.f4359Y = interfaceC1032TM;
        this.f4355U = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof AbstractActivityC0510Jd) {
                    abstractActivityC0510Jd = (AbstractActivityC0510Jd) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            abstractActivityC0510Jd = null;
            if (abstractActivityC0510Jd != null) {
                this.f4385zx = ((LayoutInflaterFactory2C1392a6) abstractActivityC0510Jd.m1201R()).f4385zx;
            }
        }
        if (this.f4385zx == -100) {
            C2698yx c2698yx = f4335G5;
            Integer num = (Integer) c2698yx.getOrDefault(this.f4355U.getClass().getName(), null);
            if (num != null) {
                this.f4385zx = num.intValue();
                c2698yx.remove(this.f4355U.getClass().getName());
            }
        }
        if (window != null) {
            m2807q(window);
        }
        C1982lH.m3595P();
    }

    /* renamed from: U */
    public static Configuration m2780U(Context context, int i, C1523ck c1523ck, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c1523ck != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC1185WA.m2445P(configuration2, c1523ck);
            } else {
                AbstractC2430tn.m4179h(configuration2, c1523ck.m2949v(0));
                AbstractC2430tn.m4180z(configuration2, c1523ck.m2949v(0));
            }
        }
        return configuration2;
    }

    /* renamed from: c */
    public static C1523ck m2781c(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC1185WA.m2446h(configuration) : C1523ck.m2947h(AbstractC1425al.m2855z(configuration.locale));
    }

    /* renamed from: k */
    public static C1523ck m2782k(Context context) {
        C1523ck c1523ck;
        C1523ck m2947h;
        Locale m2949v;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c1523ck = AbstractC2173oy.f6665w) == null) {
            return null;
        }
        C1523ck m2781c = m2781c(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC1865j8 interfaceC1865j8 = c1523ck.f4703z;
        if (i >= 24) {
            if (interfaceC1865j8.isEmpty()) {
                m2947h = C1523ck.f4702h;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < m2781c.f4703z.size() + interfaceC1865j8.size(); i2++) {
                    if (i2 < interfaceC1865j8.size()) {
                        m2949v = c1523ck.m2949v(i2);
                    } else {
                        m2949v = m2781c.m2949v(i2 - interfaceC1865j8.size());
                    }
                    if (m2949v != null) {
                        linkedHashSet.add(m2949v);
                    }
                }
                m2947h = C1523ck.m2948z((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (interfaceC1865j8.isEmpty()) {
            m2947h = C1523ck.f4702h;
        } else {
            m2947h = C1523ck.m2947h(c1523ck.m2949v(0).toString());
        }
        if (!m2947h.f4703z.isEmpty()) {
            return m2947h;
        }
        return m2781c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0152, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0176, code lost:
    
        if (r2.f392k.getCount() > 0) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2783C(p000a.C1678fX r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.m2783C(a.fX, android.view.KeyEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f9, code lost:
    
        if (r7 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0118, code lost:
    
        if (r7 != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2784E(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.m2784E(android.view.KeyEvent):boolean");
    }

    /* renamed from: F */
    public final int m2785F(Context context, int i) {
        AbstractC0227EK m2788J;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.f4343EC == null) {
                            this.f4343EC = new C1716gG(this, context);
                        }
                        m2788J = this.f4343EC;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                m2788J = m2788J(context);
            }
            return m2788J.mo444o();
        }
        return i;
    }

    /* renamed from: H */
    public final C1678fX m2786H(int i) {
        C1678fX[] c1678fXArr = this.f4363b;
        if (c1678fXArr == null || c1678fXArr.length <= i) {
            C1678fX[] c1678fXArr2 = new C1678fX[i + 1];
            if (c1678fXArr != null) {
                System.arraycopy(c1678fXArr, 0, c1678fXArr2, 0, c1678fXArr.length);
            }
            this.f4363b = c1678fXArr2;
            c1678fXArr = c1678fXArr2;
        }
        C1678fX c1678fX = c1678fXArr[i];
        if (c1678fX != null) {
            return c1678fX;
        }
        C1678fX c1678fX2 = new C1678fX(i);
        c1678fXArr[i] = c1678fX2;
        return c1678fX2;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[ADDED_TO_REGION] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2787I(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.m2787I(boolean, boolean):boolean");
    }

    /* renamed from: J */
    public final AbstractC0227EK m2788J(Context context) {
        if (this.f4375n0 == null) {
            if (C1174Vy.f3826q == null) {
                Context applicationContext = context.getApplicationContext();
                C1174Vy.f3826q = new C1174Vy(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4375n0 = new C1716gG(this, C1174Vy.f3826q);
        }
        return this.f4375n0;
    }

    /* renamed from: L */
    public final void m2789L() {
        if (this.f4370i) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: M */
    public final boolean mo2790M(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4373m && i == 108) {
            return false;
        }
        if (this.f4383t && i == 1) {
            this.f4383t = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.f4368f.requestFeature(i);
                            }
                            m2789L();
                            this.f4338B = true;
                            return true;
                        }
                        m2789L();
                        this.f4383t = true;
                        return true;
                    }
                    m2789L();
                    this.f4349K = true;
                    return true;
                }
                m2789L();
                this.f4354T = true;
                return true;
            }
            m2789L();
            this.f4384x = true;
            return true;
        }
        m2789L();
        this.f4373m = true;
        return true;
    }

    @Override // p000a.InterfaceC1811i6
    /* renamed from: N */
    public final boolean mo81N(C2189pE c2189pE, MenuItem menuItem) {
        int i;
        int i2;
        C1678fX c1678fX;
        Window.Callback m2799e = m2799e();
        if (m2799e != null && !this.f4379od) {
            C2189pE mo2451M = c2189pE.mo2451M();
            C1678fX[] c1678fXArr = this.f4363b;
            if (c1678fXArr != null) {
                i = c1678fXArr.length;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            while (true) {
                if (i2 < i) {
                    c1678fX = c1678fXArr[i2];
                    if (c1678fX != null && c1678fX.f5261o == mo2451M) {
                        break;
                    }
                    i2++;
                } else {
                    c1678fX = null;
                    break;
                }
            }
            if (c1678fX != null) {
                return m2799e.onMenuItemSelected(c1678fX.f5265z, menuItem);
            }
        }
        return false;
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: P */
    public final void mo2791P() {
        if (this.f4348J != null) {
            m2795X();
            if (!this.f4348J.mo2921w()) {
                this.f4339BO |= 1;
                if (!this.f4356U8) {
                    View decorView = this.f4368f.getDecorView();
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC2397t8.m4120S(decorView, this.f4369he);
                    this.f4356U8 = true;
                }
            }
        }
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: R */
    public final void mo2792R(View view, ViewGroup.LayoutParams layoutParams) {
        m2808r();
        ViewGroup viewGroup = (ViewGroup) this.f4365d.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4382r.m717z(this.f4368f.getCallback());
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: S */
    public final void mo2793S(View view) {
        m2808r();
        ViewGroup viewGroup = (ViewGroup) this.f4365d.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4382r.m717z(this.f4368f.getCallback());
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: V */
    public final void mo2794V(int i) {
        m2808r();
        ViewGroup viewGroup = (ViewGroup) this.f4365d.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4342E).inflate(i, viewGroup);
        this.f4382r.m717z(this.f4368f.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r6 == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    @Override // p000a.InterfaceC1811i6
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo82W(p000a.C2189pE r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.mo82W(a.pE):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2795X() {
        /*
            r3 = this;
            r3.m2808r()
            boolean r0 = r3.f4383t
            if (r0 == 0) goto L33
            a.cH r0 = r3.f4348J
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.f4355U
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            a.r2 r1 = new a.r2
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f4338B
            r1.<init>(r0, r2)
        L1b:
            r3.f4348J = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            a.r2 r1 = new a.r2
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            a.cH r0 = r3.f4348J
            if (r0 == 0) goto L33
            boolean r1 = r3.f4366dx
            r0.mo2917r(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.m2795X():void");
    }

    /* renamed from: Y */
    public final void m2796Y() {
        if (this.f4368f == null) {
            Object obj = this.f4355U;
            if (obj instanceof Activity) {
                m2807q(((Activity) obj).getWindow());
            }
        }
        if (this.f4368f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    public final boolean m2797Z() {
        boolean z = this.f4360Yd;
        this.f4360Yd = false;
        C1678fX m2786H = m2786H(0);
        if (m2786H.f5257S) {
            if (!z) {
                m2809s(m2786H, true);
            }
            return true;
        }
        AbstractC0336GR abstractC0336GR = this.f4361Z;
        if (abstractC0336GR != null) {
            abstractC0336GR.mo745z();
            return true;
        }
        m2795X();
        AbstractC1500cH abstractC1500cH = this.f4348J;
        if (abstractC1500cH == null || !abstractC1500cH.mo2915o()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int m2798d(C2621xJ c2621xJ, Rect rect) {
        int i;
        boolean z;
        int m4519v;
        int m4516P;
        boolean z2;
        int i2;
        int i3 = 0;
        if (c2621xJ != null) {
            i = c2621xJ.m4515N();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f4340C;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4340C.getLayoutParams();
            boolean z3 = true;
            if (this.f4340C.isShown()) {
                if (this.f4362ZH == null) {
                    this.f4362ZH = new Rect();
                    this.f4351Lq = new Rect();
                }
                Rect rect2 = this.f4362ZH;
                Rect rect3 = this.f4351Lq;
                if (c2621xJ == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c2621xJ.m4519v(), c2621xJ.m4515N(), c2621xJ.m4516P(), c2621xJ.m4517h());
                }
                ViewGroup viewGroup = this.f4365d;
                Method method = AbstractC1586ds.f4875z;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                ViewGroup viewGroup2 = this.f4365d;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                C2621xJ m4493z = AbstractC2609x6.m4493z(viewGroup2);
                if (m4493z == null) {
                    m4519v = 0;
                } else {
                    m4519v = m4493z.m4519v();
                }
                if (m4493z == null) {
                    m4516P = 0;
                } else {
                    m4516P = m4493z.m4516P();
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                Context context = this.f4342E;
                if (i4 > 0 && this.f4374n == null) {
                    View view = new View(context);
                    this.f4374n = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m4519v;
                    layoutParams.rightMargin = m4516P;
                    this.f4365d.addView(this.f4374n, -1, layoutParams);
                } else {
                    View view2 = this.f4374n;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != m4519v || marginLayoutParams2.rightMargin != m4516P) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = m4519v;
                            marginLayoutParams2.rightMargin = m4516P;
                            this.f4374n.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f4374n;
                if (view3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f4374n;
                    if ((AbstractC2397t8.m4128u(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        Object obj = AbstractC0865QC.f2950z;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = AbstractC0865QC.f2950z;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(AbstractC1375Zj.m2772z(context, i2));
                }
                if (!this.f4349K && z) {
                    i = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                this.f4340C.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view5 = this.f4374n;
        if (view5 != null) {
            if (!z) {
                i3 = 8;
            }
            view5.setVisibility(i3);
        }
        return i;
    }

    /* renamed from: e */
    public final Window.Callback m2799e() {
        return this.f4368f.getCallback();
    }

    /* renamed from: f */
    public final void m2800f(int i) {
        C1678fX m2786H = m2786H(i);
        if (m2786H.f5261o != null) {
            Bundle bundle = new Bundle();
            m2786H.f5261o.m3805y(bundle);
            if (bundle.size() > 0) {
                m2786H.f5251I = bundle;
            }
            m2786H.f5261o.m3792E();
            m2786H.f5261o.clear();
        }
        m2786H.f5264w = true;
        m2786H.f5256R = true;
        if ((i == 108 || i == 0) && this.f4367e != null) {
            C1678fX m2786H2 = m2786H(0);
            m2786H2.f5252M = false;
            m2804j(m2786H2, null);
        }
    }

    /* renamed from: g */
    public final void m2801g(int i, C1678fX c1678fX, C2189pE c2189pE) {
        if (c2189pE == null) {
            if (c1678fX == null && i >= 0) {
                C1678fX[] c1678fXArr = this.f4363b;
                if (i < c1678fXArr.length) {
                    c1678fX = c1678fXArr[i];
                }
            }
            if (c1678fX != null) {
                c2189pE = c1678fX.f5261o;
            }
        }
        if ((c1678fX == null || c1678fX.f5257S) && !this.f4379od) {
            WindowCallbackC0319G6 windowCallbackC0319G6 = this.f4382r;
            Window.Callback callback = this.f4368f.getCallback();
            windowCallbackC0319G6.getClass();
            try {
                windowCallbackC0319G6.f1087q = true;
                callback.onPanelClosed(i, c2189pE);
            } finally {
                windowCallbackC0319G6.f1087q = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        if (r10.equals("ImageButton") == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd A[Catch: all -> 0x0207, Exception -> 0x020d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020d, all -> 0x0207, blocks: (B:108:0x01d6, B:111:0x01e3, B:113:0x01e7, B:118:0x01fd), top: B:151:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    @Override // p000a.AbstractC2173oy
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo2802h(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.mo2802h(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: i */
    public final void m2803i() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f4353Pm != null && (m2786H(0).f5257S || this.f4361Z != null)) {
                z = true;
            }
            if (z && this.f4378oI == null) {
                this.f4378oI = AbstractC2081nC.m3698h(this.f4353Pm, this);
            } else if (!z && (onBackInvokedCallback = this.f4378oI) != null) {
                AbstractC2081nC.m3699v(this.f4353Pm, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: j */
    public final boolean m2804j(C1678fX c1678fX, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0848Pq interfaceC0848Pq;
        InterfaceC0848Pq interfaceC0848Pq2;
        Resources.Theme theme;
        int i;
        boolean z2;
        InterfaceC0848Pq interfaceC0848Pq3;
        InterfaceC0848Pq interfaceC0848Pq4;
        if (this.f4379od) {
            return false;
        }
        if (c1678fX.f5252M) {
            return true;
        }
        C1678fX c1678fX2 = this.f4377nP;
        if (c1678fX2 != null && c1678fX2 != c1678fX) {
            m2809s(c1678fX2, false);
        }
        Window.Callback m2799e = m2799e();
        int i2 = c1678fX.f5265z;
        if (m2799e != null) {
            c1678fX.f5262u = m2799e.onCreatePanelView(i2);
        }
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (interfaceC0848Pq4 = this.f4367e) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0848Pq4;
            actionBarOverlayLayout.m4714M();
            actionBarOverlayLayout.f8751q.f7475V = true;
        }
        if (c1678fX.f5262u == null && (!z || !(this.f4348J instanceof C2003lg))) {
            C2189pE c2189pE = c1678fX.f5261o;
            if (c2189pE == null || c1678fX.f5264w) {
                if (c2189pE == null) {
                    Context context = this.f4342E;
                    if ((i2 == 0 || i2 == 108) && this.f4367e != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1143VN c1143vn = new C1143VN(context, 0);
                            c1143vn.getTheme().setTo(theme);
                            context = c1143vn;
                        }
                    }
                    C2189pE c2189pE2 = new C2189pE(context);
                    c2189pE2.f6705N = this;
                    C2189pE c2189pE3 = c1678fX.f5261o;
                    if (c2189pE2 != c2189pE3) {
                        if (c2189pE3 != null) {
                            c2189pE3.m3799k(c1678fX.f5259W);
                        }
                        c1678fX.f5261o = c2189pE2;
                        C0104C2 c0104c2 = c1678fX.f5259W;
                        if (c0104c2 != null) {
                            c2189pE2.m3798h(c0104c2, c2189pE2.f6724z);
                        }
                    }
                    if (c1678fX.f5261o == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0848Pq2 = this.f4367e) != null) {
                    if (this.f4358X == null) {
                        this.f4358X = new C0528Jy(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0848Pq2).m4715V(c1678fX.f5261o, this.f4358X);
                }
                c1678fX.f5261o.m3792E();
                if (!m2799e.onCreatePanelMenu(i2, c1678fX.f5261o)) {
                    C2189pE c2189pE4 = c1678fX.f5261o;
                    if (c2189pE4 != null) {
                        if (c2189pE4 != null) {
                            c2189pE4.m3799k(c1678fX.f5259W);
                        }
                        c1678fX.f5261o = null;
                    }
                    if (z && (interfaceC0848Pq = this.f4367e) != null) {
                        ((ActionBarOverlayLayout) interfaceC0848Pq).m4715V(null, this.f4358X);
                    }
                    return false;
                }
                c1678fX.f5264w = false;
            }
            c1678fX.f5261o.m3792E();
            Bundle bundle = c1678fX.f5251I;
            if (bundle != null) {
                c1678fX.f5261o.m3797g(bundle);
                c1678fX.f5251I = null;
            }
            if (!m2799e.onPreparePanel(0, c1678fX.f5262u, c1678fX.f5261o)) {
                if (z && (interfaceC0848Pq3 = this.f4367e) != null) {
                    ((ActionBarOverlayLayout) interfaceC0848Pq3).m4715V(null, this.f4358X);
                }
                c1678fX.f5261o.m3794U();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1678fX.f5261o.setQwertyMode(z2);
            c1678fX.f5261o.m3794U();
        }
        c1678fX.f5252M = true;
        c1678fX.f5258V = false;
        this.f4377nP = c1678fX;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC2173oy
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2805o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4355U
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p000a.AbstractC2173oy.f6666y
            monitor-enter(r0)
            p000a.AbstractC2173oy.m3788G(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4356U8
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4368f
            android.view.View r0 = r0.getDecorView()
            a.QP r1 = r3.f4369he
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f4379od = r0
            int r0 = r3.f4385zx
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4355U
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            a.yx r0 = p000a.LayoutInflaterFactory2C1392a6.f4335G5
            java.lang.Object r1 = r3.f4355U
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4385zx
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            a.yx r0 = p000a.LayoutInflaterFactory2C1392a6.f4335G5
            java.lang.Object r1 = r3.f4355U
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            a.cH r0 = r3.f4348J
            if (r0 == 0) goto L63
            r0.mo2916q()
        L63:
            a.gG r0 = r3.f4375n0
            if (r0 == 0) goto L6a
            r0.m443h()
        L6a:
            a.gG r0 = r3.f4343EC
            if (r0 == 0) goto L71
            r0.m443h()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.mo2805o():void");
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo2802h(str, context, attributeSet);
    }

    /* renamed from: p */
    public final boolean m2806p(C1678fX c1678fX, int i, KeyEvent keyEvent) {
        C2189pE c2189pE;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1678fX.f5252M || m2804j(c1678fX, keyEvent)) && (c2189pE = c1678fX.f5261o) != null) {
            return c2189pE.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: q */
    public final void m2807q(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f4368f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof WindowCallbackC0319G6)) {
                WindowCallbackC0319G6 windowCallbackC0319G6 = new WindowCallbackC0319G6(this, callback);
                this.f4382r = windowCallbackC0319G6;
                window.setCallback(windowCallbackC0319G6);
                int[] iArr = f4334BX;
                Context context = this.f4342E;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C1982lH m3597z = C1982lH.m3597z();
                    synchronized (m3597z) {
                        drawable = m3597z.f6151z.m1769u(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f4368f = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f4353Pm) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f4378oI) != null) {
                        AbstractC2081nC.m3699v(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f4378oI = null;
                    }
                    Object obj = this.f4355U;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = AbstractC2081nC.m3700z(activity);
                        }
                    }
                    this.f4353Pm = onBackInvokedDispatcher2;
                    m2803i();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: r */
    public final void m2808r() {
        int i;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f4370i) {
            int[] iArr = AbstractC0483J5.f1600G;
            Context context2 = this.f4342E;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i2 = 0;
                int i3 = 1;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    mo2790M(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo2790M(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    mo2790M(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    mo2790M(10);
                }
                this.f4341D = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m2796Y();
                this.f4368f.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f4373m) {
                    if (this.f4341D) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f4338B = false;
                        this.f4383t = false;
                    } else if (this.f4383t) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new C1143VN(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC0848Pq interfaceC0848Pq = (InterfaceC0848Pq) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f4367e = interfaceC0848Pq;
                        Window.Callback m2799e = m2799e();
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0848Pq;
                        actionBarOverlayLayout.m4714M();
                        actionBarOverlayLayout.f8751q.f7469M = m2799e;
                        if (this.f4338B) {
                            ((ActionBarOverlayLayout) this.f4367e).m4713G(109);
                        }
                        if (this.f4384x) {
                            ((ActionBarOverlayLayout) this.f4367e).m4713G(2);
                        }
                        if (this.f4354T) {
                            ((ActionBarOverlayLayout) this.f4367e).m4713G(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.f4349K) {
                        i = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    C2052mg c2052mg = new C2052mg(i2, this);
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1548d9.m3014s(viewGroup, c2052mg);
                    if (this.f4367e == null) {
                        this.f4352O = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = AbstractC1586ds.f4875z;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f4368f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f4368f.setContentView(viewGroup);
                    contentFrameLayout.f8780y = new C0528Jy(this, i3);
                    this.f4365d = viewGroup;
                    Object obj = this.f4355U;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f4345H;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC0848Pq interfaceC0848Pq2 = this.f4367e;
                        if (interfaceC0848Pq2 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) interfaceC0848Pq2;
                            actionBarOverlayLayout2.m4714M();
                            C2444u1 c2444u1 = actionBarOverlayLayout2.f8751q;
                            if (!c2444u1.f7479u) {
                                c2444u1.f7478o = charSequence;
                                if ((c2444u1.f7477h & 8) != 0) {
                                    Toolbar toolbar = c2444u1.f7482z;
                                    toolbar.m4744Y(charSequence);
                                    if (c2444u1.f7479u) {
                                        AbstractC2446u3.m4220S(toolbar.getRootView(), charSequence);
                                    }
                                }
                            }
                        } else {
                            AbstractC1500cH abstractC1500cH = this.f4348J;
                            if (abstractC1500cH != null) {
                                abstractC1500cH.mo2901H(charSequence);
                            } else {
                                TextView textView = this.f4352O;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4365d.findViewById(16908290);
                    View decorView = this.f4368f.getDecorView();
                    contentFrameLayout2.f8776g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                    if (AbstractC1285Y3.m2635v(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    if (contentFrameLayout2.f8775S == null) {
                        contentFrameLayout2.f8775S = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.f8775S);
                    if (contentFrameLayout2.f8774R == null) {
                        contentFrameLayout2.f8774R = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.f8774R);
                    if (obtainStyledAttributes2.hasValue(122)) {
                        if (contentFrameLayout2.f8779w == null) {
                            contentFrameLayout2.f8779w = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.f8779w);
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        if (contentFrameLayout2.f8773I == null) {
                            contentFrameLayout2.f8773I = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.f8773I);
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.f8778q == null) {
                            contentFrameLayout2.f8778q = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.f8778q);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.f8777k == null) {
                            contentFrameLayout2.f8777k = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.f8777k);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f4370i = true;
                    C1678fX m2786H = m2786H(0);
                    if (!this.f4379od && m2786H.f5261o == null) {
                        this.f4339BO |= 4096;
                        if (!this.f4356U8) {
                            AbstractC2397t8.m4120S(this.f4368f.getDecorView(), this.f4369he);
                            this.f4356U8 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4383t + ", windowActionBarOverlay: " + this.f4338B + ", android:windowIsFloating: " + this.f4341D + ", windowActionModeOverlay: " + this.f4349K + ", windowNoTitle: " + this.f4373m + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2809s(p000a.C1678fX r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L33
            int r2 = r6.f5265z
            if (r2 != 0) goto L33
            a.Pq r2 = r5.f4367e
            if (r2 == 0) goto L33
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.m4714M()
            a.u1 r2 = r2.f8751q
            androidx.appcompat.widget.Toolbar r2 = r2.f7482z
            androidx.appcompat.widget.ActionMenuView r2 = r2.f8832S
            if (r2 == 0) goto L2a
            a.pI r2 = r2.f8767p
            if (r2 == 0) goto L25
            boolean r2 = r2.m3806M()
            if (r2 == 0) goto L25
            r2 = r0
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2a
            r2 = r0
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L33
            a.pE r6 = r6.f5261o
            r5.m2813y(r6)
            return
        L33:
            android.content.Context r2 = r5.f4342E
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L52
            boolean r4 = r6.f5257S
            if (r4 == 0) goto L52
            a.dh r4 = r6.f5253N
            if (r4 == 0) goto L52
            r2.removeView(r4)
            if (r7 == 0) goto L52
            int r7 = r6.f5265z
            r5.m2801g(r7, r6, r3)
        L52:
            r6.f5252M = r1
            r6.f5258V = r1
            r6.f5257S = r1
            r6.f5255Q = r3
            r6.f5256R = r0
            a.fX r7 = r5.f4377nP
            if (r7 != r6) goto L62
            r5.f4377nP = r3
        L62:
            int r6 = r6.f5265z
            if (r6 != 0) goto L69
            r5.m2803i()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.LayoutInflaterFactory2C1392a6.m2809s(a.fX, boolean):void");
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: u */
    public final void mo2810u() {
        String str;
        this.f4381qn = true;
        m2787I(false, true);
        m2796Y();
        Object obj = this.f4355U;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC1843ih.m3447j(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC1500cH abstractC1500cH = this.f4348J;
                if (abstractC1500cH == null) {
                    this.f4366dx = true;
                } else {
                    abstractC1500cH.mo2917r(true);
                }
            }
            synchronized (AbstractC2173oy.f6666y) {
                AbstractC2173oy.m3788G(this);
                AbstractC2173oy.f6661g.add(new WeakReference(this));
            }
        }
        this.f4376nF = new Configuration(this.f4342E.getResources().getConfiguration());
        this.f4346HL = true;
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: v */
    public final void mo2811v() {
        LayoutInflater from = LayoutInflater.from(this.f4342E);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof LayoutInflaterFactory2C1392a6)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: w */
    public final void mo2812w(CharSequence charSequence) {
        this.f4345H = charSequence;
        InterfaceC0848Pq interfaceC0848Pq = this.f4367e;
        if (interfaceC0848Pq != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0848Pq;
            actionBarOverlayLayout.m4714M();
            C2444u1 c2444u1 = actionBarOverlayLayout.f8751q;
            if (!c2444u1.f7479u) {
                c2444u1.f7478o = charSequence;
                if ((c2444u1.f7477h & 8) != 0) {
                    Toolbar toolbar = c2444u1.f7482z;
                    toolbar.m4744Y(charSequence);
                    if (c2444u1.f7479u) {
                        AbstractC2446u3.m4220S(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AbstractC1500cH abstractC1500cH = this.f4348J;
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2901H(charSequence);
            return;
        }
        TextView textView = this.f4352O;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: y */
    public final void m2813y(C2189pE c2189pE) {
        C2192pI c2192pI;
        if (this.f4372l) {
            return;
        }
        this.f4372l = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4367e;
        actionBarOverlayLayout.m4714M();
        ActionMenuView actionMenuView = actionBarOverlayLayout.f8751q.f7482z.f8832S;
        if (actionMenuView != null && (c2192pI = actionMenuView.f8767p) != null) {
            c2192pI.m3807Q();
            C0278FI c0278fi = c2192pI.f6736X;
            if (c0278fi != null && c0278fi.m1773h()) {
                c0278fi.f2605G.dismiss();
            }
        }
        Window.Callback m2799e = m2799e();
        if (m2799e != null && !this.f4379od) {
            m2799e.onPanelClosed(108, c2189pE);
        }
        this.f4372l = false;
    }

    @Override // p000a.AbstractC2173oy
    /* renamed from: z */
    public final void mo2814z(View view, ViewGroup.LayoutParams layoutParams) {
        m2808r();
        ((ViewGroup) this.f4365d.findViewById(16908290)).addView(view, layoutParams);
        this.f4382r.m717z(this.f4368f.getCallback());
    }
}
