package p000a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: a.EF */
/* loaded from: classes.dex */
public final class C0224EF extends AbstractC1305YR {

    /* renamed from: F */
    public boolean f734F;

    /* renamed from: H */
    public AbstractC1500cH f735H;

    /* renamed from: c */
    public C1991lS f737c;

    /* renamed from: e */
    public int f738e = -1;

    /* renamed from: X */
    public int f736X = -1;

    public C0224EF(C1991lS c1991lS, Resources resources) {
        mo434P(new C1991lS(c1991lS, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x00fa, code lost:
    
        if (r5 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00fc, code lost:
    
        r5 = r25.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0101, code lost:
    
        if (r5 != 4) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0105, code lost:
    
        if (r5 != 2) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0111, code lost:
    
        if (r25.getName().equals("vector") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0113, code lost:
    
        r5 = new p000a.C1430aq();
        r5.inflate(r1, r3, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x011c, code lost:
    
        r5 = p000a.AbstractC2160ok.m3774z(r1, r3, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0139, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x013a, code lost:
    
        if (r5 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x013c, code lost:
    
        r10 = r4.f737c;
        r5 = r10.m4238z(r5);
        r10.f7154C[r5] = r7;
        r10.f6169j.m4507u(r5, java.lang.Integer.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x016b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0273, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x027a, code lost:
    
        return r4;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C0224EF m433N(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0224EF.m433N(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):a.EF");
    }

    @Override // p000a.AbstractC0913RC
    /* renamed from: P */
    public final void mo434P(C1991lS c1991lS) {
        this.f3131S = c1991lS;
        int i = this.f3134g;
        if (i >= 0) {
            Drawable m4235P = c1991lS.m4235P(i);
            this.f3138w = m4235P;
            if (m4235P != null) {
                m2066h(m4235P);
            }
        }
        this.f3129I = null;
        if (c1991lS instanceof AbstractC2324rj) {
            this.f4160Y = c1991lS;
        }
        if (c1991lS instanceof C1991lS) {
            this.f737c = c1991lS;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p000a.AbstractC0913RC, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC1500cH abstractC1500cH = this.f735H;
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2155F();
            this.f735H = null;
            m2067v(this.f738e);
            this.f738e = -1;
            this.f736X = -1;
        }
    }

    @Override // p000a.AbstractC1305YR, p000a.AbstractC0913RC, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f734F) {
            super.mutate();
            this.f737c.mo3602N();
            this.f734F = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0125  */
    @Override // p000a.AbstractC1305YR, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0224EF.onStateChange(int[]):boolean");
    }

    @Override // p000a.AbstractC0913RC, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC1500cH abstractC1500cH = this.f735H;
        if (abstractC1500cH != null && (visible || z2)) {
            if (z) {
                abstractC1500cH.mo2156e();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
