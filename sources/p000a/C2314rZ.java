package p000a;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.rZ */
/* loaded from: classes.dex */
public final class C2314rZ<S> extends AbstractC0649MD {

    /* renamed from: EC */
    public int f7131EC;

    /* renamed from: U8 */
    public C2421tc f7132U8;

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public final void mo279F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7131EC);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7132U8);
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m4003M(), this.f7131EC));
        throw null;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public final void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        if (bundle == null) {
            bundle = this.f7210k;
        }
        this.f7131EC = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC2441tz.m4185I(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7132U8 = (C2421tc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
