package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p000a.C0610LT;
import p000a.C0851Pt;
import p000a.C1031TL;
import p000a.C1691fn;
import p000a.C1707g5;
import p000a.C2032mF;
import p000a.C2413tS;
import p000a.C2484up;
import p000a.C2492uy;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C2484up {
    @Override // p000a.C2484up
    /* renamed from: N */
    public final C0610LT mo4270N(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // p000a.C2484up
    /* renamed from: P */
    public final C0851Pt mo4271P(Context context, AttributeSet attributeSet) {
        return new C1031TL(context, attributeSet);
    }

    @Override // p000a.C2484up
    /* renamed from: h */
    public final C2413tS mo4273h(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000a.C2484up
    /* renamed from: v */
    public final C1707g5 mo4274v(Context context, AttributeSet attributeSet) {
        return new C2032mF(context, attributeSet);
    }

    @Override // p000a.C2484up
    /* renamed from: z */
    public final C2492uy mo4275z(Context context, AttributeSet attributeSet) {
        return new C1691fn(context, attributeSet);
    }
}
