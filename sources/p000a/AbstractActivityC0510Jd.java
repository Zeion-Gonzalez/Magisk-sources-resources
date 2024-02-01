package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.topjohnwu.magisk.R;

/* renamed from: a.Jd */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0510Jd extends AbstractActivityC0502JU implements InterfaceC1032TM {

    /* renamed from: L */
    public LayoutInflaterFactory2C1392a6 f1696L;

    public AbstractActivityC0510Jd() {
        AbstractActivityC0402He abstractActivityC0402He = (AbstractActivityC0402He) this;
        this.f8664q.f4218h.m3554v("androidx:appcompat", new C0521Jo(abstractActivityC0402He));
        m4694o(new C2153oc(abstractActivityC0402He));
    }

    /* renamed from: I */
    public final void m1198I() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: N */
    public final void mo1199N() {
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: Q */
    public final void mo1200Q() {
    }

    /* renamed from: R */
    public final AbstractC2173oy m1201R() {
        if (this.f1696L == null) {
            ExecutorC0571Ki executorC0571Ki = AbstractC2173oy.f6660S;
            this.f1696L = new LayoutInflaterFactory2C1392a6(this, null, this, this);
        }
        return this.f1696L;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1198I();
        m1201R().mo2814z(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(final Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        boolean z = true;
        layoutInflaterFactory2C1392a6.f4381qn = true;
        int i9 = layoutInflaterFactory2C1392a6.f4385zx;
        if (i9 == -100) {
            i9 = AbstractC2173oy.f6659R;
        }
        int m2785F = layoutInflaterFactory2C1392a6.m2785F(context, i9);
        if (AbstractC2173oy.m3789Q(context) && AbstractC2173oy.m3789Q(context)) {
            if (AbstractC0066BJ.m132z()) {
                if (!AbstractC2173oy.f6662k) {
                    AbstractC2173oy.f6660S.execute(new Runnable() { // from class: a.VV
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r7 = this;
                                int r0 = android.os.Build.VERSION.SDK_INT
                                r1 = 33
                                r2 = 1
                                if (r0 < r1) goto L80
                                android.content.ComponentName r0 = new android.content.ComponentName
                                android.content.Context r1 = r1
                                java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                                r0.<init>(r1, r3)
                                android.content.pm.PackageManager r3 = r1.getPackageManager()
                                int r3 = r3.getComponentEnabledSetting(r0)
                                if (r3 == r2) goto L80
                                boolean r3 = p000a.AbstractC0066BJ.m132z()
                                java.lang.String r4 = "locale"
                                if (r3 == 0) goto L59
                                a.Qq r3 = p000a.AbstractC2173oy.f6661g
                                java.util.Iterator r3 = r3.iterator()
                            L28:
                                boolean r5 = r3.hasNext()
                                if (r5 == 0) goto L47
                                java.lang.Object r5 = r3.next()
                                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                                java.lang.Object r5 = r5.get()
                                a.oy r5 = (p000a.AbstractC2173oy) r5
                                if (r5 == 0) goto L28
                                a.a6 r5 = (p000a.LayoutInflaterFactory2C1392a6) r5
                                android.content.Context r5 = r5.f4342E
                                if (r5 == 0) goto L28
                                java.lang.Object r3 = r5.getSystemService(r4)
                                goto L48
                            L47:
                                r3 = 0
                            L48:
                                if (r3 == 0) goto L5e
                                android.os.LocaleList r3 = p000a.AbstractC0363Gw.m786z(r3)
                                a.ck r5 = new a.ck
                                a.BV r6 = new a.BV
                                r6.<init>(r3)
                                r5.<init>(r6)
                                goto L60
                            L59:
                                a.ck r5 = p000a.AbstractC2173oy.f6665w
                                if (r5 == 0) goto L5e
                                goto L60
                            L5e:
                                a.ck r5 = p000a.C1523ck.f4702h
                            L60:
                                a.j8 r3 = r5.f4703z
                                boolean r3 = r3.isEmpty()
                                if (r3 == 0) goto L79
                                java.lang.String r3 = p000a.AbstractC2575wW.m4392EC(r1)
                                java.lang.Object r4 = r1.getSystemService(r4)
                                if (r4 == 0) goto L79
                                android.os.LocaleList r3 = p000a.AbstractC1933kM.m3551z(r3)
                                p000a.AbstractC0363Gw.m785h(r4, r3)
                            L79:
                                android.content.pm.PackageManager r1 = r1.getPackageManager()
                                r1.setComponentEnabledSetting(r0, r2, r2)
                            L80:
                                p000a.AbstractC2173oy.f6662k = r2
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p000a.RunnableC1149VV.run():void");
                        }
                    });
                }
            } else {
                synchronized (AbstractC2173oy.f6664s) {
                    C1523ck c1523ck = AbstractC2173oy.f6665w;
                    if (c1523ck == null) {
                        if (AbstractC2173oy.f6658I == null) {
                            AbstractC2173oy.f6658I = C1523ck.m2947h(AbstractC2575wW.m4392EC(context));
                        }
                        if (!AbstractC2173oy.f6658I.f4703z.isEmpty()) {
                            AbstractC2173oy.f6665w = AbstractC2173oy.f6658I;
                        }
                    } else if (!c1523ck.equals(AbstractC2173oy.f6658I)) {
                        C1523ck c1523ck2 = AbstractC2173oy.f6665w;
                        AbstractC2173oy.f6658I = c1523ck2;
                        AbstractC2575wW.m4442nF(context, c1523ck2.f4703z.mo160h());
                    }
                }
            }
        }
        C1523ck m2782k = LayoutInflaterFactory2C1392a6.m2782k(context);
        boolean z2 = false;
        Configuration configuration = null;
        if (LayoutInflaterFactory2C1392a6.f4337dG && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1392a6.m2780U(context, m2785F, m2782k, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1143VN) {
            try {
                ((C1143VN) context).m2342z(LayoutInflaterFactory2C1392a6.m2780U(context, m2785F, m2782k, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C1392a6.f4336d2) {
            int i10 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    if (i10 >= 24) {
                        AbstractC1185WA.m2448z(configuration3, configuration4, configuration);
                    } else if (!AbstractC1451bD.m2871z(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i10 >= 26) {
                        i = configuration3.colorMode;
                        int i35 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i35 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i36 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i36 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration m2780U = LayoutInflaterFactory2C1392a6.m2780U(context, m2785F, m2782k, configuration, true);
            C1143VN c1143vn = new C1143VN(context, 2131952183);
            c1143vn.m2342z(m2780U);
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                AbstractC1843ih.m3469zx(c1143vn.getTheme());
            }
            context = c1143vn;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC1500cH m1203w = m1203w();
        if (getWindow().hasFeature(0)) {
            if (m1203w == null || !m1203w.mo2919u()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p000a.AbstractActivityC1187WD, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1500cH m1203w = m1203w();
        if (keyCode == 82 && m1203w != null && m1203w.mo2912g(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        layoutInflaterFactory2C1392a6.m2808r();
        return layoutInflaterFactory2C1392a6.f4368f.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        if (layoutInflaterFactory2C1392a6.f4364c == null) {
            layoutInflaterFactory2C1392a6.m2795X();
            AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
            if (abstractC1500cH != null) {
                context = abstractC1500cH.mo2905S();
            } else {
                context = layoutInflaterFactory2C1392a6.f4342E;
            }
            layoutInflaterFactory2C1392a6.f4364c = new C0290FV(context);
        }
        return layoutInflaterFactory2C1392a6.f4364c;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC0659MT.f2117z;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m1201R().mo2791P();
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        if (layoutInflaterFactory2C1392a6.f4383t && layoutInflaterFactory2C1392a6.f4370i) {
            layoutInflaterFactory2C1392a6.m2795X();
            AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
            if (abstractC1500cH != null) {
                abstractC1500cH.mo2902I();
            }
        }
        C1982lH m3597z = C1982lH.m3597z();
        Context context = layoutInflaterFactory2C1392a6.f4342E;
        synchronized (m3597z) {
            m3597z.f6151z.m1762M(context);
        }
        layoutInflaterFactory2C1392a6.f4376nF = new Configuration(layoutInflaterFactory2C1392a6.f4342E.getResources().getConfiguration());
        layoutInflaterFactory2C1392a6.m2787I(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p000a.AbstractActivityC0502JU, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m1201R().mo2805o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p000a.AbstractActivityC0502JU, androidx.activity.AbstractActivityC2754z, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent m3400C;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC1500cH m1203w = m1203w();
        if (menuItem.getItemId() == 16908332 && m1203w != null && (m1203w.mo2906V() & 4) != 0 && (m3400C = AbstractC1843ih.m3400C(this)) != null) {
            if (AbstractC0023AQ.m55v(this, m3400C)) {
                C0285FQ c0285fq = new C0285FQ(this);
                Intent m3400C2 = AbstractC1843ih.m3400C(this);
                if (m3400C2 == null) {
                    m3400C2 = AbstractC1843ih.m3400C(this);
                }
                if (m3400C2 != null) {
                    ComponentName component = m3400C2.getComponent();
                    if (component == null) {
                        component = m3400C2.resolveActivity(c0285fq.f989R.getPackageManager());
                    }
                    c0285fq.m582h(component);
                    c0285fq.f990S.add(m3400C2);
                }
                c0285fq.m583v();
                try {
                    Object obj = AbstractC0865QC.f2950z;
                    AbstractC0236EU.m484z(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            AbstractC0023AQ.m54h(this, m3400C);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1392a6) m1201R()).m2808r();
    }

    @Override // p000a.AbstractActivityC0502JU, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        layoutInflaterFactory2C1392a6.m2795X();
        AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2909Y(true);
        }
    }

    @Override // p000a.AbstractActivityC0502JU, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C1392a6) m1201R()).m2787I(true, false);
    }

    @Override // p000a.AbstractActivityC0502JU, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        layoutInflaterFactory2C1392a6.m2795X();
        AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2909Y(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m1201R().mo2812w(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC1500cH m1203w = m1203w();
        if (getWindow().hasFeature(0)) {
            if (m1203w == null || !m1203w.mo2918s()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m1198I();
        m1201R().mo2794V(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1392a6) m1201R()).f4357UZ = i;
    }

    @Override // p000a.InterfaceC1032TM
    /* renamed from: v */
    public final void mo1202v() {
    }

    /* renamed from: w */
    public final AbstractC1500cH m1203w() {
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) m1201R();
        layoutInflaterFactory2C1392a6.m2795X();
        return layoutInflaterFactory2C1392a6.f4348J;
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        m1198I();
        m1201R().mo2793S(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1198I();
        m1201R().mo2792R(view, layoutParams);
    }
}
