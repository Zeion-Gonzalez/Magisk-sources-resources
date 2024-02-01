package p000a;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: a.ey */
/* loaded from: classes.dex */
public final class C1646ey implements TransformationMethod {

    /* renamed from: z */
    public final TransformationMethod f5106z;

    public C1646ey(TransformationMethod transformationMethod) {
        this.f5106z = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5106z;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        AbstractC2473ua.m4249z();
        throw null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f5106z;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
