package p000a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a.tT */
/* loaded from: classes.dex */
public final class C2414tT extends C1555dG {

    /* renamed from: N */
    public final Object f7393N;

    /* renamed from: P */
    public final /* synthetic */ int f7394P;

    public /* synthetic */ C2414tT(int i, Object obj) {
        this.f7394P = i;
        this.f7393N = obj;
    }

    @Override // p000a.C1555dG
    /* renamed from: N */
    public final void mo3024N(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f7394P) {
            case 4:
                super.mo3024N(view, accessibilityEvent);
                ((TextInputLayout) this.f7393N).f9507w.m3618h().mo1479w(accessibilityEvent);
                return;
            default:
                super.mo3024N(view, accessibilityEvent);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        if (r12 != null) goto L74;
     */
    @Override // p000a.C1555dG
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo373P(android.view.View r20, p000a.C1799hs r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2414tT.mo373P(android.view.View, a.hs):void");
    }

    @Override // p000a.C1555dG
    /* renamed from: u */
    public final boolean mo1133u(View view, int i, Bundle bundle) {
        switch (this.f7394P) {
            case 3:
                if (i == 1048576) {
                    ((C0485J8) ((AbstractC2691yn) this.f7393N)).m4598z(3);
                    return true;
                }
                return super.mo1133u(view, i, bundle);
            default:
                return super.mo1133u(view, i, bundle);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: v */
    public final void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f7394P) {
            case 1:
                super.mo1134v(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f7393N).isChecked());
                return;
            default:
                super.mo1134v(view, accessibilityEvent);
                return;
        }
    }

    public C2414tT(TextInputLayout textInputLayout) {
        this.f7394P = 4;
        this.f7393N = textInputLayout;
    }
}
