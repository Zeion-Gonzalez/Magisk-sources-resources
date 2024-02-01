package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: a.VN */
/* loaded from: classes.dex */
public final class C1143VN extends ContextWrapper {

    /* renamed from: Q */
    public static Configuration f3721Q;

    /* renamed from: N */
    public Resources f3722N;

    /* renamed from: P */
    public Configuration f3723P;

    /* renamed from: h */
    public Resources.Theme f3724h;

    /* renamed from: v */
    public LayoutInflater f3725v;

    /* renamed from: z */
    public int f3726z;

    public C1143VN(Context context, int i) {
        super(context);
        this.f3726z = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0022, code lost:
    
        if (r0.equals(p000a.C1143VN.f3721Q) != false) goto L53;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f3722N
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f3723P
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p000a.C1143VN.f3721Q
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p000a.C1143VN.f3721Q = r1
        L1c:
            android.content.res.Configuration r1 = p000a.C1143VN.f3721Q
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f3723P
            android.content.Context r0 = p000a.AbstractC1229Wz.m2525z(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f3722N = r0
        L36:
            android.content.res.Resources r0 = r3.f3722N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1143VN.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3725v == null) {
            this.f3725v = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3725v;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3724h;
        if (theme != null) {
            return theme;
        }
        if (this.f3726z == 0) {
            this.f3726z = 2131952184;
        }
        m2341h();
        return this.f3724h;
    }

    /* renamed from: h */
    public final void m2341h() {
        boolean z;
        if (this.f3724h == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3724h = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3724h.setTo(theme);
            }
        }
        this.f3724h.applyStyle(this.f3726z, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3726z != i) {
            this.f3726z = i;
            m2341h();
        }
    }

    /* renamed from: z */
    public final void m2342z(Configuration configuration) {
        if (this.f3722N != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3723P != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3723P = new Configuration(configuration);
    }
}
